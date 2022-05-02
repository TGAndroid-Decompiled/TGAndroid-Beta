package org.telegram.p009ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.LinkActionView;
import org.telegram.p009ui.ManageLinksActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_exportChatInvite;

public class PermanentLinkBottomSheet extends BottomSheet {
    private long chatId;
    private BaseFragment fragment;
    private final RLottieImageView imageView;
    TLRPC$TL_chatInviteExported invite;
    private final LinkActionView linkActionView;
    boolean linkGenerating;
    RLottieDrawable linkIcon;
    private final TextView manage;
    private final TextView subtitle;
    private final TextView titleView;

    public PermanentLinkBottomSheet(Context context, boolean z, final BaseFragment baseFragment, final TLRPC$ChatFull tLRPC$ChatFull, long j, boolean z2) {
        super(context, z);
        String str;
        int i;
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported;
        this.chatId = j;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        LinkActionView linkActionView = new LinkActionView(context, baseFragment, this, j, true, z2);
        this.linkActionView = linkActionView;
        linkActionView.setPermanent(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(C0952R.raw.shared_link_enter, "2131558513", AndroidUtilities.m34dp(90.0f), AndroidUtilities.m34dp(90.0f), false, null);
        this.linkIcon = rLottieDrawable;
        rLottieDrawable.setCustomEndFrame(42);
        rLottieImageView.setAnimation(this.linkIcon);
        linkActionView.setUsers(0, null);
        linkActionView.hideRevokeOption(true);
        linkActionView.setDelegate(new LinkActionView.Delegate() {
            @Override
            public void editLink() {
                LinkActionView.Delegate.CC.$default$editLink(this);
            }

            @Override
            public void removeLink() {
                LinkActionView.Delegate.CC.$default$removeLink(this);
            }

            @Override
            public final void revokeLink() {
                PermanentLinkBottomSheet.this.lambda$new$0();
            }

            @Override
            public void showUsersForPermanentLink() {
                LinkActionView.Delegate.CC.$default$showUsersForPermanentLink(this);
            }
        });
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setText(LocaleController.getString("InviteLink", C0952R.string.InviteLink));
        textView.setTextSize(24.0f);
        textView.setGravity(1);
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        TextView textView2 = new TextView(context);
        this.subtitle = textView2;
        if (z2) {
            i = C0952R.string.LinkInfoChannel;
            str = "LinkInfoChannel";
        } else {
            i = C0952R.string.LinkInfo;
            str = "LinkInfo";
        }
        textView2.setText(LocaleController.getString(str, i));
        textView2.setTextSize(14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        TextView textView3 = new TextView(context);
        this.manage = textView3;
        textView3.setText(LocaleController.getString("ManageInviteLinks", C0952R.string.ManageInviteLinks));
        textView3.setTextSize(14.0f);
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText"));
        textView3.setBackground(Theme.createRadSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor("windowBackgroundWhiteBlueText"), 76), AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(4.0f)));
        textView3.setPadding(AndroidUtilities.m34dp(12.0f), AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(12.0f), AndroidUtilities.m34dp(4.0f));
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PermanentLinkBottomSheet.this.lambda$new$1(tLRPC$ChatFull, baseFragment, view);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(90, 90, 1, 0, 24, 0, 0));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 60, 16, 60, 0));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 60, 16, 60, 0));
        linearLayout.addView(linkActionView, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 60, 26, 60, 26));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(linearLayout);
        setCustomView(nestedScrollView);
        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j));
        if (chat != null && chat.username != null) {
            linkActionView.setLink("https://t.me/" + chat.username);
            textView3.setVisibility(8);
        } else if (tLRPC$ChatFull == null || (tLRPC$TL_chatInviteExported = tLRPC$ChatFull.exported_invite) == null) {
            generateLink(false);
        } else {
            linkActionView.setLink(tLRPC$TL_chatInviteExported.link);
        }
        updateColors();
    }

    public void lambda$new$0() {
        generateLink(true);
    }

    public void lambda$new$1(TLRPC$ChatFull tLRPC$ChatFull, BaseFragment baseFragment, View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(tLRPC$ChatFull.f855id, 0L, 0);
        manageLinksActivity.setInfo(tLRPC$ChatFull, tLRPC$ChatFull.exported_invite);
        baseFragment.presentFragment(manageLinksActivity);
        dismiss();
    }

    private void generateLink(final boolean z) {
        if (!this.linkGenerating) {
            this.linkGenerating = true;
            TLRPC$TL_messages_exportChatInvite tLRPC$TL_messages_exportChatInvite = new TLRPC$TL_messages_exportChatInvite();
            tLRPC$TL_messages_exportChatInvite.legacy_revoke_permanent = true;
            tLRPC$TL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_exportChatInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PermanentLinkBottomSheet.this.lambda$generateLink$3(z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$generateLink$3(final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PermanentLinkBottomSheet.this.lambda$generateLink$2(tLRPC$TL_error, tLObject, z);
            }
        });
    }

    public void lambda$generateLink$2(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, boolean z) {
        if (tLRPC$TL_error == null) {
            this.invite = (TLRPC$TL_chatInviteExported) tLObject;
            TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (chatFull != null) {
                chatFull.exported_invite = this.invite;
            }
            this.linkActionView.setLink(this.invite.link);
            if (z && this.fragment != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(LocaleController.getString("RevokeAlertNewLink", C0952R.string.RevokeAlertNewLink));
                builder.setTitle(LocaleController.getString("RevokeLink", C0952R.string.RevokeLink));
                builder.setNegativeButton(LocaleController.getString("OK", C0952R.string.OK), null);
                this.fragment.showDialog(builder.create());
            }
        }
        this.linkGenerating = false;
    }

    @Override
    public void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PermanentLinkBottomSheet.this.lambda$show$4();
            }
        }, 50L);
    }

    public void lambda$show$4() {
        this.linkIcon.start();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate permanentLinkBottomSheet$$ExternalSyntheticLambda4 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                PermanentLinkBottomSheet.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.manage, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, permanentLinkBottomSheet$$ExternalSyntheticLambda4, "featuredStickers_addButton"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, permanentLinkBottomSheet$$ExternalSyntheticLambda4, "featuredStickers_buttonText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, permanentLinkBottomSheet$$ExternalSyntheticLambda4, "windowBackgroundWhiteBlueText"));
        return arrayList;
    }

    public void updateColors() {
        this.imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.m34dp(90.0f), Theme.getColor("featuredStickers_addButton")));
        this.manage.setBackground(Theme.createRadSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor("windowBackgroundWhiteBlueText"), 76), AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(4.0f)));
        int color = Theme.getColor("featuredStickers_buttonText");
        this.linkIcon.setLayerColor("Top.**", color);
        this.linkIcon.setLayerColor("Bottom.**", color);
        this.linkIcon.setLayerColor("Center.**", color);
        this.linkActionView.updateColors();
        setBackgroundColor(Theme.getColor("dialogBackground"));
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
    }

    @Override
    public void dismiss() {
        super.dismiss();
    }
}
