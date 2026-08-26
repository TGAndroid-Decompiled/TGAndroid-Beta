package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.DialogCell;

public class LinkActionView extends LinearLayout {
    private ActionBarPopupWindow actionBarPopupWindow;
    private final AvatarsContainer avatarsContainer;
    private boolean canEdit;
    private final TextView copyView;
    private Delegate delegate;
    BaseFragment fragment;
    private final FrameLayout frameLayout;
    private boolean hideRevokeOption;
    private final boolean isChannel;
    String link;
    TextView linkView;
    private String loadedInviteLink;
    boolean loadingImporters;
    ImageView optionsView;
    private boolean permanent;
    private final float[] point;
    private QRCodeBottomSheet qrCodeBottomSheet;
    private String qrText;
    private final TextView removeView;
    private boolean revoked;
    private final TextView shareView;
    private int usersCount;

    public class AvatarsContainer extends FrameLayout {
        AvatarsImageView avatarsImageView;
        TextView countTextView;

        public AvatarsContainer(Context context) {
            super(context);
            this.avatarsImageView = new AvatarsImageView(context, false) {
                @Override
                public void onMeasure(int i, int i2) {
                    int iMin = Math.min(3, LinkActionView.this.usersCount);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(iMin == 0 ? 0 : CalendarActivity$$ExternalSyntheticOutline0.m(iMin, 1, 20, 32)), 1073741824), i2);
                }
            };
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -1, 1));
            TextView textView = new TextView(context);
            this.countTextView = textView;
            textView.setTextSize(1, 14.0f);
            this.countTextView.setTypeface(AndroidUtilities.bold());
            linearLayoutM.addView(this.avatarsImageView, LayoutHelper.createLinear(-2, -1));
            linearLayoutM.addView(this.countTextView, LayoutHelper.createLinear(-2, -2, 16));
            setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            this.avatarsImageView.commitTransition(false);
        }
    }

    public LinkActionView(Context context, final BaseFragment baseFragment, BottomSheet bottomSheet, long j, boolean z, boolean z2) {
        super(context);
        this.canEdit = true;
        this.point = new float[2];
        this.fragment = baseFragment;
        this.permanent = z;
        this.isChannel = z2;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        TextView textView = new TextView(context);
        this.linkView = textView;
        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(13.0f));
        this.linkView.setTextSize(1, 16.0f);
        this.linkView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.linkView.setSingleLine(true);
        frameLayout.addView(this.linkView);
        ImageView imageView = new ImageView(context);
        this.optionsView = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        this.optionsView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.optionsView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(this.optionsView, LayoutHelper.createFrame(40, 48, 21));
        addView(frameLayout, LayoutHelper.createLinear(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.copyView = textView2;
        ScaleStateListAnimator.apply(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new ColoredImageSpan(context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        int i = R.string.LinkActionCopy;
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(i));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, LayoutHelper.createLinear(0, 42, 1.0f, 0, 4, 0, 4, 0));
        TextView textView3 = new TextView(context);
        this.shareView = textView3;
        ScaleStateListAnimator.apply(textView3, 0.025f, 1.2f);
        textView3.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new ColoredImageSpan(context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        int i2 = R.string.LinkActionShare;
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(i2));
        textView3.setText(spannableStringBuilder2);
        textView3.setContentDescription(LocaleController.getString(i2));
        textView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setSingleLine(true);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView3, LayoutHelper.createLinear(0, 42, 1.0f, 4, 0, 4, 0), context);
        this.removeView = textViewM;
        ScaleStateListAnimator.apply(textViewM, 0.025f, 1.2f);
        textViewM.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new ColoredImageSpan(context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        textViewM.setText(spannableStringBuilder3);
        textViewM.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textViewM.setTextSize(1, 14.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setSingleLine(true);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(0, 42, 1.0f, 4, 0, 4, 0));
        linearLayout.setClickable(true);
        textViewM.setVisibility(8);
        addView(linearLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 0.0f, 0.0f));
        AvatarsContainer avatarsContainer = new AvatarsContainer(context);
        this.avatarsContainer = avatarsContainer;
        avatarsContainer.avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(avatarsContainer, LayoutHelper.createLinear(-1, 44, 0.0f, 12.0f, 0.0f, 0.0f));
        textView2.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, bottomSheet, baseFragment, 14));
        if (z) {
            avatarsContainer.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(this, 0));
        }
        final int i3 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final LinkActionView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$2(baseFragment, view);
                        break;
                    default:
                        this.f$0.lambda$new$4(baseFragment, view);
                        break;
                }
            }
        });
        final int i4 = 1;
        textViewM.setOnClickListener(new View.OnClickListener(this) {
            public final LinkActionView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$2(baseFragment, view);
                        break;
                    default:
                        this.f$0.lambda$new$4(baseFragment, view);
                        break;
                }
            }
        });
        this.optionsView.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda4(this, context, bottomSheet, baseFragment, 0));
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinkActionView.this.copyView.callOnClick();
            }
        });
        updateColors();
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

    public void lambda$loadUsers$11(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.loadingImporters = false;
        this.loadedInviteLink = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i = 0; i < tL_messages_chatInviteImporters.users.size(); i++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            setUsers(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    public void lambda$loadUsers$12(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(13, this, tL_chatInviteExported, tL_error, tLObject));
    }

    public void lambda$new$0(BottomSheet bottomSheet, BaseFragment baseFragment, View view) {
        try {
            if (this.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.link));
            if (bottomSheet == null || bottomSheet.getContainer() == null) {
                BulletinFactory.createCopyLinkBulletin(baseFragment).show();
            } else {
                BulletinFactory.createCopyLinkBulletin(bottomSheet.getContainer()).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$new$1(View view) {
        this.delegate.showUsersForPermanentLink();
    }

    public void lambda$new$2(BaseFragment baseFragment, View view) {
        try {
            if (this.link == null) {
                return;
            }
            Context context = getContext();
            String str = this.link;
            ArrayList arrayList = null;
            baseFragment.showDialog(new ShareAlert(context, arrayList, str, false, str, false, baseFragment.getResourceProvider()) {
                @Override
                public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                    String string;
                    if (z) {
                        if (longSparseArray == null || longSparseArray.size() != 1) {
                            string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i, new Object[0]));
                        } else {
                            long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                            string = (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                        }
                        LinkActionView.this.showBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                    }
                }

                @Override
                public void setLastVisible(boolean z) {
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$new$3(AlertDialog alertDialog, int i) {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.removeLink();
        }
    }

    public void lambda$new$4(BaseFragment baseFragment, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.DeleteLink));
        builder.setMessage(LocaleController.getString(R.string.DeleteLinkHelp));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LinkActionView$$ExternalSyntheticLambda6(this, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.create());
    }

    public void lambda$new$5(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
        this.delegate.editLink();
    }

    public void lambda$new$6(View view) {
        showQrCode();
    }

    public void lambda$new$7(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
        revokeLink();
    }

    public void lambda$new$8(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && this.actionBarPopupWindow.isShowing()) {
            this.actionBarPopupWindow.dismiss(true);
        }
    }

    public void lambda$new$9(Context context, BottomSheet bottomSheet, BaseFragment baseFragment, View view) {
        if (this.actionBarPopupWindow != null) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context);
        if (!this.permanent && this.canEdit) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, context, null, true, false);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Edit), R.drawable.msg_edit);
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(this, 1));
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, context, null, true, false);
        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode);
        actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem2.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(this, 2));
        if (!this.hideRevokeOption) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, context, null, false, true);
            actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete);
            int i = Theme.key_text_RedRegular;
            actionBarMenuSubItem3.setColors(Theme.getColor(null, i, false), Theme.getColor(null, i, false));
            actionBarMenuSubItem3.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(this, 3));
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        }
        final FrameLayout overlayContainerView = bottomSheet == null ? ((ActionBarLayout) baseFragment.getParentLayout()).getOverlayContainerView() : bottomSheet.getContainer();
        if (overlayContainerView != null) {
            getPointOnScreen(this.frameLayout, overlayContainerView, this.point);
            float paddingTop = this.point[1];
            final View view2 = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    canvas.drawColor(855638016);
                    LinkActionView linkActionView = LinkActionView.this;
                    linkActionView.getPointOnScreen(linkActionView.frameLayout, overlayContainerView, LinkActionView.this.point);
                    canvas.save();
                    float y = LinkActionView.this.frameLayout.getY() + ((View) LinkActionView.this.frameLayout.getParent()).getY();
                    if (y < 1.0f) {
                        canvas.clipRect(0.0f, (LinkActionView.this.point[1] - y) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                    canvas.translate(LinkActionView.this.point[0], LinkActionView.this.point[1]);
                    LinkActionView.this.frameLayout.draw(canvas);
                    canvas.restore();
                }
            };
            final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    view2.invalidate();
                    return true;
                }
            };
            overlayContainerView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            overlayContainerView.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
            float paddingLeft = 0.0f;
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(150L);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
            this.actionBarPopupWindow = actionBarPopupWindow;
            actionBarPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    LinkActionView.this.actionBarPopupWindow = null;
                    view2.animate().cancel();
                    view2.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (view2.getParent() != null) {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                overlayContainerView.removeView(view2);
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
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new LinkActionView$$ExternalSyntheticLambda6(this, 1));
            if (AndroidUtilities.isTablet()) {
                paddingTop += overlayContainerView.getPaddingTop();
                paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
            }
            this.actionBarPopupWindow.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + this.frameLayout.getMeasuredHeight()));
        }
    }

    public void lambda$revokeLink$10(AlertDialog alertDialog, int i) {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.revokeLink();
        }
    }

    private void revokeLink() {
        if (this.fragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.fragment.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.RevokeLink));
        builder.setMessage(LocaleController.getString(R.string.RevokeAlert));
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new LinkActionView$$ExternalSyntheticLambda6(this, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        TextView textView = (TextView) builder.create().getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        builder.show();
    }

    private void showQrCode() {
        int i;
        String str = this.link;
        boolean z = str != null && str.endsWith("?direct");
        Context context = getContext();
        String string = LocaleController.getString(R.string.InviteByQRCode);
        String str2 = this.link;
        String string2 = this.qrText;
        if (string2 == null) {
            if (this.isChannel) {
                i = z ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel;
            } else {
                i = R.string.QRCodeLinkHelpGroup;
            }
            string2 = LocaleController.getString(i);
        }
        QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, string, str2, string2, false) {
            @Override
            public void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                LinkActionView.this.qrCodeBottomSheet = null;
            }

            @Override
            public void setLastVisible(boolean z2) {
            }
        };
        this.qrCodeBottomSheet = qRCodeBottomSheet;
        qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
        this.qrCodeBottomSheet.show();
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public void hideOptions() {
        this.optionsView.setVisibility(8);
        this.linkView.setGravity(17);
        this.removeView.setVisibility(8);
        this.avatarsContainer.setVisibility(8);
    }

    public void hideRevokeOption(boolean z) {
        if (this.hideRevokeOption != z) {
            this.hideRevokeOption = z;
            this.optionsView.setVisibility(0);
            ImageView imageView = this.optionsView;
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public void loadUsers(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j) {
        if (tL_chatInviteExported == null) {
            setUsers(0, null, false);
            return;
        }
        if (TextUtils.equals(this.loadedInviteLink, tL_chatInviteExported.link)) {
            return;
        }
        setUsers(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
        if (tL_chatInviteExported.usage <= 0 || tL_chatInviteExported.importers != null || this.loadingImporters) {
            return;
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        String str = tL_chatInviteExported.link;
        if (str != null) {
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = str;
        }
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j);
        tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
        this.loadingImporters = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new ShareAlert$$ExternalSyntheticLambda13(10, this, tL_chatInviteExported));
    }

    public void setCanEdit(boolean z) {
        this.canEdit = z;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setLink(String str) {
        this.link = str;
        if (str == null) {
            this.linkView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            this.linkView.setText(str.substring(8));
        } else {
            this.linkView.setText(str);
        }
    }

    public void setPermanent(boolean z) {
        this.permanent = z;
    }

    public void setQrText(String str) {
        this.qrText = str;
    }

    public void setRevoke(boolean z) {
        this.revoked = z;
        if (z) {
            this.optionsView.setVisibility(8);
            this.shareView.setVisibility(8);
            this.copyView.setVisibility(8);
            this.removeView.setVisibility(0);
            return;
        }
        this.optionsView.setVisibility(0);
        this.shareView.setVisibility(0);
        this.copyView.setVisibility(0);
        this.removeView.setVisibility(8);
    }

    public void setUsers(int i, ArrayList<TLRPC.User> arrayList) {
        setUsers(i, arrayList, false);
    }

    public void showBulletin(int i, CharSequence charSequence) {
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this.fragment).createSimpleBulletin(i, charSequence);
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.show(true);
    }

    public void showOptions(boolean z) {
        this.optionsView.setVisibility(z ? 0 : 8);
    }

    public void updateColors() {
        TextView textView = this.copyView;
        int i = Theme.key_featuredStickers_buttonText;
        textView.setTextColor(Theme.getColor(null, i, false));
        this.shareView.setTextColor(Theme.getColor(null, i, false));
        this.removeView.setTextColor(Theme.getColor(null, i, false));
        TextView textView2 = this.copyView;
        int iDp = AndroidUtilities.dp(21.0f);
        int i2 = Theme.key_featuredStickers_addButton;
        int color = Theme.getColor(null, i2, false);
        int i3 = Theme.key_featuredStickers_addButtonPressed;
        int color2 = Theme.getColor(null, i3, false);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        TextView textView3 = this.shareView;
        int iDp2 = AndroidUtilities.dp(21.0f);
        int color3 = Theme.getColor(null, i2, false);
        int color4 = Theme.getColor(null, i3, false);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color3, color4, color4));
        TextView textView4 = this.removeView;
        int iDp3 = AndroidUtilities.dp(21.0f);
        int color5 = Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
        textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, color5, alphaComponent, alphaComponent));
        FrameLayout frameLayout = this.frameLayout;
        int iDp4 = AndroidUtilities.dp(21.0f);
        int color6 = Theme.getColor(null, Theme.key_graySection, false);
        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_listSelector, false), 76);
        frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp4, iDp4, iDp4, iDp4, color6, alphaComponent2, alphaComponent2));
        this.linkView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.optionsView.setColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        TextView textView5 = this.avatarsContainer.countTextView;
        int i4 = Theme.key_windowBackgroundWhiteBlueText;
        textView5.setTextColor(Theme.getColor(null, i4, false));
        AvatarsContainer avatarsContainer = this.avatarsContainer;
        int iDp5 = AndroidUtilities.dp(6.0f);
        int alphaComponent3 = ColorUtils.setAlphaComponent(Theme.getColor(null, i4, false), 76);
        avatarsContainer.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp5, iDp5, iDp5, iDp5, 0, alphaComponent3, alphaComponent3));
        QRCodeBottomSheet qRCodeBottomSheet = this.qrCodeBottomSheet;
        if (qRCodeBottomSheet != null) {
            qRCodeBottomSheet.updateColors();
        }
    }

    public void setUsers(int i, ArrayList<TLRPC.User> arrayList, boolean z) {
        this.usersCount = i;
        if (i == 0) {
            this.avatarsContainer.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            this.avatarsContainer.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            this.avatarsContainer.countTextView.setText(LocaleController.formatPluralString("PeopleJoined", i, new Object[0]));
            this.avatarsContainer.requestLayout();
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(arrayList.get(i2), false);
            }
            int iMin = Math.min(3, Math.min(i, arrayList.size()));
            this.avatarsContainer.avatarsImageView.setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                this.avatarsContainer.avatarsImageView.setObject(i3, UserConfig.selectedAccount, arrayList.get(i3));
            }
        } else {
            this.avatarsContainer.avatarsImageView.setCount(0);
        }
        this.avatarsContainer.avatarsImageView.commitTransition(z);
    }

    public interface Delegate {
        void editLink();

        void removeLink();

        void revokeLink();

        void showUsersForPermanentLink();

        public abstract class CC {
            public static void $default$editLink(Delegate delegate) {
            }

            public static void $default$removeLink(Delegate delegate) {
            }

            public static void $default$showUsersForPermanentLink(Delegate delegate) {
            }
        }
    }
}
