package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class ex0 extends org.telegram.ui.ActionBar.j {
    public final String f47642a;
    public final hx0 f47643b;

    public ex0(hx0 hx0Var, String str) {
        this.f47643b = hx0Var;
        this.f47642a = str;
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
        hx0 hx0Var = this.f47643b;
        long j3 = hx0Var.h;
        long j10 = hx0Var.f48650f;
        String str = this.f47642a;
        if (i7 == -1) {
            if (!hx0Var.f48651n && hx0Var.f48652r) {
                i16 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i16).f25753g7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).f25753g7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(i11).R.f(j10);
            if (hx0Var.f48652r) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.xs.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            org.telegram.messenger.xs.t(i14).c0(hx0Var.f48650f, hx0Var.h, true);
            if (hx0Var.f48653s != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f52087b = true;
                int c10 = org.telegram.messenger.f3.c("notify2_", str, sharedPreferences, 0);
                obj.f52088c = c10;
                if (c10 != 0) {
                    obj.f52086a = org.telegram.messenger.f3.c("notifyuntil_", str, sharedPreferences, 0);
                }
                hx0Var.f48653s.n(obj);
            }
        }
        hx0Var.finishFragment();
    }
}
