package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class us implements Runnable {
    public final int f38743a;

    public us(int i7) {
        this.f38743a = i7;
    }

    @Override
    public final void run() {
        gc a02;
        switch (this.f38743a) {
            case 0:
                int[] iArr = ys.X1;
                return;
            case 1:
                org.telegram.messenger.qs.e().k(175, new Object[0]);
                return;
            case 2:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.qs.e().k(98, 512);
                return;
            case 4:
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            case 5:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f27388a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 6:
                int i7 = ny0.f36421f;
                return;
            case 7:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                dz0.f33104f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 8:
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                dz0.f33104f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 9:
                int i10 = m11.f35793l0;
                return;
            case 10:
                org.telegram.messenger.vv.h();
                return;
            case 11:
                org.telegram.ui.Components.voip.e0.m();
                return;
            case 12:
                org.telegram.ui.Components.voip.g1.o();
                return;
            case 13:
                org.telegram.messenger.qs.e().k(175, new Object[0]);
                return;
            case 14:
                org.telegram.ui.Components.voip.e2.b();
                return;
            case 15:
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 16:
                di.x5.I0();
                return;
            case 17:
                org.telegram.ui.f40 f40Var = org.telegram.ui.f40.f45501x5;
                if (f40Var != null) {
                    f40Var.show();
                    return;
                }
                return;
            case 18:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 19:
                String str = LaunchActivity.B1;
                return;
            case 20:
                String str2 = LaunchActivity.B1;
                return;
            case 21:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.t0.E = false;
                org.telegram.messenger.t0.G = System.currentTimeMillis();
                return;
            case 22:
                return;
            case 23:
                CallReceiver.a();
                return;
            case 24:
                CallReceiver.a();
                return;
            case 25:
                gc.X().N(org.telegram.messenger.id.M0(2131745861, null), org.telegram.messenger.id.M0(2131751105, null)).j();
                return;
            case 26:
                gc.X().N(org.telegram.messenger.id.M0(2131745861, null), org.telegram.messenger.id.M0(2131751105, null)).j();
                return;
            case 27:
                Drawable[] drawableArr = PhotoViewer.Y8;
                return;
            case 28:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && (a02 = gc.a0(T)) != null) {
                    bc I = a02.I(2131624091, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                    I.f32203j = 5000;
                    I.j();
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.v31.Y1;
                return;
        }
    }

    public us(Object obj, int i7) {
        this.f38743a = i7;
    }

    private final void a() {
    }
}
