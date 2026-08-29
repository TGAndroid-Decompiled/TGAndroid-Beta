package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class q01 extends org.telegram.ui.ActionBar.k {
    public final String f41501a;
    public final t01 f41502b;

    public q01(t01 t01Var, String str) {
        this.f41502b = t01Var;
        this.f41501a = str;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        t01 t01Var = this.f41502b;
        long j10 = t01Var.f42515f;
        long j11 = t01Var.f42514e;
        String str = this.f41501a;
        if (i10 == -1) {
            if (!t01Var.h && t01Var.f42516n) {
                i17 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (t01Var.f42516n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (t01Var.f42517r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f36820b = true;
                int c3 = org.telegram.messenger.x3.c("notify2_", str, notificationsSettings, 0);
                obj.f36821c = c3;
                if (c3 != 0) {
                    obj.f36819a = org.telegram.messenger.x3.c("notifyuntil_", str, notificationsSettings, 0);
                }
                t01Var.f42517r.m(obj);
            }
        }
        t01Var.finishFragment();
    }
}
