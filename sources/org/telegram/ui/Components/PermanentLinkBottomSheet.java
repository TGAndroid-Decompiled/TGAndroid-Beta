package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.GroupCreateActivity;

public final class PermanentLinkBottomSheet extends BottomSheet {
    public final long chatId;
    public final RLottieImageView imageView;
    public TLRPC.TL_chatInviteExported invite;
    public final LinkActionView linkActionView;
    public boolean linkGenerating;
    public final RLottieDrawable linkIcon;
    public final TextView manage;
    public final TextView subtitle;
    public final TextView titleView;

    public PermanentLinkBottomSheet(Context context, GroupCreateActivity groupCreateActivity, TLRPC.ChatFull chatFull, long j, boolean z) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        super(context, null, false, false);
        this.chatId = j;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(Theme.key_windowBackgroundWhite));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
        imageView.setColorFilter(getThemedColor(Theme.key_sheet_other));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 11));
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        LinkActionView linkActionView = new LinkActionView(context, groupCreateActivity, this, true, z);
        this.linkActionView = linkActionView;
        linkActionView.setPermanent(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        int i = R.raw.shared_link_enter;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.linkIcon = rLottieDrawable;
        rLottieDrawable.setCustomEndFrame(42);
        rLottieImageView.setAnimation(rLottieDrawable);
        linkActionView.setUsers(0, null, false);
        linkActionView.hideRevokeOption(true);
        linkActionView.setDelegate(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 12));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        TextView textView2 = new TextView(context);
        this.subtitle = textView2;
        textView2.setText(LocaleController.getString(z ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.manage = textView3;
        zzkg.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i2 = Theme.key_featuredStickers_addButton;
        textView3.setTextColor(Theme.getColor(null, i2, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i2, false), 120);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent, alphaComponent));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, chatFull, groupCreateActivity, 26));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(linkActionView, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j));
        if (chat != null && ChatObject.isPublic(chat)) {
            linkActionView.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
            generateLink$2(false);
        } else {
            linkActionView.setLink(tL_chatInviteExported.link);
        }
        updateColors$10();
    }

    public final void generateLink$2(boolean z) {
        if (this.linkGenerating) {
            return;
        }
        this.linkGenerating = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new CallLogActivity$$ExternalSyntheticLambda31(6, this, z));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 17);
        arrayList.add(new ThemeDescription(this.titleView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.subtitle, 4, null, null, null, null, Theme.key_dialogTextBlack));
        int i = Theme.key_featuredStickers_addButton;
        arrayList.add(new ThemeDescription(this.manage, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        return arrayList;
    }

    public final void lambda$generateLink$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.invite = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (chatFull != null) {
                chatFull.exported_invite = this.invite;
            }
            this.linkActionView.setLink(this.invite.link);
        }
        this.linkGenerating = false;
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 4), 50L);
    }

    public final void updateColors$10() {
        int iDp = AndroidUtilities.dp(90.0f);
        int i = Theme.key_featuredStickers_addButton;
        this.imageView.setBackground(Theme.createCircleDrawable(iDp, Theme.getColor(null, i, false)));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 120);
        this.manage.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent, alphaComponent));
        int color = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        RLottieDrawable rLottieDrawable = this.linkIcon;
        OKLCH.m(color, rLottieDrawable.newColorUpdates, "Top", rLottieDrawable);
        OKLCH.m(color, rLottieDrawable.newColorUpdates, "Bottom", rLottieDrawable);
        OKLCH.m(color, rLottieDrawable.newColorUpdates, "Center", rLottieDrawable);
        this.linkActionView.updateColors();
        setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
    }
}
