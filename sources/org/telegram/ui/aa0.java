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
    public final LaunchActivity f34755a;
    public final org.telegram.ui.ActionBar.n2 f34756b;
    public final int f34757c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f34758e;
    public final AtomicBoolean f34759f;
    public final String h;
    public final boolean f34760n;
    public final boolean f34761r;
    public final boolean f34762s;
    public final boolean v;

    public aa0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34755a = launchActivity;
        this.f34756b = n2Var;
        this.f34757c = i10;
        this.d = user;
        this.f34758e = tL_messages_botApp;
        this.f34759f = atomicBoolean;
        this.h = str;
        this.f34760n = z10;
        this.f34761r = z11;
        this.f34762s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f34756b;
        if (n2Var != null && LaunchActivity.C1) {
            LaunchActivity launchActivity = this.f34755a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f20189id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f34758e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f34759f.get();
                int i10 = this.f34757c;
                String str = this.h;
                boolean z11 = this.f34760n;
                boolean z12 = this.f34761r;
                ei.f5 b10 = ei.f5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f20189id, true);
                    ei.l3 l3Var = new ei.l3(launchActivity, n2Var.getResourceProvider());
                    ei.c3 c3Var = l3Var.f9181x;
                    if (c3Var != null) {
                        c3Var.setWasOpenedByLinkIntent(this.f34762s);
                    }
                    l3Var.w(!z11);
                    if (z12) {
                        l3Var.x(true, false, l3Var.f9158e0);
                    }
                    l3Var.A0 = false;
                    l3Var.f9165k0 = launchActivity;
                    l3Var.s(n2Var, b10);
                    l3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(l3Var.G).getUser(Long.valueOf(l3Var.H));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(l3Var.G).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == l3Var.H) {
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
                            AndroidUtilities.runOnUIThread(new ci.x8(18, l3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
