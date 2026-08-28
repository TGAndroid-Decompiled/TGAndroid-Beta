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
public final class f90 implements Runnable {
    public final LaunchActivity f38164a;
    public final org.telegram.ui.ActionBar.o2 f38165b;
    public final int f38166c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f38167e;
    public final AtomicBoolean f38168f;
    public final String h;
    public final boolean f38169n;
    public final boolean f38170r;
    public final boolean f38171s;
    public final boolean v;

    public f90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38164a = launchActivity;
        this.f38165b = o2Var;
        this.f38166c = i9;
        this.d = user;
        this.f38167e = tL_messages_botApp;
        this.f38168f = atomicBoolean;
        this.h = str;
        this.f38169n = z10;
        this.f38170r = z11;
        this.f38171s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.f35493x1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f38165b;
        if (o2Var != null && LaunchActivity.f35494y1) {
            LaunchActivity launchActivity = this.f38164a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f22527id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f38167e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f38168f.get();
                int i9 = this.f38166c;
                String str = this.h;
                boolean z11 = this.f38169n;
                boolean z12 = this.f38170r;
                mh.s4 b10 = mh.s4.b(i9, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.K, user.f22527id, true);
                    mh.c3 c3Var = new mh.c3(launchActivity, o2Var.getResourceProvider());
                    mh.u2 u2Var = c3Var.f17778x;
                    if (u2Var != null) {
                        u2Var.setWasOpenedByLinkIntent(this.f38171s);
                    }
                    c3Var.w(!z11);
                    if (z12) {
                        c3Var.x(true, false, c3Var.f17748a0);
                    }
                    c3Var.f17777w0 = false;
                    c3Var.f17758g0 = launchActivity;
                    c3Var.s(o2Var, b10);
                    c3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(c3Var.C).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == c3Var.D) {
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
                            AndroidUtilities.runOnUIThread(new kh.o8(6, c3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
