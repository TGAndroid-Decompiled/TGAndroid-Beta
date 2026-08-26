package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.FilterChatlistActivity;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public class LinkActionView extends LinearLayout {
    public ActionBarPopupWindow actionBarPopupWindow;
    public final GroupCreateActivity.AnonymousClass7 avatarsContainer;
    public boolean canEdit;
    public final TextView copyView;
    public Delegate delegate;
    public final BaseFragment fragment;
    public final FrameLayout frameLayout;
    public boolean hideRevokeOption;
    public final boolean isChannel;
    public String link;
    public final TextView linkView;
    public String loadedInviteLink;
    public boolean loadingImporters;
    public final ImageView optionsView;
    public boolean permanent;
    public final float[] point;
    public AnonymousClass6 qrCodeBottomSheet;
    public String qrText;
    public final TextView removeView;
    public final TextView shareView;
    public int usersCount;

    public final class AnonymousClass4 implements PopupWindow.OnDismissListener {
        public final int $r8$classId;
        public final ViewGroup this$0;
        public final View val$dimView;
        public final FrameLayout val$finalContainer;
        public final ViewTreeObserver.OnPreDrawListener val$preDrawListener;

        public AnonymousClass4(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
            this.val$dimView = view;
            this.val$finalContainer = frameLayout;
            this.val$preDrawListener = onPreDrawListener;
        }

        @Override
        public final void onDismiss() {
            switch (this.$r8$classId) {
                case 0:
                    ((LinkActionView) this.this$0).actionBarPopupWindow = null;
                    ChatActivity.AnonymousClass27 anonymousClass27 = (ChatActivity.AnonymousClass27) this.val$dimView;
                    anonymousClass27.animate().cancel();
                    anonymousClass27.animate().alpha(0.0f).setDuration(150L).setListener(new ItemOptions.AnonymousClass3(this, 6));
                    break;
                default:
                    ((FilterChatlistActivity.InviteLinkCell) this.this$0).actionBarPopupWindow = null;
                    ChatActivity.AnonymousClass27 anonymousClass28 = (ChatActivity.AnonymousClass27) this.val$dimView;
                    anonymousClass28.animate().cancel();
                    anonymousClass28.animate().alpha(0.0f).setDuration(150L).setListener(new PhotoViewer$41$1(this, 12));
                    break;
            }
        }
    }

    public interface Delegate {
        void editLink();

        void removeLink();

        void revokeLink();

        void showUsersForPermanentLink();
    }

    public LinkActionView(Context context, final BaseFragment baseFragment, BottomSheet bottomSheet, boolean z, boolean z2) {
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
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.optionsView = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 48, 21));
        addView(frameLayout, LayoutHelper.createLinear(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.copyView = textView2;
        ScaleStateListAnimator.apply(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new ColoredImageSpan(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
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
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new ColoredImageSpan(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        int i2 = R.string.LinkActionShare;
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(i2));
        textView3.setText(spannableStringBuilder2);
        textView3.setContentDescription(LocaleController.getString(i2));
        textView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setSingleLine(true);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView3, LayoutHelper.createLinear(1.0f, 0, 42, 4, 4, 0), context);
        this.removeView = textViewM;
        ScaleStateListAnimator.apply(textViewM, 0.025f, 1.2f);
        textViewM.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new ColoredImageSpan(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        textViewM.setText(spannableStringBuilder3);
        textViewM.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textViewM.setTextSize(1, 14.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setSingleLine(true);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        textViewM.setVisibility(8);
        addView(linearLayout, LayoutHelper.createLinear(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, context);
        this.avatarsContainer = anonymousClass7;
        ((LinkActionView$AvatarsContainer$1) anonymousClass7.paint).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(anonymousClass7, LayoutHelper.createLinear(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, bottomSheet, baseFragment, 23));
        if (z) {
            anonymousClass7.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(this, 0));
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
                        BaseFragment baseFragment2 = baseFragment;
                        final LinkActionView linkActionView = this.f$0;
                        try {
                            if (linkActionView.link != null) {
                                Context context2 = linkActionView.getContext();
                                String str = linkActionView.link;
                                baseFragment2.showDialog(new ShareAlert(context2, str, str, baseFragment2.getResourceProvider()) {
                                    @Override
                                    public final void onSend(LongSparseArray longSparseArray, int i4, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                                        String string;
                                        if (z3) {
                                            if (longSparseArray == null || longSparseArray.size() != 1) {
                                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i4, new Object[0]));
                                            } else {
                                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                string = (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                                            }
                                            LinkActionView.this.showBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                                        }
                                    }
                                });
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    default:
                        LinkActionView linkActionView2 = this.f$0;
                        BaseFragment baseFragment3 = baseFragment;
                        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment3.getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.DeleteLink);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.DeleteLinkHelp);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LinkActionView$$ExternalSyntheticLambda9(linkActionView2, 1));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        baseFragment3.showDialog(alertDialog);
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
                        BaseFragment baseFragment2 = baseFragment;
                        final LinkActionView linkActionView = this.f$0;
                        try {
                            if (linkActionView.link != null) {
                                Context context2 = linkActionView.getContext();
                                String str = linkActionView.link;
                                baseFragment2.showDialog(new ShareAlert(context2, str, str, baseFragment2.getResourceProvider()) {
                                    @Override
                                    public final void onSend(LongSparseArray longSparseArray, int i5, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                                        String string;
                                        if (z3) {
                                            if (longSparseArray == null || longSparseArray.size() != 1) {
                                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i5, new Object[0]));
                                            } else {
                                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                string = (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                                            }
                                            LinkActionView.this.showBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                                        }
                                    }
                                });
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    default:
                        LinkActionView linkActionView2 = this.f$0;
                        BaseFragment baseFragment3 = baseFragment;
                        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment3.getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.DeleteLink);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.DeleteLinkHelp);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new LinkActionView$$ExternalSyntheticLambda9(linkActionView2, 1));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        baseFragment3.showDialog(alertDialog);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, context, bottomSheet, baseFragment, 10));
        frameLayout.setOnClickListener(new ChatActivity.AnonymousClass109(this, 7));
        updateColors();
    }

    public static void getPointOnScreen(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
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

    public final void hideRevokeOption(boolean z) {
        if (this.hideRevokeOption != z) {
            this.hideRevokeOption = z;
            ImageView imageView = this.optionsView;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void loadUsers(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j) {
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new LinkManager$$ExternalSyntheticLambda8(2, this, tL_chatInviteExported));
    }

    public void setCanEdit(boolean z) {
        this.canEdit = z;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setLink(String str) {
        this.link = str;
        TextView textView = this.linkView;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z) {
        this.permanent = z;
    }

    public void setQrText(String str) {
        this.qrText = str;
    }

    public void setRevoke(boolean z) {
        TextView textView = this.removeView;
        TextView textView2 = this.copyView;
        TextView textView3 = this.shareView;
        ImageView imageView = this.optionsView;
        if (z) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }

    public final void setUsers(int i, ArrayList arrayList, boolean z) {
        this.usersCount = i;
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = this.avatarsContainer;
        if (i == 0) {
            anonymousClass7.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            anonymousClass7.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) anonymousClass7.rectTmp).setText(LocaleController.formatPluralString("PeopleJoined", i, new Object[0]));
            anonymousClass7.requestLayout();
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i2), false);
            }
            int iMin = Math.min(3, Math.min(i, arrayList.size()));
            ((LinkActionView$AvatarsContainer$1) anonymousClass7.paint).setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                int i4 = UserConfig.selectedAccount;
                ((LinkActionView$AvatarsContainer$1) anonymousClass7.paint).avatarsDrawable.setObject(i3, (TLObject) arrayList.get(i3), i4);
            }
        } else {
            ((LinkActionView$AvatarsContainer$1) anonymousClass7.paint).setCount(0);
        }
        ((LinkActionView$AvatarsContainer$1) anonymousClass7.paint).avatarsDrawable.commitTransition(z, true);
    }

    public void showBulletin(int i, SpannableStringBuilder spannableStringBuilder) {
        Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(this.fragment).createSimpleBulletinWithIconSize(i, 36, spannableStringBuilder);
        bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletinWithIconSize.show(true);
    }

    public final void updateColors() {
        int i = Theme.key_featuredStickers_buttonText;
        int color = Theme.getColor(null, i, false);
        TextView textView = this.copyView;
        textView.setTextColor(color);
        int color2 = Theme.getColor(null, i, false);
        TextView textView2 = this.shareView;
        textView2.setTextColor(color2);
        int color3 = Theme.getColor(null, i, false);
        TextView textView3 = this.removeView;
        textView3.setTextColor(color3);
        int iDp = AndroidUtilities.dp(21.0f);
        int i2 = Theme.key_featuredStickers_addButton;
        int color4 = Theme.getColor(null, i2, false);
        int i3 = Theme.key_featuredStickers_addButtonPressed;
        int color5 = Theme.getColor(null, i3, false);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color4, color5, color5));
        int iDp2 = AndroidUtilities.dp(21.0f);
        int color6 = Theme.getColor(null, i2, false);
        int color7 = Theme.getColor(null, i3, false);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color6, color7, color7));
        int iDp3 = AndroidUtilities.dp(21.0f);
        int color8 = Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, color8, alphaComponent, alphaComponent));
        int iDp4 = AndroidUtilities.dp(21.0f);
        int color9 = Theme.getColor(null, Theme.key_graySection, false);
        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_listSelector, false), 76);
        this.frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp4, iDp4, iDp4, iDp4, color9, alphaComponent2, alphaComponent2));
        this.linkView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.optionsView.setColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = this.avatarsContainer;
        TextView textView4 = (TextView) anonymousClass7.rectTmp;
        int i4 = Theme.key_windowBackgroundWhiteBlueText;
        textView4.setTextColor(Theme.getColor(null, i4, false));
        int iDp5 = AndroidUtilities.dp(6.0f);
        int alphaComponent3 = ColorUtils.setAlphaComponent(Theme.getColor(null, i4, false), 76);
        anonymousClass7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp5, iDp5, iDp5, iDp5, 0, alphaComponent3, alphaComponent3));
        AnonymousClass6 anonymousClass6 = this.qrCodeBottomSheet;
        if (anonymousClass6 != null) {
            anonymousClass6.updateColors$1();
        }
    }
}
