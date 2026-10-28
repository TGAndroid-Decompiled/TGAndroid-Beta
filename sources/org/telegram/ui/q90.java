package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
public final class q90 implements Runnable {
    public final LaunchActivity f42639a;
    public final org.telegram.ui.ActionBar.r2 f42640b;
    public final int f42641c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f42642f;
    public final String h;
    public final boolean f42643n;
    public final boolean f42644r;
    public final boolean f42645s;
    public final boolean v;

    public q90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f42639a = launchActivity;
        this.f42640b = r2Var;
        this.f42641c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f42642f = atomicBoolean;
        this.h = str;
        this.f42643n = z10;
        this.f42644r = z11;
        this.f42645s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.r2 r2Var = this.f42640b;
        if (r2Var != null && LaunchActivity.E1) {
            LaunchActivity launchActivity = this.f42639a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f22177id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f42642f.get();
                int i10 = this.f42641c;
                String str = this.h;
                boolean z11 = this.f42643n;
                boolean z12 = this.f42644r;
                hi.c5 b10 = hi.c5.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f22177id, true);
                    hi.m3 m3Var = new hi.m3(launchActivity, r2Var.getResourceProvider());
                    hi.e3 e3Var = m3Var.f13132y;
                    if (e3Var != null) {
                        e3Var.setWasOpenedByLinkIntent(this.f42645s);
                    }
                    m3Var.x(!z11);
                    if (z12) {
                        m3Var.y(true, false, m3Var.f13109f0);
                    }
                    m3Var.B0 = false;
                    m3Var.f13115l0 = launchActivity;
                    m3Var.t(r2Var, b10);
                    m3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(m3Var.H).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == m3Var.I) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z13 = tL_attachMenuBot.show_in_side_menu;
                            if (z13 && tL_attachMenuBot.show_in_attach_menu) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name);
                            } else if (z13) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name);
                            } else {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name);
                            }
                            AndroidUtilities.runOnUIThread(new hi.u2(0, m3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
