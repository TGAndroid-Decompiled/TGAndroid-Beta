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
public final class ca0 implements Runnable {
    public final LaunchActivity f32709a;
    public final org.telegram.ui.ActionBar.o2 f32710b;
    public final int f32711c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f32712f;
    public final String h;
    public final boolean f32713n;
    public final boolean f32714r;
    public final boolean f32715s;
    public final boolean v;

    public ca0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f32709a = launchActivity;
        this.f32710b = o2Var;
        this.f32711c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f32712f = atomicBoolean;
        this.h = str;
        this.f32713n = z10;
        this.f32714r = z11;
        this.f32715s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32710b;
        if (o2Var != null && LaunchActivity.C1) {
            LaunchActivity launchActivity = this.f32709a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f18268id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f32712f.get();
                int i10 = this.f32711c;
                String str = this.h;
                boolean z11 = this.f32713n;
                boolean z12 = this.f32714r;
                ei.f5 b10 = ei.f5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f18268id, true);
                    ei.k3 k3Var = new ei.k3(launchActivity, o2Var.getResourceProvider());
                    ei.b3 b3Var = k3Var.f8456x;
                    if (b3Var != null) {
                        b3Var.setWasOpenedByLinkIntent(this.f32715s);
                    }
                    k3Var.w(!z11);
                    if (z12) {
                        k3Var.x(true, false, k3Var.f8433e0);
                    }
                    k3Var.A0 = false;
                    k3Var.f8440k0 = launchActivity;
                    k3Var.s(o2Var, b10);
                    k3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(k3Var.G).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == k3Var.H) {
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
                            AndroidUtilities.runOnUIThread(new ci.b9(18, k3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
