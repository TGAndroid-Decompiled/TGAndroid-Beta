package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class ih implements Runnable {
    public final int f35617a;

    public ih(int i7) {
        this.f35617a = i7;
    }

    @Override
    public final void run() {
        switch (this.f35617a) {
            case 0:
                return;
            case 1:
                int i7 = jn.f36061s1;
                return;
            case 2:
                PhotoViewer.p1().z0(false, false);
                return;
            case 3:
                PhotoViewer.p1().z0(false, false);
                return;
            case 4:
                int[] iArr = ft.d2;
                return;
            case 5:
                org.telegram.messenger.ns.e().k(175, new Object[0]);
                return;
            case 6:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 7:
                org.telegram.messenger.ns.e().k(98, 512);
                return;
            case 8:
                org.telegram.messenger.ns.e().k(99, 512);
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 10:
                int i10 = py0.f38434f;
                return;
            case 11:
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                fz0.f34758f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 12:
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                fz0.f34758f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 13:
                int i11 = p11.m0;
                return;
            case 14:
                org.telegram.messenger.tv.h();
                return;
            case 15:
                org.telegram.ui.Components.voip.f0.m();
                return;
            case 16:
                org.telegram.ui.Components.voip.k1.o();
                return;
            case 17:
                org.telegram.messenger.ns.e().k(175, new Object[0]);
                return;
            case 18:
                org.telegram.ui.Components.voip.i2.b();
                return;
            case 19:
                org.telegram.ui.Components.voip.j2.g();
                return;
            case 20:
                fi.o5.I0();
                return;
            case 21:
                org.telegram.ui.c40 c40Var = org.telegram.ui.c40.C5;
                if (c40Var != null) {
                    c40Var.show();
                    return;
                }
                return;
            case 22:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 23:
                String str = LaunchActivity.C1;
                return;
            case 24:
                String str2 = LaunchActivity.C1;
                return;
            case 25:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                return;
            case 26:
                return;
            case 27:
                CallReceiver.a();
                return;
            case 28:
                CallReceiver.a();
                return;
            default:
                cc.X().N(org.telegram.messenger.hd.M0(2131745861, null), org.telegram.messenger.hd.M0(2131751105, null)).j();
                return;
        }
    }

    public ih(Object obj, int i7) {
        this.f35617a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }
}
