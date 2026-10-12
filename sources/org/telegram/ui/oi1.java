package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class oi1 implements View.OnClickListener {
    public final int f38983a;
    public final dj1 f38984b;

    public oi1(dj1 dj1Var, int i10) {
        this.f38983a = i10;
        this.f38984b = dj1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38983a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    dj1 dj1Var = this.f38984b;
                    AndroidUtilities.cancelRunOnUIThread(dj1Var.S0);
                    dj1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                dj1 dj1Var2 = this.f38984b;
                if (dj1Var2.f35303n0 && dj1Var2.m0 && System.currentTimeMillis() - dj1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(dj1Var2.S0);
                    dj1Var2.R0 = false;
                    dj1Var2.K0 = System.currentTimeMillis();
                    dj1Var2.Z.setRelativePosition(dj1Var2.Y);
                    dj1Var2.f35275a0 = true;
                    dj1Var2.H0 = true;
                    dj1Var2.f35306q0 = dj1Var2.f35305p0;
                    dj1Var2.G();
                    return;
                }
                return;
            case 2:
                dj1 dj1Var3 = this.f38984b;
                if (dj1Var3.H0 && System.currentTimeMillis() - dj1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(dj1Var3.S0);
                    dj1Var3.R0 = false;
                    dj1Var3.K0 = System.currentTimeMillis();
                    dj1Var3.Y.setRelativePosition(dj1Var3.Z);
                    dj1Var3.f35275a0 = false;
                    dj1Var3.H0 = false;
                    dj1Var3.f35306q0 = dj1Var3.f35305p0;
                    dj1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                dj1 dj1Var4 = this.f38984b;
                if (currentTimeMillis - dj1Var4.K0 >= 500) {
                    dj1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = dj1Var4.C0;
                    if (!z10 && dj1Var4.B0) {
                        dj1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                dj1 dj1Var5 = this.f38984b;
                if (currentTimeMillis2 - dj1Var5.K0 >= 500) {
                    dj1Var5.K0 = System.currentTimeMillis();
                    if (dj1Var5.B0) {
                        dj1Var5.l(!dj1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                dj1 dj1Var6 = this.f38984b;
                if (dj1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    dj1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(dj1Var6.f35277b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38984b.o();
                return;
        }
    }
}
