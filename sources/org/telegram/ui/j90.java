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
public final class j90 implements Runnable {
    public final LaunchActivity f39475a;
    public final org.telegram.ui.ActionBar.o2 f39476b;
    public final int f39477c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f39478e;
    public final AtomicBoolean f39479f;
    public final String h;
    public final boolean f39480n;
    public final boolean f39481r;
    public final boolean f39482s;
    public final boolean v;

    public j90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f39475a = launchActivity;
        this.f39476b = o2Var;
        this.f39477c = i10;
        this.d = user;
        this.f39478e = tL_messages_botApp;
        this.f39479f = atomicBoolean;
        this.h = str;
        this.f39480n = z10;
        this.f39481r = z11;
        this.f39482s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.f35560x1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f39476b;
        if (o2Var != null && LaunchActivity.f35561y1) {
            LaunchActivity launchActivity = this.f39475a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f22539id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f39478e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f39479f.get();
                int i10 = this.f39477c;
                String str = this.h;
                boolean z11 = this.f39480n;
                boolean z12 = this.f39481r;
                ph.y3 b10 = ph.y3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().m(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.K, user.f22539id, true);
                    ph.p2 p2Var = new ph.p2(launchActivity, o2Var.getResourceProvider());
                    ph.h2 h2Var = p2Var.f45987x;
                    if (h2Var != null) {
                        h2Var.setWasOpenedByLinkIntent(this.f39482s);
                    }
                    p2Var.w(!z11);
                    if (z12) {
                        p2Var.x(true, false, p2Var.f45957a0);
                    }
                    p2Var.f45986w0 = false;
                    p2Var.f45967g0 = launchActivity;
                    p2Var.s(o2Var, b10);
                    p2Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(p2Var.C).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == p2Var.D) {
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
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(11, p2Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
