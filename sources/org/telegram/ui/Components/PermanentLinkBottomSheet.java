package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ManageLinksActivity;

public class PermanentLinkBottomSheet extends BottomSheet {
    private final long chatId;
    private BaseFragment fragment;
    private final RLottieImageView imageView;
    TLRPC.TL_chatInviteExported invite;
    private final LinkActionView linkActionView;
    boolean linkGenerating;
    private final RLottieDrawable linkIcon;
    private final TextView manage;
    private final TextView subtitle;
    private final TextView titleView;

    public PermanentLinkBottomSheet(Context context, boolean z, BaseFragment baseFragment, TLRPC.ChatFull chatFull, long j, boolean z2) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        super(context, z, false, null);
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
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 7));
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        LinkActionView linkActionView = new LinkActionView(context, baseFragment, this, j, true, z2);
        this.linkActionView = linkActionView;
        linkActionView.setPermanent(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        int i = R.raw.shared_link_enter;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.linkIcon = rLottieDrawable;
        rLottieDrawable.setCustomEndFrame(42);
        rLottieImageView.setAnimation(rLottieDrawable);
        linkActionView.setUsers(0, null);
        linkActionView.hideRevokeOption(true);
        linkActionView.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(this, 7));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        TextView textView2 = new TextView(context);
        this.subtitle = textView2;
        textView2.setText(LocaleController.getString(z2 ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.manage = textView3;
        textView3.setText(LocaleController.getString(R.string.ManageInviteLinks));
        textView3.setGravity(17);
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
        textView3.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, chatFull, baseFragment, 15));
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
            generateLink(false);
        } else {
            linkActionView.setLink(tL_chatInviteExported.link);
        }
        updateColors();
    }

    private void generateLink(final boolean z) {
        if (this.linkGenerating) {
            return;
        }
        this.linkGenerating = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$generateLink$4(z, tLObject, tL_error);
            }
        });
    }

    public void lambda$generateLink$3(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            this.invite = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (chatFull != null) {
                chatFull.exported_invite = this.invite;
            }
            this.linkActionView.setLink(this.invite.link);
            if (z && this.fragment != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
                builder.setMessage(LocaleController.getString(R.string.RevokeAlertNewLink));
                builder.setTitle(LocaleController.getString(R.string.RevokeLink));
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                this.fragment.showDialog(builder.create());
            }
        }
        this.linkGenerating = false;
    }

    public void lambda$generateLink$4(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda3(tLObject, tL_error, this, z));
    }

    public void lambda$new$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1() {
        generateLink(true);
    }

    public void lambda$new$2(TLRPC.ChatFull chatFull, BaseFragment baseFragment, View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(chatFull.id, 0L, 0);
        manageLinksActivity.setInfo(chatFull, chatFull.exported_invite);
        baseFragment.presentFragment(manageLinksActivity);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$show$5() {
        this.linkIcon.start();
    }

    public void updateColors() {
        RLottieImageView rLottieImageView = this.imageView;
        int iDp = AndroidUtilities.dp(90.0f);
        int i = Theme.key_featuredStickers_addButton;
        rLottieImageView.setBackground(Theme.createCircleDrawable(iDp, Theme.getColor(null, i, false)));
        TextView textView = this.manage;
        int iDp2 = AndroidUtilities.dp(8.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 120);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent, alphaComponent));
        int color = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
        this.linkIcon.setLayerColor("Top", color);
        this.linkIcon.setLayerColor("Bottom", color);
        this.linkIcon.setLayerColor("Center", color);
        this.linkActionView.updateColors();
        setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ColorPicker$$ExternalSyntheticLambda7 colorPicker$$ExternalSyntheticLambda7 = new ColorPicker$$ExternalSyntheticLambda7(this, 5);
        arrayList.add(new ThemeDescription(this.titleView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.subtitle, 4, null, null, null, null, Theme.key_dialogTextBlack));
        TextView textView = this.manage;
        int i = Theme.key_featuredStickers_addButton;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_windowBackgroundWhiteBlueText));
        return arrayList;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new GroupCallPip$$ExternalSyntheticLambda2(this, 26), 50L);
    }
}
