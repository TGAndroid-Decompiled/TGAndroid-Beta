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
public final class l90 implements Runnable {
    public final LaunchActivity f38775a;
    public final org.telegram.ui.ActionBar.n2 f38776b;
    public final int f38777c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f38778f;
    public final String h;
    public final boolean f38779n;
    public final boolean f38780r;
    public final boolean f38781s;
    public final boolean v;

    public l90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38775a = launchActivity;
        this.f38776b = n2Var;
        this.f38777c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f38778f = atomicBoolean;
        this.h = str;
        this.f38779n = z10;
        this.f38780r = z11;
        this.f38781s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.C1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f38776b;
        if (n2Var != null && LaunchActivity.D1) {
            LaunchActivity launchActivity = this.f38775a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f20419id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f38778f.get();
                int i10 = this.f38777c;
                String str = this.h;
                boolean z11 = this.f38779n;
                boolean z12 = this.f38780r;
                gi.t4 b10 = gi.t4.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f20419id, true);
                    gi.d3 d3Var = new gi.d3(launchActivity, n2Var.getResourceProvider());
                    gi.v2 v2Var = d3Var.f11165x;
                    if (v2Var != null) {
                        v2Var.setWasOpenedByLinkIntent(this.f38781s);
                    }
                    d3Var.x(!z11);
                    if (z12) {
                        d3Var.y(true, false, d3Var.f11142e0);
                    }
                    d3Var.A0 = false;
                    d3Var.f11149k0 = launchActivity;
                    d3Var.t(n2Var, b10);
                    d3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(d3Var.G).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == d3Var.H) {
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
                            AndroidUtilities.runOnUIThread(new ei.p6(17, d3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
