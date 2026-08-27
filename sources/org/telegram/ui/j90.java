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

    public final LaunchActivity f39303a;

    public final org.telegram.ui.ActionBar.n2 f39304b;

    public final int f39305c;
    public final TLRPC.User d;

    public final TLRPC.TL_messages_botApp f39306e;

    public final AtomicBoolean f39307f;
    public final String h;

    public final boolean f39308n;

    public final boolean f39309r;

    public final boolean f39310s;
    public final boolean v;

    public j90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f39303a = launchActivity;
        this.f39304b = n2Var;
        this.f39305c = i10;
        this.d = user;
        this.f39306e = tL_messages_botApp;
        this.f39307f = atomicBoolean;
        this.h = str;
        this.f39308n = z10;
        this.f39309r = z11;
        this.f39310s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String string;
        Pattern pattern = LaunchActivity.f35496x1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f39304b;
        if (n2Var == null || !LaunchActivity.f35497y1) {
            return;
        }
        LaunchActivity launchActivity = this.f39303a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j10 = user.f22527id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.f39306e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z10 = this.f39307f.get();
        int i10 = this.f39305c;
        String str = this.h;
        boolean z11 = this.f39308n;
        boolean z12 = this.f39309r;
        nh.q4 q4VarB = nh.q4.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
        if (launchActivity.P() == null || launchActivity.P().k(q4VarB) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.K, user.f22527id, true);
            nh.b3 b3Var = new nh.b3(launchActivity, n2Var.getResourceProvider());
            nh.t2 t2Var = b3Var.f18599x;
            if (t2Var != null) {
                t2Var.setWasOpenedByLinkIntent(this.f39310s);
            }
            b3Var.w(!z11);
            if (z12) {
                b3Var.x(true, false, b3Var.f18569a0);
            }
            b3Var.f18598w0 = false;
            b3Var.f18579g0 = launchActivity;
            b3Var.s(n2Var, q4VarB);
            b3Var.show();
            if (tL_messages_botApp.inactive || this.v) {
                TLRPC.User user2 = MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(b3Var.C).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i11 = 0;
                do {
                    if (i11 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    } else {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                        i11++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                    }
                } while (tL_attachMenuBot.bot_id != b3Var.D);
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                if (z13 && tL_attachMenuBot.show_in_attach_menu) {
                    string = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name);
                } else {
                    string = z13 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name);
                }
                AndroidUtilities.runOnUIThread(new lh.k7(12, b3Var, string), 200L);
            }
        }
    }
}
