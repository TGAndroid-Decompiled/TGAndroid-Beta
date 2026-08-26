package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public class PhotoViewerCaptionEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    float animationProgress;
    private NumberTextView captionLimitView;
    private float chatActivityEnterViewAnimateFromTop;
    private Drawable checkDrawable;
    private int codePointCount;
    public int currentAccount;
    private PhotoViewerCaptionEnterViewDelegate delegate;
    private final ImageView doneButton;
    private Drawable doneDrawable;
    private ImageView emojiButton;
    private ReplaceableIconDrawable emojiIconDrawable;
    private int emojiPadding;
    private EmojiView emojiView;
    private boolean forceFloatingEmoji;
    private boolean innerTextChange;
    private boolean isInitLineCount;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    int lastShow;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private String lengthText;
    private TextPaint lengthTextPaint;
    private int lineCount;
    private EditTextCaption messageEditText;
    ValueAnimator messageEditTextAnimator;
    private int messageEditTextPredrawHeigth;
    private int messageEditTextPredrawScrollY;
    float offset;
    Paint paint;
    private boolean popupAnimating;
    private final Theme.ResourcesProvider resourcesProvider;
    private ValueAnimator sendButtonColorAnimator;
    boolean sendButtonEnabled;
    private float sendButtonEnabledProgress;
    private boolean shouldAnimateEditTextWithBounds;
    private SizeNotifierFrameLayoutPhoto sizeNotifierLayout;
    ValueAnimator topBackgroundAnimator;
    private View windowView;

    public class AnonymousClass2 implements TextWatcher {
        boolean heightShouldBeChanged;
        boolean processChange = false;
        final SizeNotifierFrameLayoutPhoto val$parent;
        final PhotoViewer val$photoViewer;

        public AnonymousClass2(PhotoViewer photoViewer, SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto) {
            this.val$photoViewer = photoViewer;
            this.val$parent = sizeNotifierFrameLayoutPhoto;
        }

        public void lambda$afterTextChanged$0(ValueAnimator valueAnimator) {
            PhotoViewerCaptionEnterView.this.sendButtonEnabledProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int themedColor = PhotoViewerCaptionEnterView.this.getThemedColor(Theme.key_dialogFloatingIcon);
            Theme.setDrawableColor(ColorUtils.setAlphaComponent(themedColor, (int) (((PhotoViewerCaptionEnterView.this.sendButtonEnabledProgress * 0.42f) + 0.58f) * Color.alpha(themedColor))), PhotoViewerCaptionEnterView.this.checkDrawable);
            PhotoViewerCaptionEnterView.this.doneButton.invalidate();
        }

        @Override
        public void afterTextChanged(Editable editable) {
            boolean z;
            PhotoViewerCaptionEnterView photoViewerCaptionEnterView;
            boolean z2;
            float f;
            int captionMaxLengthLimit;
            int captionMaxLengthLimit2 = MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).getCaptionMaxLengthLimit() - PhotoViewerCaptionEnterView.this.messageEditText.length();
            if (captionMaxLengthLimit2 <= 128) {
                PhotoViewerCaptionEnterView.this.lengthText = String.format("%d", Integer.valueOf(captionMaxLengthLimit2));
            } else {
                PhotoViewerCaptionEnterView.this.lengthText = null;
            }
            PhotoViewerCaptionEnterView.this.invalidate();
            if (!PhotoViewerCaptionEnterView.this.innerTextChange && this.processChange) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji(editable, PhotoViewerCaptionEnterView.this.messageEditText.getPaint().getFontMetricsInt(), false);
                this.processChange = false;
            }
            PhotoViewerCaptionEnterView.this.codePointCount = Character.codePointCount(editable, 0, editable.length());
            if (MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).getCaptionMaxLengthLimit() > 0 && (captionMaxLengthLimit = MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).getCaptionMaxLengthLimit() - PhotoViewerCaptionEnterView.this.codePointCount) <= 100) {
                if (captionMaxLengthLimit < -9999) {
                    captionMaxLengthLimit = -9999;
                }
                PhotoViewerCaptionEnterView.this.captionLimitView.setNumber(captionMaxLengthLimit, PhotoViewerCaptionEnterView.this.captionLimitView.getVisibility() == 0);
                if (PhotoViewerCaptionEnterView.this.captionLimitView.getVisibility() != 0) {
                    PhotoViewerCaptionEnterView.this.captionLimitView.setVisibility(0);
                    PhotoViewerCaptionEnterView.this.captionLimitView.setAlpha(0.0f);
                    PhotoViewerCaptionEnterView.this.captionLimitView.setScaleX(0.5f);
                    PhotoViewerCaptionEnterView.this.captionLimitView.setScaleY(0.5f);
                }
                PhotoViewerCaptionEnterView.this.captionLimitView.animate().setListener(null).cancel();
                PhotoViewerCaptionEnterView.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (captionMaxLengthLimit < 0) {
                    PhotoViewerCaptionEnterView.this.captionLimitView.setTextColor(-1280137);
                    z = false;
                } else {
                    PhotoViewerCaptionEnterView.this.captionLimitView.setTextColor(-1);
                }
                photoViewerCaptionEnterView = PhotoViewerCaptionEnterView.this;
                if (photoViewerCaptionEnterView.sendButtonEnabled != z) {
                    photoViewerCaptionEnterView.sendButtonEnabled = z;
                    if (photoViewerCaptionEnterView.sendButtonColorAnimator != null) {
                        PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.cancel();
                    }
                    PhotoViewerCaptionEnterView photoViewerCaptionEnterView2 = PhotoViewerCaptionEnterView.this;
                    z2 = photoViewerCaptionEnterView2.sendButtonEnabled;
                    if (z2) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    photoViewerCaptionEnterView2.sendButtonColorAnimator = ValueAnimator.ofFloat(f, z2 ? 1.0f : 0.0f);
                    PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 10));
                    PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.setDuration(150L).start();
                }
                if (this.val$photoViewer.getParentAlert() != null || this.val$photoViewer.getParentAlert().captionLimitBulletinShown || MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).premiumFeaturesBlocked() || UserConfig.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).isPremium() || PhotoViewerCaptionEnterView.this.codePointCount <= MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).captionLengthLimitDefault || PhotoViewerCaptionEnterView.this.codePointCount >= MessagesController.getInstance(PhotoViewerCaptionEnterView.this.currentAccount).captionLengthLimitPremium) {
                    return;
                }
                this.val$photoViewer.getParentAlert().captionLimitBulletinShown = true;
                if (this.heightShouldBeChanged) {
                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(15, this.val$photoViewer, this.val$parent), 300L);
                    return;
                } else {
                    this.val$photoViewer.showCaptionLimitBulletin(this.val$parent);
                    return;
                }
            }
            PhotoViewerCaptionEnterView.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewerCaptionEnterView.this.captionLimitView.setVisibility(8);
                }
            });
            z = true;
            photoViewerCaptionEnterView = PhotoViewerCaptionEnterView.this;
            if (photoViewerCaptionEnterView.sendButtonEnabled != z) {
                photoViewerCaptionEnterView.sendButtonEnabled = z;
                if (photoViewerCaptionEnterView.sendButtonColorAnimator != null) {
                    PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.cancel();
                }
                PhotoViewerCaptionEnterView photoViewerCaptionEnterView3 = PhotoViewerCaptionEnterView.this;
                z2 = photoViewerCaptionEnterView3.sendButtonEnabled;
                if (z2) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                photoViewerCaptionEnterView3.sendButtonColorAnimator = ValueAnimator.ofFloat(f, z2 ? 1.0f : 0.0f);
                PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 10));
                PhotoViewerCaptionEnterView.this.sendButtonColorAnimator.setDuration(150L).start();
            }
            if (this.val$photoViewer.getParentAlert() != null) {
            }
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PhotoViewerCaptionEnterView.this.lineCount != PhotoViewerCaptionEnterView.this.messageEditText.getLineCount()) {
                this.heightShouldBeChanged = (PhotoViewerCaptionEnterView.this.messageEditText.getLineCount() >= 4) != (PhotoViewerCaptionEnterView.this.lineCount >= 4);
                if (!PhotoViewerCaptionEnterView.this.isInitLineCount && PhotoViewerCaptionEnterView.this.messageEditText.getMeasuredWidth() > 0) {
                    PhotoViewerCaptionEnterView photoViewerCaptionEnterView = PhotoViewerCaptionEnterView.this;
                    photoViewerCaptionEnterView.onLineCountChanged(photoViewerCaptionEnterView.lineCount, PhotoViewerCaptionEnterView.this.messageEditText.getLineCount());
                }
                PhotoViewerCaptionEnterView photoViewerCaptionEnterView2 = PhotoViewerCaptionEnterView.this;
                photoViewerCaptionEnterView2.lineCount = photoViewerCaptionEnterView2.messageEditText.getLineCount();
            } else {
                this.heightShouldBeChanged = false;
            }
            if (PhotoViewerCaptionEnterView.this.innerTextChange) {
                return;
            }
            if (PhotoViewerCaptionEnterView.this.delegate != null) {
                PhotoViewerCaptionEnterView.this.delegate.onTextChanged(charSequence);
            }
            if (i3 - i2 > 1) {
                this.processChange = true;
            }
        }
    }

    public class DarkTheme implements Theme.ResourcesProvider {
        private DarkTheme() {
        }

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i, i2, f, f2);
        }

        @Override
        public ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public int getColor(int i) {
            if (i == Theme.key_dialogBackground) {
                return -14803426;
            }
            if (i == Theme.key_windowBackgroundWhite) {
                return -15198183;
            }
            if (i == Theme.key_windowBackgroundWhiteBlackText) {
                return -1;
            }
            if (i == Theme.key_chat_emojiPanelEmptyText) {
                return -8553090;
            }
            if (i == Theme.key_progressCircle) {
                return -10177027;
            }
            if (i == Theme.key_chat_emojiSearchIcon) {
                return -9211020;
            }
            if (i == Theme.key_chat_emojiPanelStickerPackSelector || i == Theme.key_chat_emojiSearchBackground) {
                return 181267199;
            }
            if (i == Theme.key_chat_emojiPanelIcon || i == Theme.key_chat_emojiBottomPanelIcon) {
                return -9539985;
            }
            if (i == Theme.key_chat_emojiPanelIconSelected || i == Theme.key_chat_emojiPanelStickerPackSelectorLine) {
                return -10177041;
            }
            if (i == Theme.key_chat_emojiPanelBackground) {
                return -14803425;
            }
            if (i == Theme.key_chat_emojiPanelShadowLine) {
                return -1610612736;
            }
            if (i == Theme.key_chat_emojiPanelBackspace) {
                return -9539985;
            }
            if (i == Theme.key_listSelector) {
                return 771751936;
            }
            if (i == Theme.key_divider) {
                return -16777216;
            }
            if (i == Theme.key_chat_editMediaButton) {
                return -10177041;
            }
            if (i == Theme.key_dialogFloatingIcon) {
                return -1;
            }
            return i == Theme.key_chat_emojiPanelStickerSetName ? 1946157055 : 0;
        }

        @Override
        public int getColorOrDefault(int i) {
            return getColor(i);
        }

        @Override
        public int getCurrentColor(int i) {
            return getColor(i);
        }

        @Override
        public Drawable getDrawable(String str) {
            return null;
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.getThemePaint(str);
        }

        @Override
        public boolean hasGradientService() {
            return false;
        }

        @Override
        public boolean isDark() {
            return Theme.currentTheme.isDark();
        }

        @Override
        public void setAnimatedColor(int i, int i2) {
        }
    }

    public interface PhotoViewerCaptionEnterViewDelegate {
        void onCaptionEnter();

        void onEmojiViewCloseEnd();

        void onEmojiViewCloseStart();

        void onEmojiViewOpen();

        void onTextChanged(CharSequence charSequence);

        void onWindowSizeChanged(int i);
    }

    public PhotoViewerCaptionEnterView(PhotoViewer photoViewer, Context context, SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, View view, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.sendButtonEnabled = true;
        this.sendButtonEnabledProgress = 1.0f;
        this.currentAccount = UserConfig.selectedAccount;
        this.animationProgress = 0.0f;
        this.paint = new Paint();
        this.offset = 0.0f;
        this.resourcesProvider = new DarkTheme();
        this.paint.setColor(2130706432);
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        this.windowView = view;
        this.sizeNotifierLayout = sizeNotifierFrameLayoutPhoto;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, -2, 1.0f));
        ImageView imageView = new ImageView(context);
        this.emojiButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.emojiButton.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), 0, 0);
        this.emojiButton.setAlpha(0.58f);
        frameLayout.addView(this.emojiButton, LayoutHelper.createFrame(48, 48, 83));
        final int i = 0;
        this.emojiButton.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoViewerCaptionEnterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0(view2);
                        break;
                    default:
                        this.f$0.lambda$new$4(view2);
                        break;
                }
            }
        });
        this.emojiButton.setContentDescription(LocaleController.getString(R.string.Emoji));
        ImageView imageView2 = this.emojiButton;
        ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(context);
        this.emojiIconDrawable = replaceableIconDrawable;
        imageView2.setImageDrawable(replaceableIconDrawable);
        this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
        TextPaint textPaint = new TextPaint(1);
        this.lengthTextPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.lengthTextPaint.setTypeface(AndroidUtilities.bold());
        this.lengthTextPaint.setColor(-2500135);
        EditTextCaption editTextCaption = new EditTextCaption(context, 0 == true ? 1 : 0) {
            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                PhotoViewerCaptionEnterView.this.extendActionMode(actionMode, menu);
            }

            @Override
            public int getActionModeStyle() {
                return 2;
            }

            @Override
            public void onMeasure(int i2, int i3) {
                try {
                    PhotoViewerCaptionEnterView.this.isInitLineCount = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
                    super.onMeasure(i2, i3);
                    if (PhotoViewerCaptionEnterView.this.isInitLineCount) {
                        PhotoViewerCaptionEnterView.this.lineCount = getLineCount();
                    }
                    PhotoViewerCaptionEnterView.this.isInitLineCount = false;
                } catch (Exception e) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(51.0f));
                    FileLog.e(e);
                }
            }

            @Override
            public void onSelectionChanged(int i2, int i3) {
                super.onSelectionChanged(i2, i3);
                if (i2 != i3) {
                    fixHandleView(false);
                } else {
                    fixHandleView(true);
                }
            }

            @Override
            public boolean requestRectangleOnScreen(Rect rect) {
                rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
                return super.requestRectangleOnScreen(rect);
            }

            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(charSequence, bufferType);
                invalidateForce();
            }
        };
        this.messageEditText = editTextCaption;
        editTextCaption.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view2, boolean z) {
                this.f$0.lambda$new$1(view2, z);
            }
        });
        this.messageEditText.setSelectAllOnFocus(false);
        this.messageEditText.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(this, 9));
        this.messageEditText.setWindowView(this.windowView);
        this.messageEditText.setHint(LocaleController.getString(R.string.AddCaption));
        this.messageEditText.setImeOptions(268435456);
        this.messageEditText.setLinkTextColor(-8994063);
        EditTextCaption editTextCaption2 = this.messageEditText;
        editTextCaption2.setInputType(editTextCaption2.getInputType() | 16384);
        this.messageEditText.setMaxLines(4);
        this.messageEditText.setHorizontallyScrolling(false);
        this.messageEditText.setTextSize(1, 18.0f);
        this.messageEditText.setGravity(80);
        this.messageEditText.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
        this.messageEditText.setBackgroundDrawable(null);
        this.messageEditText.setCursorColor(-1);
        this.messageEditText.setCursorSize(AndroidUtilities.dp(20.0f));
        this.messageEditText.setTextColor(-1);
        this.messageEditText.setHighlightColor(1342177279);
        this.messageEditText.setHintTextColor(-1291845633);
        frameLayout.addView(this.messageEditText, LayoutHelper.createFrame(-1, -2.0f, 83, 52.0f, 0.0f, 6.0f, 0.0f));
        this.messageEditText.setOnKeyListener(new AlertsCreator$$ExternalSyntheticLambda65(this, 3));
        final int i2 = 1;
        this.messageEditText.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoViewerCaptionEnterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0(view2);
                        break;
                    default:
                        this.f$0.lambda$new$4(view2);
                        break;
                }
            }
        });
        this.messageEditText.addTextChangedListener(new AnonymousClass2(photoViewer, sizeNotifierFrameLayoutPhoto));
        this.doneDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(16.0f), -10043398);
        this.checkDrawable = context.getResources().getDrawable(R.drawable.input_done).mutate();
        CombinedDrawable combinedDrawable = new CombinedDrawable(this.doneDrawable, this.checkDrawable, 0, AndroidUtilities.dp(1.0f));
        combinedDrawable.setCustomSize(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        ImageView imageView3 = new ImageView(context);
        this.doneButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        imageView3.setImageDrawable(combinedDrawable);
        linearLayout.addView(imageView3, LayoutHelper.createLinear(48, 48, 80));
        imageView3.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, photoViewer, sizeNotifierFrameLayoutPhoto, 16));
        imageView3.setContentDescription(LocaleController.getString(R.string.Done));
        NumberTextView numberTextView = new NumberTextView(context);
        this.captionLimitView = numberTextView;
        numberTextView.setVisibility(8);
        this.captionLimitView.setTextSize(15);
        this.captionLimitView.setTextColor(-1);
        this.captionLimitView.setTypeface(AndroidUtilities.bold());
        this.captionLimitView.setCenterAlign(true);
        addView(this.captionLimitView, LayoutHelper.createFrame(48, 20.0f, 85, 3.0f, 0.0f, 3.0f, 48.0f));
        this.currentAccount = UserConfig.selectedAccount;
    }

    private void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.sizeNotifierLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.emojiCacheType = 3;
        emojiView2.setDelegate(new EmojiView.EmojiViewDelegate() {

            public class AnonymousClass1 extends BaseFragment {
                public AnonymousClass1() {
                    super(null);
                }

                @Override
                public Context getContext() {
                    return PhotoViewerCaptionEnterView.this.getContext();
                }

                @Override
                public int getCurrentAccount() {
                    return this.currentAccount;
                }

                @Override
                public Activity getParentActivity() {
                    for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                        if (context instanceof Activity) {
                            return (Activity) context;
                        }
                    }
                    return null;
                }

                @Override
                public Dialog getVisibleDialog() {
                    return new Dialog(PhotoViewerCaptionEnterView.this.getContext()) {
                        @Override
                        public void dismiss() throws FileNotFoundException {
                            if ((AnonymousClass1.this.getParentActivity() instanceof LaunchActivity) && ((LaunchActivity) AnonymousClass1.this.getParentActivity()).getActionBarLayout() != null) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                ((BaseFragment) anonymousClass1).parentLayout = ((LaunchActivity) anonymousClass1.getParentActivity()).getActionBarLayout();
                                if (((BaseFragment) AnonymousClass1.this).parentLayout != null && ((ActionBarLayout) ((BaseFragment) AnonymousClass1.this).parentLayout).getLastFragment() != null && ((ActionBarLayout) ((BaseFragment) AnonymousClass1.this).parentLayout).getLastFragment().getVisibleDialog() != null) {
                                    Dialog visibleDialog = ((ActionBarLayout) ((BaseFragment) AnonymousClass1.this).parentLayout).getLastFragment().getVisibleDialog();
                                    if (visibleDialog instanceof ChatAttachAlert) {
                                        ((ChatAttachAlert) visibleDialog).dismiss(true);
                                    } else {
                                        visibleDialog.dismiss();
                                    }
                                }
                            }
                            PhotoViewer.getInstance().closePhoto(false, false);
                        }
                    };
                }
            }

            @Override
            public final boolean canAddCaptionToGif(TLRPC.Document document) {
                return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
            }

            @Override
            public final boolean canSchedule() {
                return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
            }

            @Override
            public final long getDialogId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
            }

            @Override
            public final float getProgressToSearchOpened() {
                return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
            }

            @Override
            public final int getThreadId() {
                return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
            }

            @Override
            public final void invalidateEnterView() {
                EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
            }

            @Override
            public final boolean isExpanded() {
                return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
            }

            @Override
            public final boolean isInScheduleMode() {
                return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
            }

            @Override
            public final boolean isSearchOpened() {
                return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
            }

            @Override
            public final boolean isUserSelf() {
                return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
            }

            @Override
            public void onAnimatedEmojiUnlockClick() {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                new PremiumFeatureBottomSheet(anonymousClass1, anonymousClass1.getContext(), anonymousClass1.getCurrentAccount(), false, 11, false, null).show();
            }

            @Override
            public boolean onBackspace() {
                if (PhotoViewerCaptionEnterView.this.messageEditText.length() == 0) {
                    return false;
                }
                PhotoViewerCaptionEnterView.this.messageEditText.dispatchKeyEvent(new KeyEvent(0, 67));
                return true;
            }

            @Override
            public final void onClearEmojiRecent() {
                EmojiView.EmojiViewDelegate.CC.$default$onClearEmojiRecent(this);
            }

            @Override
            public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
                int selectionEnd = PhotoViewerCaptionEnterView.this.messageEditText.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    PhotoViewerCaptionEnterView.this.innerTextChange = true;
                    SpannableString spannableString = new SpannableString(str);
                    AnimatedEmojiSpan animatedEmojiSpan = document != null ? new AnimatedEmojiSpan(document, PhotoViewerCaptionEnterView.this.messageEditText.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, PhotoViewerCaptionEnterView.this.messageEditText.getPaint().getFontMetricsInt());
                    if (!z) {
                        animatedEmojiSpan.fromEmojiKeyboard = true;
                        animatedEmojiSpan.cacheType = 3;
                    }
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    PhotoViewerCaptionEnterView.this.messageEditText.setText(PhotoViewerCaptionEnterView.this.messageEditText.getText().insert(selectionEnd, spannableString));
                    int length = selectionEnd + spannableString.length();
                    PhotoViewerCaptionEnterView.this.messageEditText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                } finally {
                    PhotoViewerCaptionEnterView.this.innerTextChange = false;
                }
            }

            @Override
            public void onEmojiSelected(String str) {
                int selectionEnd = PhotoViewerCaptionEnterView.this.messageEditText.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    PhotoViewerCaptionEnterView.this.innerTextChange = true;
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, PhotoViewerCaptionEnterView.this.messageEditText.getPaint().getFontMetricsInt(), false);
                    PhotoViewerCaptionEnterView.this.messageEditText.setText(PhotoViewerCaptionEnterView.this.messageEditText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                    int length = selectionEnd + charSequenceReplaceEmoji.length();
                    PhotoViewerCaptionEnterView.this.messageEditText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                } finally {
                    PhotoViewerCaptionEnterView.this.innerTextChange = false;
                }
            }

            @Override
            public final void onEmojiSettingsClick(ArrayList arrayList) {
                EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
            }

            @Override
            public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
            }

            @Override
            public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
            }

            @Override
            public final void onSearchOpenClose(int i) {
                EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i);
            }

            @Override
            public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
                EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
            }

            @Override
            public final void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
            }

            @Override
            public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
            }

            @Override
            public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
            }

            @Override
            public final void onStickersGroupClick(long j) {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
            }

            @Override
            public final void onStickersSettingsClick() {
                EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
            }

            @Override
            public final void onTabOpened(int i) {
                EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
            }

            @Override
            public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
                EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
            }
        });
        this.sizeNotifierLayout.addView(this.emojiView);
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$new$0(View view) {
        if (this.keyboardVisible || ((AndroidUtilities.isInMultiwindow || AndroidUtilities.usingHardwareInput) && !isPopupShowing())) {
            showPopup(1, false);
        } else {
            openKeyboardInternal();
        }
    }

    public void lambda$new$1(View view, boolean z) {
        if (z) {
            try {
                EditTextCaption editTextCaption = this.messageEditText;
                editTextCaption.setSelection(editTextCaption.length(), this.messageEditText.length());
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$new$2() {
        this.messageEditText.invalidateEffects();
    }

    public boolean lambda$new$3(View view, int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.windowView != null && hideActionMode()) {
                return true;
            }
            if (!this.keyboardVisible && isPopupShowing()) {
                if (keyEvent.getAction() == 1) {
                    showPopup(0, true);
                }
                return true;
            }
        }
        return false;
    }

    public void lambda$new$4(View view) {
        if (isPopupShowing()) {
            showPopup((AndroidUtilities.isInMultiwindow || AndroidUtilities.usingHardwareInput) ? 0 : 2, false);
        }
    }

    public void lambda$new$5(PhotoViewer photoViewer, SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, View view) {
        if (MessagesController.getInstance(this.currentAccount).getCaptionMaxLengthLimit() - this.codePointCount >= 0) {
            this.delegate.onCaptionEnter();
            return;
        }
        AndroidUtilities.shakeView(this.captionLimitView);
        try {
            this.captionLimitView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codePointCount) {
            return;
        }
        photoViewer.showCaptionLimitBulletin(sizeNotifierFrameLayoutPhoto);
    }

    public void lambda$onDraw$6(ValueAnimator valueAnimator) {
        this.messageEditText.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$onDraw$7(ValueAnimator valueAnimator) {
        this.offset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void lambda$setFieldFocused$8() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            try {
                editTextCaption.requestFocus();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$showPopup$9(float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.emojiPadding = (int) fFloatValue;
        float f2 = f - fFloatValue;
        this.emojiView.setTranslationY(f2);
        setTranslationY(f2);
        float f3 = fFloatValue / f;
        setAlpha(f3);
        this.emojiView.setAlpha(f3);
    }

    public void onLineCountChanged(int i, int i2) {
        if (TextUtils.isEmpty(this.messageEditText.getText())) {
            this.messageEditText.animate().cancel();
            this.messageEditText.setOffsetY(0.0f);
            this.shouldAnimateEditTextWithBounds = false;
        } else {
            this.shouldAnimateEditTextWithBounds = true;
            this.messageEditTextPredrawHeigth = this.messageEditText.getMeasuredHeight();
            this.messageEditTextPredrawScrollY = this.messageEditText.getScrollY();
            invalidate();
        }
        this.chatActivityEnterViewAnimateFromTop = getTop() + this.offset;
    }

    private void onWindowSizeChanged() {
        int height = this.sizeNotifierLayout.getHeight();
        if (!this.keyboardVisible) {
            height -= this.emojiPadding;
        }
        PhotoViewerCaptionEnterViewDelegate photoViewerCaptionEnterViewDelegate = this.delegate;
        if (photoViewerCaptionEnterViewDelegate != null) {
            photoViewerCaptionEnterViewDelegate.onWindowSizeChanged(height);
        }
    }

    private void openKeyboardInternal() {
        showPopup((AndroidUtilities.isInMultiwindow || AndroidUtilities.usingHardwareInput) ? 0 : 2, false);
        openKeyboard();
    }

    private void showPopup(int i, boolean z) {
        this.lastShow = i;
        if (i == 1) {
            createEmojiView();
            this.emojiView.setVisibility(0);
            this.delegate.onEmojiViewOpen();
            if (this.keyboardHeight <= 0) {
                this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
            if (this.keyboardHeightLand <= 0) {
                this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
            Point point = AndroidUtilities.displaySize;
            int i2 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            layoutParams.width = AndroidUtilities.displaySize.x;
            layoutParams.height = i2;
            this.emojiView.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !this.forceFloatingEmoji) {
                AndroidUtilities.hideKeyboard(this.messageEditText);
            }
            SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto = this.sizeNotifierLayout;
            if (sizeNotifierFrameLayoutPhoto != null) {
                this.emojiPadding = i2;
                sizeNotifierFrameLayoutPhoto.requestLayout();
                this.emojiIconDrawable.setIcon(R.drawable.input_keyboard, true);
                onWindowSizeChanged();
                return;
            }
            return;
        }
        if (this.emojiButton != null) {
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, true);
        }
        if (this.sizeNotifierLayout != null) {
            if (z && i == 0 && this.emojiView != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                final float f = this.emojiPadding;
                this.popupAnimating = true;
                this.delegate.onEmojiViewCloseStart();
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$showPopup$9(f, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewerCaptionEnterView.this.emojiPadding = 0;
                        PhotoViewerCaptionEnterView.this.setTranslationY(0.0f);
                        PhotoViewerCaptionEnterView.this.setAlpha(1.0f);
                        PhotoViewerCaptionEnterView.this.emojiView.setTranslationY(0.0f);
                        PhotoViewerCaptionEnterView.this.popupAnimating = false;
                        PhotoViewerCaptionEnterView.this.delegate.onEmojiViewCloseEnd();
                        PhotoViewerCaptionEnterView.this.emojiView.setVisibility(8);
                        PhotoViewerCaptionEnterView.this.emojiView.setAlpha(1.0f);
                    }
                });
                valueAnimatorOfFloat.setDuration(210L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            } else if (i == 0) {
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.setVisibility(8);
                }
                this.emojiPadding = 0;
            }
            this.sizeNotifierLayout.requestLayout();
            onWindowSizeChanged();
        }
    }

    public void addEmojiToRecent(String str) {
        createEmojiView();
        this.emojiView.addEmojiToRecent(str);
    }

    public void closeKeyboard() {
        AndroidUtilities.hideKeyboard(this.messageEditText);
        this.messageEditText.clearFocus();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        EmojiView emojiView;
        if (i != NotificationCenter.emojiLoaded || (emojiView = this.emojiView) == null) {
            return;
        }
        emojiView.invalidateViews();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.drawRect(0.0f, this.offset, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        canvas.clipRect(0.0f, this.offset, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    public int getCaptionLimitOffset() {
        return MessagesController.getInstance(this.currentAccount).getCaptionMaxLengthLimit() - this.codePointCount;
    }

    public int getCodePointCount() {
        return this.codePointCount;
    }

    public int getCursorPosition() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return 0;
        }
        return editTextCaption.getSelectionStart();
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    public CharSequence getFieldCharSequence() {
        return AndroidUtilities.getTrimmedString(this.messageEditText.getText());
    }

    public EditTextCaption getMessageEditText() {
        return this.messageEditText;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public int getSelectionLength() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return 0;
        }
        try {
            return editTextCaption.getSelectionEnd() - this.messageEditText.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public boolean hideActionMode() {
        return false;
    }

    public void hidePopup() {
        if (isPopupShowing()) {
            showPopup(0, true);
        }
    }

    public boolean isKeyboardVisible() {
        return ((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) && getTag() != null) || this.keyboardVisible;
    }

    public boolean isPopupAnimating() {
        return this.popupAnimating;
    }

    public boolean isPopupShowing() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getVisibility() == 0;
    }

    public boolean isPopupView(View view) {
        return view == this.emojiView;
    }

    public void onCreate() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        this.sizeNotifierLayout.setDelegate(this);
    }

    public void onDestroy() {
        hidePopup();
        if (isKeyboardVisible()) {
            closeKeyboard();
        }
        this.keyboardVisible = false;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayoutPhoto != null) {
            sizeNotifierFrameLayoutPhoto.setDelegate(null);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        final int i = 1;
        final int i2 = 0;
        if (this.shouldAnimateEditTextWithBounds) {
            float scrollY = (this.messageEditTextPredrawScrollY - this.messageEditText.getScrollY()) + (this.messageEditTextPredrawHeigth - this.messageEditText.getMeasuredHeight());
            EditTextCaption editTextCaption = this.messageEditText;
            editTextCaption.setOffsetY(editTextCaption.getOffsetY() - scrollY);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.messageEditText.getOffsetY(), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewerCaptionEnterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$onDraw$6(valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$onDraw$7(valueAnimator);
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator = this.messageEditTextAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.messageEditTextAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.start();
            this.shouldAnimateEditTextWithBounds = false;
        }
        float f = this.chatActivityEnterViewAnimateFromTop;
        if (f == 0.0f || f == getTop() + this.offset) {
            return;
        }
        ValueAnimator valueAnimator2 = this.topBackgroundAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float top = this.chatActivityEnterViewAnimateFromTop - (getTop() + this.offset);
        this.offset = top;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(top, 0.0f);
        this.topBackgroundAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final PhotoViewerCaptionEnterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$onDraw$6(valueAnimator3);
                        break;
                    default:
                        this.f$0.lambda$onDraw$7(valueAnimator3);
                        break;
                }
            }
        });
        this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.topBackgroundAnimator.setDuration(200L);
        this.topBackgroundAnimator.start();
        this.chatActivityEnterViewAnimateFromTop = 0.0f;
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !this.forceFloatingEmoji) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (isPopupShowing()) {
            int i2 = z ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.emojiView.setLayoutParams(layoutParams);
                SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto = this.sizeNotifierLayout;
                if (sizeNotifierFrameLayoutPhoto != null) {
                    this.emojiPadding = layoutParams.height;
                    sizeNotifierFrameLayoutPhoto.requestLayout();
                    onWindowSizeChanged();
                }
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        boolean z4 = i > 0;
        this.keyboardVisible = z4;
        if (z4 && isPopupShowing()) {
            showPopup(0, false);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !isPopupShowing()) {
            this.emojiPadding = 0;
            this.sizeNotifierLayout.requestLayout();
        }
        onWindowSizeChanged();
    }

    public void openKeyboard() {
        this.messageEditText.requestFocus();
        AndroidUtilities.showKeyboard(this.messageEditText);
        try {
            EditTextCaption editTextCaption = this.messageEditText;
            editTextCaption.setSelection(editTextCaption.length(), this.messageEditText.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageEditText.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji(spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false);
            }
            this.messageEditText.setText(spannableStringBuilder);
            this.messageEditText.setSelection(Math.min(i + charSequence.length(), this.messageEditText.length()));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.messageEditText.setAllowTextEntitiesIntersection(z);
    }

    public void setDelegate(PhotoViewerCaptionEnterViewDelegate photoViewerCaptionEnterViewDelegate) {
        this.delegate = photoViewerCaptionEnterViewDelegate;
    }

    public void setFieldFocused(boolean z) {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return;
        }
        if (z) {
            if (editTextCaption.isFocused()) {
                return;
            }
            this.messageEditText.postDelayed(new GroupCallPip$$ExternalSyntheticLambda2(this, 28), 600L);
        } else {
            if (!editTextCaption.isFocused() || this.keyboardVisible) {
                return;
            }
            this.messageEditText.clearFocus();
        }
    }

    public void setFieldText(CharSequence charSequence) {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return;
        }
        editTextCaption.setText(charSequence);
        EditTextCaption editTextCaption2 = this.messageEditText;
        editTextCaption2.setSelection(editTextCaption2.getText().length());
        PhotoViewerCaptionEnterViewDelegate photoViewerCaptionEnterViewDelegate = this.delegate;
        if (photoViewerCaptionEnterViewDelegate != null) {
            photoViewerCaptionEnterViewDelegate.onTextChanged(this.messageEditText.getText());
        }
    }

    public void setForceFloatingEmoji(boolean z) {
        this.forceFloatingEmoji = z;
    }

    public void updateColors() {
        Theme.setDrawableColor(getThemedColor(Theme.key_chat_editMediaButton), this.doneDrawable);
        int themedColor = getThemedColor(Theme.key_dialogFloatingIcon);
        Theme.setDrawableColor(ColorUtils.setAlphaComponent(themedColor, (int) AndroidUtilities$$ExternalSyntheticOutline0.m(this.sendButtonEnabledProgress, 0.42f, 0.58f, Color.alpha(themedColor))), this.checkDrawable);
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.updateColors();
        }
    }
}
