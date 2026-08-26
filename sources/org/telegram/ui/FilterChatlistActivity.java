package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class FilterChatlistActivity extends BaseFragment {
    private static final int MAX_NAME_LENGTH = 32;
    private ListAdapter adapter;
    private ArrayList<Long> allowedPeers;
    private int chatsEndRow;
    private int chatsHeaderRow;
    private int chatsSectionRow;
    private int chatsStartRow;
    private ActionBarMenuItem doneButton;
    private float doneButtonAlpha;
    private CrossfadeDrawable doneButtonDrawable;
    private ValueAnimator doneButtonDrawableAnimator;
    private Runnable enableDoneLoading;
    MessagesController.DialogFilter filter;
    private FolderBottomSheet.HeaderCell headerCountCell;
    private HintInnerCell hintCountCell;
    private int hintRow;
    TL_chatlists.TL_exportedChatlistInvite invite;
    private long lastClicked;
    private long lastClickedDialogId;
    private int linkHeaderRow;
    private int linkRow;
    private int linkSectionRow;
    private RecyclerListView listView;
    private Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> onDelete;
    private Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> onEdit;
    private ArrayList<Long> peers;
    private boolean peersChanged;
    private int rowsCount;
    private boolean saving;
    private int savingTitleReqId;
    private ArrayList<Long> selectedPeers;
    private int shiftDp;
    private boolean titleChanged;

    public static class HintInnerCell extends FrameLayout {
        private RLottieImageView imageView;
        private SpoilersTextView subtitleTextView;

        public HintInnerCell(Context context, int i) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(i, 90, 90);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.playAnimation();
            this.imageView.setImportantForAccessibility(2);
            addView(this.imageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, null);
            this.subtitleTextView = spoilersTextView;
            spoilersTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setGravity(17);
            this.subtitleTextView.setLines(2);
            addView(this.subtitleTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        }

        public SpoilersTextView getSubtitleTextView() {
            return this.subtitleTextView;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.subtitleTextView.setText(charSequence);
            this.subtitleTextView.cacheType = z ? 26 : 0;
        }
    }

    public static class InviteLinkCell extends FrameLayout {
        private ActionBarPopupWindow actionBarPopupWindow;
        ButtonsBox buttonsBox;
        private float changeAlpha;
        private ValueAnimator changeAnimator;
        TextView copyButton;
        TextView generateButton;
        private String lastUrl;
        FrameLayout linkBox;
        ImageView optionsIcon;
        BaseFragment parentFragment;
        private float[] point;
        TextView shareButton;
        SimpleTextView spoilerTextView;
        SimpleTextView textView;

        public class ButtonsBox extends FrameLayout {
            private Paint paint;
            private Path path;
            private float[] radii;
            private float t;

            public ButtonsBox(Context context) {
                super(context);
                this.paint = new Paint();
                this.radii = new float[8];
                this.path = new Path();
                setWillNotDraw(false);
                this.paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            }

            private void setRadii(float f, float f2) {
                float[] fArr = this.radii;
                fArr[7] = f;
                fArr[6] = f;
                fArr[1] = f;
                fArr[0] = f;
                fArr[5] = f2;
                fArr[4] = f2;
                fArr[3] = f2;
                fArr[2] = f2;
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.t), getMeasuredHeight());
                setRadii(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.t));
                Path path = this.path;
                float[] fArr = this.radii;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(this.path, this.paint);
                this.path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.t), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                setRadii(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.t), AndroidUtilities.dp(8.0f));
                this.path.addRoundRect(rectF, this.radii, direction);
                canvas.drawPath(this.path, this.paint);
            }

            public void setT(float f) {
                this.t = f;
                invalidate();
            }
        }

        public InviteLinkCell(Context context, BaseFragment baseFragment) {
            super(context);
            this.point = new float[2];
            this.parentFragment = baseFragment;
            FrameLayout frameLayout = new FrameLayout(context);
            this.linkBox = frameLayout;
            int iDp = AndroidUtilities.dp(8.0f);
            int i = Theme.key_graySection;
            int color = Theme.getColor(null, i, false);
            int iBlendOver = Theme.blendOver(Theme.getColor(null, i, false), Theme.getColor(null, Theme.key_listSelector, false));
            frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, iBlendOver, iBlendOver));
            this.linkBox.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 0));
            addView(this.linkBox, LayoutHelper.createFrame(-1, 48.0f, 55, 22.0f, 9.0f, 22.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.spoilerTextView = simpleTextView;
            simpleTextView.setTextSize(16);
            SimpleTextView simpleTextView2 = this.spoilerTextView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            simpleTextView2.setTextColor(Theme.getColor(null, i2, false));
            SpannableString spannableString = new SpannableString("t.me/folder/N3k/dImA/bIo");
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags |= 256;
            spannableString.setSpan(new TextStyleSpan(textStyleRun), 0, spannableString.length(), 33);
            this.spoilerTextView.setText(spannableString);
            this.spoilerTextView.setAlpha(1.0f);
            this.linkBox.addView(this.spoilerTextView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 40.0f, 0.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.textView = simpleTextView3;
            simpleTextView3.setTextSize(16);
            this.textView.setTextColor(Theme.getColor(null, i2, false));
            this.textView.setText(spannableString);
            this.textView.setAlpha(0.0f);
            this.linkBox.addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 40.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.optionsIcon = imageView;
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
            this.optionsIcon.setScaleType(ImageView.ScaleType.CENTER);
            this.optionsIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false), PorterDuff.Mode.SRC_IN));
            this.optionsIcon.setAlpha(0.0f);
            this.optionsIcon.setVisibility(8);
            this.optionsIcon.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.optionsIcon.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 1));
            this.linkBox.addView(this.optionsIcon, LayoutHelper.createFrame(40, 40.0f, 21, 4.0f, 4.0f, 4.0f, 4.0f));
            ButtonsBox buttonsBox = new ButtonsBox(context);
            this.buttonsBox = buttonsBox;
            addView(buttonsBox, LayoutHelper.createFrame(-1, 42.0f, 55, 22.0f, 69.0f, 22.0f, 0.0f));
            TextView textView = new TextView(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i3) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                }
            };
            this.copyButton = textView;
            textView.setGravity(17);
            TextView textView2 = this.copyButton;
            int i3 = Theme.key_featuredStickers_buttonText;
            textView2.setTextColor(Theme.getColor(null, i3, false));
            this.copyButton.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            this.copyButton.setTypeface(AndroidUtilities.bold());
            this.copyButton.setTextSize(14.0f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "..").setSpan(new ColoredImageSpan(context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
            spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
            spannableStringBuilder.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            this.copyButton.setText(spannableStringBuilder);
            this.copyButton.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 2));
            this.copyButton.setAlpha(0.0f);
            this.copyButton.setVisibility(8);
            this.buttonsBox.addView(this.copyButton, LayoutHelper.createFrame(-1, -1, 3));
            TextView textView3 = new TextView(context) {
                @Override
                public void onMeasure(int i4, int i5) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i4) - AndroidUtilities.dp(8.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                }
            };
            this.shareButton = textView3;
            textView3.setGravity(17);
            this.shareButton.setTextColor(Theme.getColor(null, i3, false));
            this.shareButton.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            this.shareButton.setTypeface(AndroidUtilities.bold());
            this.shareButton.setTextSize(14.0f);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "..").setSpan(new ColoredImageSpan(context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
            spannableStringBuilder2.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
            spannableStringBuilder2.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 0);
            this.shareButton.setText(spannableStringBuilder2);
            this.shareButton.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 3));
            this.shareButton.setAlpha(0.0f);
            this.shareButton.setVisibility(8);
            this.buttonsBox.addView(this.shareButton, LayoutHelper.createFrame(-1, -1, 5));
            TextView textView4 = new TextView(context);
            this.generateButton = textView4;
            textView4.setGravity(17);
            this.generateButton.setTextColor(Theme.getColor(null, i3, false));
            this.generateButton.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            this.generateButton.setTypeface(AndroidUtilities.bold());
            this.generateButton.setTextSize(14.0f);
            this.generateButton.setText("Generate Invite Link");
            this.generateButton.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 4));
            this.generateButton.setAlpha(1.0f);
            this.generateButton.setVisibility(0);
            this.buttonsBox.addView(this.generateButton, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void getPointOnScreen(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
            float f = 0.0f;
            float x = 0.0f;
            while (frameLayout != frameLayout2) {
                float y = frameLayout.getY() + f;
                x += frameLayout.getX();
                if (frameLayout instanceof ScrollView) {
                    y -= frameLayout.getScrollY();
                }
                f = y;
                if (!(frameLayout.getParent() instanceof View)) {
                    break;
                }
                frameLayout = (View) frameLayout.getParent();
                if (!(frameLayout instanceof ViewGroup)) {
                    return;
                }
            }
            float paddingLeft = x - frameLayout2.getPaddingLeft();
            float paddingTop = f - frameLayout2.getPaddingTop();
            fArr[0] = paddingLeft;
            fArr[1] = paddingTop;
        }

        public void lambda$new$0(View view) {
            copy();
        }

        public void lambda$new$1() {
            this.linkBox.getBackground().setState(new int[0]);
        }

        public void lambda$new$2(View view) {
            if (this.linkBox.getBackground() instanceof RippleDrawable) {
                this.linkBox.getBackground().setState(new int[]{16842919, 16842910});
                postDelayed(new IntroActivity$$ExternalSyntheticLambda5(this, 23), 180L);
            }
            options();
        }

        public void lambda$new$3(View view) {
            copy();
        }

        public void lambda$new$4(View view) {
            share();
        }

        public void lambda$new$5(View view) {
            generate();
        }

        public void lambda$options$10(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && this.actionBarPopupWindow.isShowing()) {
                this.actionBarPopupWindow.dismiss(true);
            }
        }

        public void lambda$options$7(View view) {
            ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
            editname();
        }

        public void lambda$options$8(View view) {
            ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
            qrcode();
        }

        public void lambda$options$9(View view) {
            ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
            }
            deleteLink();
        }

        public void lambda$setLink$6(ValueAnimator valueAnimator) {
            this.changeAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateChangeAlpha();
        }

        private void updateChangeAlpha() {
            this.buttonsBox.setT(this.changeAlpha);
            this.copyButton.setAlpha(this.changeAlpha);
            this.shareButton.setAlpha(this.changeAlpha);
            this.optionsIcon.setAlpha(this.changeAlpha);
            this.generateButton.setAlpha(1.0f - this.changeAlpha);
            this.textView.setAlpha(this.changeAlpha);
            this.spoilerTextView.setAlpha(1.0f - this.changeAlpha);
        }

        public void copy() {
            String str = this.lastUrl;
            if (str == null) {
                return;
            }
            AndroidUtilities.addToClipboard(str);
            ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(this.parentFragment), R.string.LinkCopied);
        }

        public void deleteLink() {
        }

        public void editname() {
        }

        public void generate() {
        }

        public boolean isRevoked() {
            return false;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
        }

        public void options() {
            if (this.actionBarPopupWindow != null || this.lastUrl == null) {
                return;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), null, true, false);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.EditName), R.drawable.msg_edit);
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 5));
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getContext(), null, false, false);
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode);
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 6));
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getContext(), null, false, true);
            actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete);
            int i = Theme.key_text_RedRegular;
            actionBarMenuSubItem3.setColors(Theme.getColor(null, i, false), Theme.getColor(null, i, false));
            actionBarMenuSubItem3.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i, false)));
            actionBarMenuSubItem3.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda2(this, 7));
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
            final FrameLayout overlayContainerView = ((ActionBarLayout) this.parentFragment.getParentLayout()).getOverlayContainerView();
            if (overlayContainerView != null) {
                getPointOnScreen(this.linkBox, overlayContainerView, this.point);
                float paddingTop = this.point[1];
                final View view = new View(getContext()) {
                    @Override
                    public void onDraw(Canvas canvas) {
                        canvas.drawColor(855638016);
                        InviteLinkCell inviteLinkCell = InviteLinkCell.this;
                        inviteLinkCell.getPointOnScreen(inviteLinkCell.linkBox, overlayContainerView, inviteLinkCell.point);
                        canvas.save();
                        float y = InviteLinkCell.this.linkBox.getY() + ((View) InviteLinkCell.this.linkBox.getParent()).getY();
                        if (y < 1.0f) {
                            canvas.clipRect(0.0f, (InviteLinkCell.this.point[1] - y) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                        }
                        canvas.translate(InviteLinkCell.this.point[0], InviteLinkCell.this.point[1]);
                        InviteLinkCell.this.linkBox.draw(canvas);
                        canvas.restore();
                    }
                };
                final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        view.invalidate();
                        return true;
                    }
                };
                overlayContainerView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                overlayContainerView.addView(view, LayoutHelper.createFrame(-1, -1.0f));
                float paddingLeft = 0.0f;
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(150L);
                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
                this.actionBarPopupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        InviteLinkCell.this.actionBarPopupWindow = null;
                        view.animate().cancel();
                        view.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (view.getParent() != null) {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    overlayContainerView.removeView(view);
                                }
                                overlayContainerView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                            }
                        });
                    }
                });
                this.actionBarPopupWindow.setOutsideTouchable(true);
                this.actionBarPopupWindow.setFocusable(true);
                this.actionBarPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
                this.actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                this.actionBarPopupWindow.setInputMethodMode(2);
                this.actionBarPopupWindow.setSoftInputMode(0);
                actionBarPopupWindowLayout.setDispatchKeyEventListener(new BoostsActivity$$ExternalSyntheticLambda4(this, 22));
                if (AndroidUtilities.isTablet()) {
                    paddingTop += overlayContainerView.getPaddingTop();
                    paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
                }
                this.actionBarPopupWindow.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + this.linkBox.getMeasuredHeight()));
            }
        }

        public void qrcode() {
            if (this.lastUrl == null) {
                return;
            }
            QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.lastUrl, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
            qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
            qRCodeBottomSheet.show();
        }

        public void revoke(boolean z) {
        }

        public void setLink(final String str, boolean z) {
            this.lastUrl = str;
            if (str != null) {
                if (str.startsWith("http://")) {
                    str = str.substring(7);
                }
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
            }
            this.textView.setText(str);
            if (this.changeAlpha != (str != null ? 1 : 0)) {
                ValueAnimator valueAnimator = this.changeAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.changeAnimator = null;
                }
                if (z) {
                    this.generateButton.setVisibility(0);
                    this.optionsIcon.setVisibility(0);
                    this.copyButton.setVisibility(0);
                    this.shareButton.setVisibility(0);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.changeAlpha, str != null ? 1.0f : 0.0f);
                    this.changeAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 6));
                    this.changeAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (str == null) {
                                InviteLinkCell.this.generateButton.setVisibility(0);
                                InviteLinkCell.this.optionsIcon.setVisibility(8);
                                InviteLinkCell.this.copyButton.setVisibility(8);
                                InviteLinkCell.this.shareButton.setVisibility(8);
                                return;
                            }
                            InviteLinkCell.this.generateButton.setVisibility(8);
                            InviteLinkCell.this.optionsIcon.setVisibility(0);
                            InviteLinkCell.this.copyButton.setVisibility(0);
                            InviteLinkCell.this.shareButton.setVisibility(0);
                        }
                    });
                    this.changeAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.changeAnimator.setDuration(320L);
                    this.changeAnimator.start();
                    return;
                }
                this.changeAlpha = str != null ? 1.0f : 0.0f;
                updateChangeAlpha();
                if (str == null) {
                    this.generateButton.setVisibility(0);
                    this.optionsIcon.setVisibility(8);
                    this.copyButton.setVisibility(8);
                    this.shareButton.setVisibility(8);
                    return;
                }
                this.generateButton.setVisibility(8);
                this.optionsIcon.setVisibility(0);
                this.copyButton.setVisibility(0);
                this.shareButton.setVisibility(0);
            }
        }

        public void share() {
            if (this.lastUrl == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", this.lastUrl);
                this.parentFragment.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {

        public class AnonymousClass1 extends InviteLinkCell {
            public AnonymousClass1(Context context, BaseFragment baseFragment) {
                super(context, baseFragment);
            }

            public void lambda$deleteLink$2(AlertDialog alertDialog) {
                alertDialog.dismiss();
                if (FilterChatlistActivity.this.onDelete != null) {
                    FilterChatlistActivity.this.onDelete.run(FilterChatlistActivity.this.invite);
                }
                FilterChatlistActivity.this.finishFragment();
            }

            public void lambda$deleteLink$3(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(16, this, alertDialog));
            }

            public static boolean lambda$editname$5(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
                AndroidUtilities.hideKeyboard(textView);
                builder.create().getButton(-1).callOnClick();
                return false;
            }

            public void lambda$editname$6(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                builder.getDismissRunnable().run();
                FilterChatlistActivity.this.invite.title = editTextBoldCursor.getText().toString();
                FilterChatlistActivity.this.titleChanged = true;
                FilterChatlistActivity.this.updateActionBarTitle(true);
                FilterChatlistActivity.this.saveTitle();
            }

            public static void lambda$editname$7(EditTextBoldCursor editTextBoldCursor) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }

            public static void lambda$editname$8(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda119(1, editTextBoldCursor));
            }

            public void lambda$revoke$0(boolean z, AlertDialog alertDialog) {
                FilterChatlistActivity.this.invite.revoked = z;
                alertDialog.dismiss();
                if (z) {
                    FilterChatlistActivity.this.finishFragment();
                }
            }

            public void lambda$revoke$1(boolean z, AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda28(this, z, alertDialog, 6));
            }

            @Override
            public void deleteLink() {
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                tL_inputChatlistDialogFilter.filter_id = filterChatlistActivity.filter.id;
                tL_chatlists_deleteExportedInvite.slug = filterChatlistActivity.getSlug();
                AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 180L);
                FilterChatlistActivity.this.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new IntroActivity$$ExternalSyntheticLambda6(3, this, alertDialog));
            }

            @Override
            public void editname() {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = FilterChatlistActivity.this.invite;
                if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null) {
                    return;
                }
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(getContext()));
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
                builder.setDialogButtonColorKey(Theme.key_dialogButton);
                builder.setTitle(LocaleController.getString(R.string.FilterInviteEditName));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda3(1, editTextBoldCursor));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i = Theme.key_dialogTextBlack;
                editTextBoldCursor.setTextColor(Theme.getColor(null, i, false));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHint(FilterChatlistActivity.this.filter.name);
                editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_dialogTextHint, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, i, false));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda4(builder, 1));
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    boolean ignoreTextChange;

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignoreTextChange && editable.length() > 32) {
                            this.ignoreTextChange = true;
                            editable.delete(32, editable.length());
                            AndroidUtilities.shakeView(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            this.ignoreTextChange = false;
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }
                });
                if (!TextUtils.isEmpty(FilterChatlistActivity.this.invite.title)) {
                    editTextBoldCursor.setText(FilterChatlistActivity.this.invite.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder.setPositiveButton(LocaleController.getString(R.string.Save), new WearAuthSheet$$ExternalSyntheticLambda5(this, editTextBoldCursor, builder, 6));
                AlertDialog alertDialogCreate = builder.create();
                int i2 = 1;
                alertDialogCreate.setOnShowListener(new ChatRightsEditActivity$$ExternalSyntheticLambda16(editTextBoldCursor, i2));
                alertDialogCreate.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda7(i2, editTextBoldCursor));
                alertDialogCreate.show();
                alertDialogCreate.setTextColor(Theme.getColor(null, i, false));
                editTextBoldCursor.requestFocus();
            }

            @Override
            public boolean isRevoked() {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = FilterChatlistActivity.this.invite;
                return tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.revoked;
            }

            @Override
            public void revoke(boolean z) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = FilterChatlistActivity.this.invite;
                if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null) {
                    return;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                tL_inputChatlistDialogFilter.filter_id = filterChatlistActivity.filter.id;
                tL_chatlists_editExportedInvite.revoked = z;
                tL_chatlists_editExportedInvite.slug = filterChatlistActivity.getSlug();
                AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 180L);
                FilterChatlistActivity.this.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new LinkManager$1$$ExternalSyntheticLambda2(this, z, alertDialog, 2));
            }
        }

        public ListAdapter() {
        }

        @Override
        public int getItemCount() {
            return FilterChatlistActivity.this.rowsCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == FilterChatlistActivity.this.chatsSectionRow || i == FilterChatlistActivity.this.linkSectionRow) {
                return 2;
            }
            if (i == FilterChatlistActivity.this.linkRow) {
                return 3;
            }
            if (i < FilterChatlistActivity.this.chatsStartRow || i >= FilterChatlistActivity.this.chatsEndRow) {
                return (i == FilterChatlistActivity.this.chatsHeaderRow || i == FilterChatlistActivity.this.linkHeaderRow) ? 5 : 0;
            }
            return 4;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 4;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String string;
            Object obj;
            Object obj2;
            TLRPC.User user;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                FilterChatlistActivity.this.hintCountCell = (HintInnerCell) viewHolder.itemView;
                FilterChatlistActivity.this.updateHintCell(false);
                return;
            }
            if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(FilterChatlistActivity.this.getContext(), i == FilterChatlistActivity.this.chatsSectionRow ? R.drawable.greydivider_bottom : R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                if (i != FilterChatlistActivity.this.chatsSectionRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    return;
                }
                textInfoPrivacyCell.setFixedSize(0);
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                if (filterChatlistActivity.invite == null || filterChatlistActivity.allowedPeers.isEmpty()) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                } else {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                }
            }
            String userName = null;
            if (itemViewType == 3) {
                InviteLinkCell inviteLinkCell = (InviteLinkCell) viewHolder.itemView;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = FilterChatlistActivity.this.invite;
                inviteLinkCell.setLink(tL_exportedChatlistInvite != null ? tL_exportedChatlistInvite.url : null, false);
                return;
            }
            if (itemViewType != 4) {
                if (itemViewType == 5) {
                    FolderBottomSheet.HeaderCell headerCell = (FolderBottomSheet.HeaderCell) viewHolder.itemView;
                    if (headerCell == FilterChatlistActivity.this.headerCountCell) {
                        FilterChatlistActivity.this.headerCountCell = null;
                    }
                    if (i == FilterChatlistActivity.this.linkHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.InviteLink), false);
                        headerCell.setAction("", null);
                        return;
                    }
                    FilterChatlistActivity.this.headerCountCell = headerCell;
                    FilterChatlistActivity filterChatlistActivity2 = FilterChatlistActivity.this;
                    if (filterChatlistActivity2.invite != null && !filterChatlistActivity2.allowedPeers.isEmpty()) {
                        FilterChatlistActivity.this.updateHeaderCell(false);
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                        headerCell.setAction("", null);
                        return;
                    }
                }
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            Long l = (Long) FilterChatlistActivity.this.peers.get(i - FilterChatlistActivity.this.chatsStartRow);
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                user = FilterChatlistActivity.this.getMessagesController().getUser(l);
                if (user != null) {
                    obj = user;
                    userName = UserObject.getUserName(user);
                    string = null;
                    obj2 = user;
                } else {
                    obj = chat;
                    obj = user;
                    string = null;
                    obj2 = obj;
                }
            } else {
                chat = FilterChatlistActivity.this.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    userName = chat.title;
                    if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            obj = chat;
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                            obj2 = chat;
                        } else {
                            obj = chat;
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                            obj2 = chat;
                        }
                    } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        obj = chat;
                        string = LocaleController.getString("ChannelPublic");
                        obj2 = chat;
                    } else {
                        obj = chat;
                        string = LocaleController.getString("MegaPublic");
                        obj2 = chat;
                    }
                } else {
                    obj = chat;
                    obj = user;
                    string = null;
                    obj2 = obj;
                }
            }
            if (FilterChatlistActivity.this.allowedPeers.contains(l)) {
                groupCreateUserCell.setForbiddenCheck(false);
                groupCreateUserCell.setChecked(FilterChatlistActivity.this.selectedPeers.contains(l), false);
            } else {
                groupCreateUserCell.setForbiddenCheck(true);
                groupCreateUserCell.setChecked(false, false);
                if (obj2 instanceof TLRPC.User) {
                    string = ((TLRPC.User) obj2).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
                } else if (obj2 instanceof TLRPC.Chat) {
                    string = ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj2) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
                }
            }
            groupCreateUserCell.setTag(l);
            groupCreateUserCell.setObject(obj2, userName, string);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            if (i == 0) {
                headerCell = new HintInnerCell(FilterChatlistActivity.this.getContext(), R.raw.folder_share);
            } else if (i == 2) {
                headerCell = new TextInfoPrivacyCell(FilterChatlistActivity.this.getContext(), 24, null);
            } else if (i == 3) {
                headerCell = new AnonymousClass1(FilterChatlistActivity.this.getContext(), FilterChatlistActivity.this);
                headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 4) {
                GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(1, 0, FilterChatlistActivity.this.getContext(), null, false, false);
                groupCreateUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                headerCell = groupCreateUserCell;
            } else if (i == 5) {
                headerCell = new FolderBottomSheet.HeaderCell(FilterChatlistActivity.this.getContext());
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                headerCell = null;
            }
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public FilterChatlistActivity(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.selectedPeers = new ArrayList<>();
        this.allowedPeers = new ArrayList<>();
        this.peers = new ArrayList<>();
        this.shiftDp = -5;
        this.saving = false;
        this.rowsCount = 0;
        this.hintRow = -1;
        this.linkRow = -1;
        this.linkHeaderRow = -1;
        this.linkSectionRow = -1;
        this.chatsHeaderRow = -1;
        this.chatsStartRow = -1;
        this.chatsEndRow = -1;
        this.chatsSectionRow = -1;
        this.enableDoneLoading = new IntroActivity$$ExternalSyntheticLambda5(this, 22);
        this.doneButtonAlpha = 1.0f;
        this.filter = dialogFilter;
        this.invite = tL_exportedChatlistInvite;
    }

    public boolean checkDiscard(boolean z) {
        if (this.selectedPeers.isEmpty() || !this.peersChanged) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.UnsavedChangesMessage));
            final int i = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final FilterChatlistActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$checkDiscard$9(alertDialog, i2);
                            break;
                        default:
                            this.f$0.lambda$checkDiscard$10(alertDialog, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener(this) {
                public final FilterChatlistActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$checkDiscard$9(alertDialog, i3);
                            break;
                        default:
                            this.f$0.lambda$checkDiscard$10(alertDialog, i3);
                            break;
                    }
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    private void checkDoneButton() {
        float f;
        boolean z = this.peersChanged;
        boolean zIsEmpty = this.selectedPeers.isEmpty();
        if (z) {
            f = !zIsEmpty ? 1.0f : 0.5f;
        } else {
            f = 0.0f;
        }
        if (Math.abs(this.doneButtonAlpha - f) > 0.1f) {
            this.doneButton.clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.doneButton.animate();
            this.doneButtonAlpha = f;
            viewPropertyAnimatorAnimate.alpha(f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        }
    }

    private void checkPeersChanged() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.peersChanged) {
            return;
        }
        boolean z = true;
        boolean z2 = this.selectedPeers.size() != this.invite.peers.size();
        if (!z2) {
            int i = 0;
            while (true) {
                if (i >= this.invite.peers.size()) {
                    z = z2;
                    break;
                } else {
                    if (!this.selectedPeers.contains(Long.valueOf(DialogObject.getPeerDialogId(this.invite.peers.get(i))))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            z = z2;
            break;
        }
        if (z) {
            return;
        }
        this.peersChanged = false;
        checkDoneButton();
    }

    private void deselectAll(FolderBottomSheet.HeaderCell headerCell, boolean z) {
        this.selectedPeers.clear();
        if (!z) {
            this.selectedPeers.addAll(this.allowedPeers.subList(0, Math.min(getMaxChats(), this.allowedPeers.size())));
        }
        headerCell.setAction(LocaleController.getString(this.selectedPeers.size() >= Math.min(getMaxChats(), this.allowedPeers.size()) ? R.string.DeselectAll : R.string.SelectAll), new PhotoViewer$$ExternalSyntheticLambda28(this, headerCell, z, 11));
        this.peersChanged = true;
        checkPeersChanged();
        checkDoneButton();
        updateHeaderCell(true);
        updateHintCell(true);
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ArrayList<Long> arrayList = this.selectedPeers;
                    Long l = (Long) tag;
                    l.getClass();
                    ((GroupCreateUserCell) childAt).setChecked(arrayList.contains(l), true);
                }
            }
        }
    }

    private int getMaxChats() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public String getSlug() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public void lambda$checkDiscard$10(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$9(AlertDialog alertDialog, int i) {
        save();
    }

    public void lambda$createView$0(View view, int i) {
        String string;
        String string2;
        if (getParentActivity() != null && (view instanceof GroupCreateUserCell)) {
            Long l = this.peers.get(i - this.chatsStartRow);
            long jLongValue = l.longValue();
            if (this.selectedPeers.contains(l)) {
                this.selectedPeers.remove(l);
                this.peersChanged = true;
                checkDoneButton();
                ((GroupCreateUserCell) view).setChecked(false, true);
            } else {
                if (!this.allowedPeers.contains(l)) {
                    int i2 = -this.shiftDp;
                    this.shiftDp = i2;
                    AndroidUtilities.shakeViewSpring(view, i2);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList = new ArrayList();
                    if (jLongValue >= 0) {
                        arrayList.add(getMessagesController().getUser(l));
                        TLRPC.User user = getMessagesController().getUser(l);
                        string2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-jLongValue));
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast);
                        } else {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        }
                        arrayList.add(chat);
                        string2 = string;
                    }
                    if (this.lastClickedDialogId != jLongValue || System.currentTimeMillis() - this.lastClicked > 1500) {
                        this.lastClickedDialogId = jLongValue;
                        this.lastClicked = System.currentTimeMillis();
                        BulletinFactory.of(this).createChatsBulletin(arrayList, string2, null).show();
                        return;
                    }
                    return;
                }
                if (this.selectedPeers.size() + 1 > getMaxChats()) {
                    showDialog(new LimitReachedBottomSheet(4, this, getContext(), this.currentAccount, null));
                    return;
                }
                this.selectedPeers.add(l);
                this.peersChanged = true;
                checkDoneButton();
                ((GroupCreateUserCell) view).setChecked(true, true);
            }
            checkPeersChanged();
            updateHeaderCell(true);
            updateHintCell(true);
        }
    }

    public void lambda$deselectAll$6(FolderBottomSheet.HeaderCell headerCell, boolean z) {
        deselectAll(headerCell, !z);
    }

    public void lambda$new$7() {
        updateDoneProgress(true);
    }

    public void lambda$save$1(TLRPC.TL_error tL_error) {
        updateDoneProgress(false);
        this.saving = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            showDialog(new LimitReachedBottomSheet(12, this, getContext(), this.currentAccount, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            showDialog(new LimitReachedBottomSheet(4, this, getContext(), this.currentAccount, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            finishFragment();
        } else {
            showDialog(new LimitReachedBottomSheet(13, this, getContext(), this.currentAccount, null));
        }
    }

    public void lambda$save$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FilterChatlistActivity$$ExternalSyntheticLambda3(this, tL_error, 1));
    }

    public void lambda$saveTitle$3(TLRPC.TL_error tL_error) {
        this.savingTitleReqId = 0;
        if (tL_error == null) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.FilterInviteNameEdited, BulletinFactory.of(this), R.raw.contact_check);
        }
    }

    public void lambda$saveTitle$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FilterChatlistActivity$$ExternalSyntheticLambda3(this, tL_error, 0));
    }

    public void lambda$updateDoneProgress$8(ValueAnimator valueAnimator) {
        this.doneButtonDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.doneButtonDrawable.invalidateSelf();
    }

    public void lambda$updateHeaderCell$5(boolean z) {
        deselectAll(this.headerCountCell, z);
    }

    public void save() {
        if (this.invite == null || this.saving || !this.peersChanged) {
            return;
        }
        updateDoneProgress(true);
        this.saving = true;
        this.invite.peers.clear();
        for (int i = 0; i < this.selectedPeers.size(); i++) {
            this.invite.peers.add(getMessagesController().getPeer(this.selectedPeers.get(i).longValue()));
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.filter.id;
        tL_chatlists_editExportedInvite.slug = getSlug();
        tL_chatlists_editExportedInvite.revoked = this.invite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i2 = 0; i2 < this.selectedPeers.size(); i2++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(this.selectedPeers.get(i2).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new FilterChatlistActivity$$ExternalSyntheticLambda8(this, 0));
        Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> callback = this.onEdit;
        if (callback != null) {
            callback.run(this.invite);
        }
    }

    public void saveTitle() {
        if (this.savingTitleReqId != 0) {
            getConnectionsManager().cancelRequest(this.savingTitleReqId, true);
            this.savingTitleReqId = 0;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.filter.id;
        tL_chatlists_editExportedInvite.slug = getSlug();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 2;
        tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
        this.savingTitleReqId = getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new FilterChatlistActivity$$ExternalSyntheticLambda8(this, 1));
        Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> callback = this.onEdit;
        if (callback != null) {
            callback.run(this.invite);
        }
    }

    public void shakeHeader() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) == this.chatsHeaderRow && (childAt instanceof FolderBottomSheet.HeaderCell)) {
                int i2 = -this.shiftDp;
                this.shiftDp = i2;
                AndroidUtilities.shakeViewSpring(childAt, i2);
                return;
            }
        }
    }

    public void updateActionBarTitle(boolean z) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : this.invite.title;
        if (z) {
            this.actionBar.setTitleAnimated(string, false, 220L);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    private void updateDoneProgress(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.getProgress(), z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 5));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public void updateHeaderCell(boolean z) {
        FolderBottomSheet.HeaderCell headerCell = this.headerCountCell;
        if (headerCell == null) {
            return;
        }
        headerCell.setText(this.selectedPeers.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", this.selectedPeers.size(), new Object[0]), z);
        if (this.allowedPeers.size() > 1) {
            boolean z2 = this.selectedPeers.size() >= Math.min(getMaxChats(), this.allowedPeers.size());
            this.headerCountCell.setAction(LocaleController.getString(!z2 ? R.string.SelectAll : R.string.DeselectAll), new PollItemMenu$$ExternalSyntheticLambda0(this, z2, 6));
        } else {
            this.headerCountCell.setAction("", null);
        }
        if (z) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.headerCountCell.textView.getText()) + ", " + ((Object) this.headerCountCell.actionTextView.getText()));
        }
    }

    public void updateHintCell(boolean z) {
        HintInnerCell hintInnerCell = this.hintCountCell;
        if (hintInnerCell == null) {
            return;
        }
        if (this.invite == null) {
            hintInnerCell.setText(LocaleController.getString(R.string.FilterInviteHeaderNo), false);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = hintInnerCell.getSubtitleTextView().getPaint().getFontMetricsInt();
        this.hintCountCell.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.selectedPeers.size(), MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.filter.name, fontMetricsInt, false), this.filter.entities, fontMetricsInt))), this.filter.title_noanimate);
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        updateActionBarTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (FilterChatlistActivity.this.checkDiscard(true)) {
                        FilterChatlistActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    if (Math.abs(FilterChatlistActivity.this.doneButtonAlpha - 1.0f) < 0.1f) {
                        FilterChatlistActivity.this.save();
                    } else if (Math.abs(FilterChatlistActivity.this.doneButtonAlpha - 0.5f) < 0.1f) {
                        FilterChatlistActivity.this.shakeHeader();
                    }
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        checkDoneButton();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean requestFocus(int i2, Rect rect) {
                return false;
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 14));
        getMessagesController().updateFilterDialogs(this.filter);
        this.peers.clear();
        if (this.invite != null) {
            int iM = 0;
            while (iM < this.invite.peers.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(this.invite.peers.get(iM));
                this.peers.add(Long.valueOf(peerDialogId));
                this.selectedPeers.add(Long.valueOf(peerDialogId));
                iM = MessagesController$$ExternalSyntheticOutline2.m(peerDialogId, this.allowedPeers, iM, 1);
            }
        }
        for (int i2 = 0; i2 < this.filter.dialogs.size(); i2++) {
            TLRPC.Dialog dialog = this.filter.dialogs.get(i2);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.id) && !this.peers.contains(Long.valueOf(dialog.id))) {
                long j = dialog.id;
                boolean zCanAddToFolder = j < 0;
                if (j < 0) {
                    zCanAddToFolder = FilterCreateActivity.canAddToFolder(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (zCanAddToFolder) {
                    this.peers.add(Long.valueOf(dialog.id));
                    this.allowedPeers.add(Long.valueOf(dialog.id));
                }
            }
        }
        for (int i3 = 0; i3 < this.filter.dialogs.size(); i3++) {
            TLRPC.Dialog dialog2 = this.filter.dialogs.get(i3);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.id) && !this.peers.contains(Long.valueOf(dialog2.id)) && !this.allowedPeers.contains(Long.valueOf(dialog2.id))) {
                this.peers.add(Long.valueOf(dialog2.id));
            }
        }
        updateRows();
        return this.fragmentView;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.savingTitleReqId != 0) {
            getConnectionsManager().cancelRequest(this.savingTitleReqId, true);
            this.savingTitleReqId = 0;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public void setOnDelete(Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> callback) {
        this.onDelete = callback;
    }

    public void setOnEdit(Utilities.Callback<TL_chatlists.TL_exportedChatlistInvite> callback) {
        this.onEdit = callback;
    }

    public void updateRows() {
        this.rowsCount = 1;
        this.hintRow = 0;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite != null) {
            this.linkHeaderRow = 1;
            this.linkRow = 2;
            this.rowsCount = 4;
            this.linkSectionRow = 3;
        } else {
            this.linkHeaderRow = -1;
            this.linkRow = -1;
            this.linkSectionRow = -1;
        }
        if (tL_exportedChatlistInvite == null && this.peers.isEmpty()) {
            this.chatsHeaderRow = -1;
            this.chatsStartRow = -1;
            this.chatsEndRow = -1;
            this.chatsSectionRow = -1;
        } else {
            int i = this.rowsCount;
            int i2 = i + 1;
            this.chatsHeaderRow = i;
            int i3 = i + 2;
            this.rowsCount = i3;
            this.chatsStartRow = i2;
            int size = (this.peers.size() - 1) + i3;
            this.chatsEndRow = size;
            this.rowsCount = size + 1;
            this.chatsSectionRow = size;
        }
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }
}
