package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class ne implements Runnable {
    public final int f37767a;

    public ne(int i7) {
        this.f37767a = i7;
    }

    @Override
    public final void run() {
        switch (this.f37767a) {
            case 0:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 1:
                MediaController.B().B0(0, 0, false, false);
                return;
            case 2:
                return;
            case 3:
                int i7 = qn.f38908s1;
                return;
            case 4:
                PhotoViewer.p1().z0(false, false);
                return;
            case 5:
                PhotoViewer.p1().z0(false, false);
                return;
            case 6:
                int[] iArr = mt.d2;
                return;
            case 7:
                org.telegram.messenger.ks.e().k(175, new Object[0]);
                return;
            case 8:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.ks.e().k(98, 512);
                return;
            case 10:
                org.telegram.messenger.ks.e().k(99, 512);
                return;
            case 11:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f28948a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 12:
                int i10 = xy0.f42245f;
                return;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                nz0.f37960f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 14:
                SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                nz0.f37960f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 15:
                int i11 = z11.m0;
                return;
            case 16:
                org.telegram.messenger.pv.h();
                return;
            case 17:
                org.telegram.ui.Components.voip.f0.h();
                return;
            case 18:
                org.telegram.ui.Components.voip.k1.k();
                return;
            case 19:
                org.telegram.messenger.ks.e().k(175, new Object[0]);
                return;
            case 20:
                org.telegram.ui.Components.voip.i2.b();
                return;
            case 21:
                org.telegram.ui.Components.voip.j2.d();
                return;
            case 22:
                fi.n5.J0();
                return;
            case 23:
                org.telegram.ui.e40 e40Var = org.telegram.ui.e40.C5;
                if (e40Var != null) {
                    e40Var.show();
                    return;
                }
                return;
            case 24:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 25:
                String str = LaunchActivity.C1;
                return;
            case 26:
                String str2 = LaunchActivity.C1;
                return;
            case 27:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                return;
            case 28:
                return;
            default:
                CallReceiver.a();
                return;
        }
    }

    public ne(Object obj, int i7) {
        this.f37767a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }
}
