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
public final class aa0 implements Runnable {
    public final LaunchActivity f30844a;
    public final org.telegram.ui.ActionBar.p2 f30845b;
    public final int f30846c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f30847f;
    public final String h;
    public final boolean f30848n;
    public final boolean f30849r;
    public final boolean f30850s;
    public final boolean v;

    public aa0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30844a = launchActivity;
        this.f30845b = p2Var;
        this.f30846c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f30847f = atomicBoolean;
        this.h = str;
        this.f30848n = z10;
        this.f30849r = z11;
        this.f30850s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f30845b;
        if (p2Var != null && LaunchActivity.C1) {
            LaunchActivity launchActivity = this.f30844a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f17342id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f30847f.get();
                int i10 = this.f30846c;
                String str = this.h;
                boolean z11 = this.f30848n;
                boolean z12 = this.f30849r;
                di.j5 b10 = di.j5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f17342id, true);
                    di.n3 n3Var = new di.n3(launchActivity, p2Var.getResourceProvider());
                    di.e3 e3Var = n3Var.f6812x;
                    if (e3Var != null) {
                        e3Var.setWasOpenedByLinkIntent(this.f30850s);
                    }
                    n3Var.w(!z11);
                    if (z12) {
                        n3Var.x(true, false, n3Var.f6789e0);
                    }
                    n3Var.A0 = false;
                    n3Var.f6796k0 = launchActivity;
                    n3Var.s(p2Var, b10);
                    n3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(n3Var.G).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == n3Var.H) {
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
                            AndroidUtilities.runOnUIThread(new bi.af(12, n3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
