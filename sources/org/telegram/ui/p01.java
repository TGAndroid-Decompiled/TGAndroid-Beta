package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class p01 extends org.telegram.ui.ActionBar.j {
    public final String f41309a;
    public final s01 f41310b;

    public p01(s01 s01Var, String str) {
        this.f41310b = s01Var;
        this.f41309a = str;
    }

    @Override
    public final void b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        s01 s01Var = this.f41310b;
        long j10 = s01Var.f42523f;
        long j11 = s01Var.f42522e;
        String str = this.f41309a;
        if (i9 == -1) {
            if (!s01Var.h && s01Var.f42524n) {
                i16 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i16).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i9 == 1) {
            i10 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(j11);
            if (s01Var.f42524n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    MessagesStorage.getInstance(i15).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    NotificationsController.getInstance(i12).removeNotificationsForDialog(j11);
                    i13 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    MessagesStorage.getInstance(i13).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            NotificationsController.getInstance(i14).updateServerNotificationsSettings(j11, j10);
            if (s01Var.f42525r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f37982b = true;
                int c10 = org.telegram.messenger.l0.c("notify2_", str, notificationsSettings, 0);
                obj.f37983c = c10;
                if (c10 != 0) {
                    obj.f37981a = org.telegram.messenger.l0.c("notifyuntil_", str, notificationsSettings, 0);
                }
                s01Var.f42525r.g(obj);
            }
        }
        s01Var.finishFragment();
    }
}
