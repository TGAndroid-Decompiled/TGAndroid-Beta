package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class gi1 implements View.OnClickListener {
    public final int f38073a;
    public final wi1 f38074b;

    public gi1(wi1 wi1Var, int i10) {
        this.f38073a = i10;
        this.f38074b = wi1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38073a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    wi1 wi1Var = this.f38074b;
                    AndroidUtilities.cancelRunOnUIThread(wi1Var.S0);
                    wi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                wi1 wi1Var2 = this.f38074b;
                if (wi1Var2.f43700n0 && wi1Var2.m0 && System.currentTimeMillis() - wi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(wi1Var2.S0);
                    wi1Var2.R0 = false;
                    wi1Var2.K0 = System.currentTimeMillis();
                    wi1Var2.Z.setRelativePosition(wi1Var2.Y);
                    wi1Var2.f43671a0 = true;
                    wi1Var2.H0 = true;
                    wi1Var2.f43703q0 = wi1Var2.f43702p0;
                    wi1Var2.G();
                    return;
                }
                return;
            case 2:
                wi1 wi1Var3 = this.f38074b;
                if (wi1Var3.H0 && System.currentTimeMillis() - wi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(wi1Var3.S0);
                    wi1Var3.R0 = false;
                    wi1Var3.K0 = System.currentTimeMillis();
                    wi1Var3.Y.setRelativePosition(wi1Var3.Z);
                    wi1Var3.f43671a0 = false;
                    wi1Var3.H0 = false;
                    wi1Var3.f43703q0 = wi1Var3.f43702p0;
                    wi1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                wi1 wi1Var4 = this.f38074b;
                if (currentTimeMillis - wi1Var4.K0 >= 500) {
                    wi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = wi1Var4.C0;
                    if (!z10 && wi1Var4.B0) {
                        wi1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                wi1 wi1Var5 = this.f38074b;
                if (currentTimeMillis2 - wi1Var5.K0 >= 500) {
                    wi1Var5.K0 = System.currentTimeMillis();
                    if (wi1Var5.B0) {
                        wi1Var5.l(!wi1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                wi1 wi1Var6 = this.f38074b;
                if (wi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    wi1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(wi1Var6.f43673b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38074b.o();
                return;
        }
    }
}
