package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class hx0 extends org.telegram.ui.ActionBar.j {
    public final String f46423a;
    public final kx0 f46424b;

    public hx0(kx0 kx0Var, String str) {
        this.f46424b = kx0Var;
        this.f46423a = str;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        kx0 kx0Var = this.f46424b;
        long j3 = kx0Var.h;
        long j10 = kx0Var.f47403f;
        String str = this.f46423a;
        if (i7 == -1) {
            if (!kx0Var.f47404n && kx0Var.f47405r) {
                i16 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i16).f24764d7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).f24764d7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(i11).Q.f(j10);
            if (kx0Var.f47405r) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                    org.telegram.messenger.dt.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
            org.telegram.messenger.dt.t(i14).c0(kx0Var.f47403f, kx0Var.h, true);
            if (kx0Var.f47406s != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f49060b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                obj.f49061c = c10;
                if (c10 != 0) {
                    obj.f49059a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                kx0Var.f47406s.t(obj);
            }
        }
        kx0Var.finishFragment();
    }
}
