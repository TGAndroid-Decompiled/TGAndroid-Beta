package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class nh1 implements View.OnClickListener {
    public final int f39459a;
    public final ci1 f39460b;

    public nh1(ci1 ci1Var, int i10) {
        this.f39459a = i10;
        this.f39460b = ci1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f39459a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ci1 ci1Var = this.f39460b;
                    AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
                    ci1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ci1 ci1Var2 = this.f39460b;
                if (ci1Var2.f35843k0 && ci1Var2.f35841j0 && System.currentTimeMillis() - ci1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ci1Var2.P0);
                    ci1Var2.O0 = false;
                    ci1Var2.H0 = System.currentTimeMillis();
                    ci1Var2.W.setRelativePosition(ci1Var2.V);
                    ci1Var2.X = true;
                    ci1Var2.E0 = true;
                    ci1Var2.f35846n0 = ci1Var2.m0;
                    ci1Var2.H();
                    return;
                }
                return;
            case 2:
                ci1 ci1Var3 = this.f39460b;
                if (ci1Var3.E0 && System.currentTimeMillis() - ci1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ci1Var3.P0);
                    ci1Var3.O0 = false;
                    ci1Var3.H0 = System.currentTimeMillis();
                    ci1Var3.V.setRelativePosition(ci1Var3.W);
                    ci1Var3.X = false;
                    ci1Var3.E0 = false;
                    ci1Var3.f35846n0 = ci1Var3.m0;
                    ci1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ci1 ci1Var4 = this.f39460b;
                if (currentTimeMillis - ci1Var4.H0 >= 500) {
                    ci1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ci1Var4.f35863z0;
                    if (!z4 && ci1Var4.f35862y0) {
                        ci1Var4.m(!z4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ci1 ci1Var5 = this.f39460b;
                if (currentTimeMillis2 - ci1Var5.H0 >= 500) {
                    ci1Var5.H0 = System.currentTimeMillis();
                    if (ci1Var5.f35862y0) {
                        ci1Var5.m(!ci1Var5.f35863z0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci1 ci1Var6 = this.f39460b;
                if (ci1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ci1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ci1Var6.f35821b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f39460b.p();
                return;
        }
    }
}
