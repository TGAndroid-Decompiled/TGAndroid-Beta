package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
public final class go implements Runnable {
    public final int f34160a;

    public go(int i3) {
        this.f34160a = i3;
    }

    @Override
    public final void run() {
        fc a02;
        switch (this.f34160a) {
            case 0:
                PhotoViewer.v1().H0(false, false);
                return;
            case 1:
                PhotoViewer.v1().H0(false, false);
                return;
            case 2:
                int[] iArr = xs.Y1;
                return;
            case 3:
                org.telegram.messenger.hs.e().k(175, new Object[0]);
                return;
            case 4:
                if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.hs.e().k(98, 512);
                return;
            case 6:
                org.telegram.messenger.hs.e().k(99, 512);
                return;
            case 7:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), obj);
                    return;
                }
                return;
            case 8:
                int i3 = my0.f36270f;
                return;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                cz0.f32867f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 10:
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                cz0.f32867f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 11:
                int i10 = g11.m0;
                return;
            case 12:
                org.telegram.messenger.nv.h();
                return;
            case 13:
                org.telegram.messenger.hs.e().k(175, new Object[0]);
                return;
            case 14:
                org.telegram.ui.Components.voip.u1.a();
                return;
            case 15:
                ei.w5.I0();
                return;
            case 16:
                org.telegram.ui.x30 x30Var = org.telegram.ui.x30.f51711v5;
                if (x30Var != null) {
                    x30Var.show();
                    return;
                }
                return;
            case 17:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 18:
                String str = LaunchActivity.E1;
                return;
            case 19:
                String str2 = LaunchActivity.E1;
                return;
            case 20:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.t0.F = false;
                org.telegram.messenger.t0.H = System.currentTimeMillis();
                return;
            case 21:
                return;
            case 22:
                CallReceiver.a();
                return;
            case 23:
                CallReceiver.a();
                return;
            case 24:
                fc.X().N(org.telegram.messenger.bd.M0(2131745871, null), org.telegram.messenger.bd.M0(2131751106, null)).j();
                return;
            case 25:
                fc.X().N(org.telegram.messenger.bd.M0(2131745871, null), org.telegram.messenger.bd.M0(2131751106, null)).j();
                return;
            case 26:
                Drawable[] drawableArr = PhotoViewer.V8;
                return;
            case 27:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null && (a02 = fc.a0(T)) != null) {
                    ac I = a02.I(2131624091, org.telegram.messenger.bd.M0(2131746232, null), org.telegram.messenger.bd.M0(2131746195, null));
                    I.f31792j = 5000;
                    I.j();
                    return;
                }
                return;
            case 28:
                int i11 = org.telegram.ui.j31.W1;
                return;
            default:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.F(false);
                return;
        }
    }

    public go(Object obj, int i3) {
        this.f34160a = i3;
    }

    private final void a() {
    }
}
