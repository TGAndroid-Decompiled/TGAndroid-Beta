package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class LaunchActivity$$ExternalSyntheticLambda176 implements Runnable {
    public final LaunchActivity f$0;
    public final BaseFragment f$1;
    public final boolean f$10;
    public final int f$2;
    public final TLRPC.User f$3;
    public final TLRPC.TL_messages_botApp f$4;
    public final AtomicBoolean f$5;
    public final String f$6;
    public final boolean f$7;
    public final boolean f$8;
    public final boolean f$9;

    public LaunchActivity$$ExternalSyntheticLambda176(LaunchActivity launchActivity, BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f$0 = launchActivity;
        this.f$1 = baseFragment;
        this.f$2 = i;
        this.f$3 = user;
        this.f$4 = tL_messages_botApp;
        this.f$5 = atomicBoolean;
        this.f$6 = str;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$9 = z3;
        this.f$10 = z4;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String string;
        LaunchActivity launchActivity = this.f$0;
        launchActivity.getClass();
        BaseFragment baseFragment = this.f$1;
        if (baseFragment == null || !LaunchActivity.isActive || launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.f$3;
        long j = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.f$4;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z = this.f$5.get();
        int i = this.f$2;
        String str = this.f$6;
        boolean z2 = this.f$7;
        boolean z3 = this.f$8;
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, null, null, 3, 0, 0L, botApp, z, str, user, 0, z2, z3);
        if (launchActivity.getBottomSheetTabs() == null || launchActivity.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.currentAccount, user.id, true);
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(launchActivity, baseFragment.getResourceProvider());
            BotWebViewSheet.AnonymousClass2 anonymousClass2 = botWebViewSheet.webViewContainer;
            if (anonymousClass2 != null) {
                anonymousClass2.setWasOpenedByLinkIntent(this.f$9);
            }
            botWebViewSheet.setDefaultFullsize(!z2);
            if (z3) {
                botWebViewSheet.setFullscreen(true, false, botWebViewSheet.fullscreenBlur);
            }
            botWebViewSheet.needsContext = false;
            botWebViewSheet.parentActivity = launchActivity;
            botWebViewSheet.requestWebView(baseFragment, webViewRequestPropsOf);
            botWebViewSheet.show();
            if (tL_messages_botApp.inactive || this.f$10) {
                TLRPC.User user2 = MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(botWebViewSheet.currentAccount).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    } else {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                        i2++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                    }
                } while (tL_attachMenuBot.bot_id != botWebViewSheet.botId);
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z4 = tL_attachMenuBot.show_in_side_menu;
                if (z4 && tL_attachMenuBot.show_in_attach_menu) {
                    string = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name);
                } else {
                    string = z4 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name);
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(3, botWebViewSheet, string), 200L);
            }
        }
    }
}
