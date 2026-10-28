package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class g11 extends org.telegram.ui.ActionBar.j {
    public final String f39473a;
    public final j11 f39474b;

    public g11(j11 j11Var, String str) {
        this.f39474b = j11Var;
        this.f39473a = str;
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
        j11 j11Var = this.f39474b;
        long j10 = j11Var.h;
        long j11 = j11Var.f40352f;
        String str = this.f39473a;
        if (i10 == -1) {
            if (!j11Var.f40353n && j11Var.f40354r) {
                i17 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (j11Var.f40354r) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (j11Var.f40355s != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f42740b = true;
                int d = org.telegram.messenger.t.d("notify2_", str, notificationsSettings, 0);
                obj.f42741c = d;
                if (d != 0) {
                    obj.f42739a = org.telegram.messenger.t.d("notifyuntil_", str, notificationsSettings, 0);
                }
                j11Var.f40355s.t(obj);
            }
        }
        j11Var.finishFragment();
    }
}
