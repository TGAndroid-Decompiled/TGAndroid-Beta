package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class l10 implements Runnable {
    public final int f35476a;

    public l10(int i7) {
        this.f35476a = i7;
    }

    @Override
    public final void run() {
        hc a02;
        switch (this.f35476a) {
            case 0:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.qs.e().k(98, 512);
                return;
            case 2:
                org.telegram.messenger.qs.e().k(99, 512);
                return;
            case 3:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f27420a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 4:
                int i7 = my0.f36098f;
                return;
            case 5:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                cz0.f32725f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 6:
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                cz0.f32725f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 7:
                int i10 = l11.f35477l0;
                return;
            case 8:
                org.telegram.messenger.vv.h();
                return;
            case 9:
                org.telegram.ui.Components.voip.e0.m();
                return;
            case 10:
                org.telegram.ui.Components.voip.g1.o();
                return;
            case 11:
                org.telegram.messenger.qs.e().k(175, new Object[0]);
                return;
            case 12:
                org.telegram.ui.Components.voip.e2.b();
                return;
            case 13:
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 14:
                di.w5.I0();
                return;
            case 15:
                org.telegram.ui.c40 c40Var = org.telegram.ui.c40.f44540u5;
                if (c40Var != null) {
                    c40Var.show();
                    return;
                }
                return;
            case 16:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 17:
                String str = LaunchActivity.B1;
                return;
            case 18:
                String str2 = LaunchActivity.B1;
                return;
            case 19:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.t0.E = false;
                org.telegram.messenger.t0.G = System.currentTimeMillis();
                return;
            case 20:
                return;
            case 21:
                CallReceiver.a();
                return;
            case 22:
                CallReceiver.a();
                return;
            case 23:
                hc.X().N(org.telegram.messenger.hd.M0(2131745862, null), org.telegram.messenger.hd.M0(2131751106, null)).j();
                return;
            case 24:
                hc.X().N(org.telegram.messenger.hd.M0(2131745862, null), org.telegram.messenger.hd.M0(2131751106, null)).j();
                return;
            case 25:
                Drawable[] drawableArr = PhotoViewer.Y8;
                return;
            case 26:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null && (a02 = hc.a0(T)) != null) {
                    cc I = a02.I(2131624091, org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746186, null));
                    I.f32527j = 5000;
                    I.j();
                    return;
                }
                return;
            case 27:
                int i11 = org.telegram.ui.t31.V1;
                return;
            case 28:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.F(false);
                return;
            default:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
        }
    }

    public l10(Object obj, int i7) {
        this.f35476a = i7;
    }

    private final void a() {
    }
}
