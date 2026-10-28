package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ch1 implements View.OnClickListener {
    public final int f38355a;
    public final rh1 f38356b;

    public ch1(rh1 rh1Var, int i10) {
        this.f38355a = i10;
        this.f38356b = rh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38355a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    rh1 rh1Var = this.f38356b;
                    AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
                    rh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                rh1 rh1Var2 = this.f38356b;
                if (rh1Var2.f43029n0 && rh1Var2.m0 && System.currentTimeMillis() - rh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(rh1Var2.S0);
                    rh1Var2.R0 = false;
                    rh1Var2.K0 = System.currentTimeMillis();
                    rh1Var2.Z.setRelativePosition(rh1Var2.Y);
                    rh1Var2.f43001a0 = true;
                    rh1Var2.H0 = true;
                    rh1Var2.f43032q0 = rh1Var2.f43031p0;
                    rh1Var2.G();
                    return;
                }
                return;
            case 2:
                rh1 rh1Var3 = this.f38356b;
                if (rh1Var3.H0 && System.currentTimeMillis() - rh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(rh1Var3.S0);
                    rh1Var3.R0 = false;
                    rh1Var3.K0 = System.currentTimeMillis();
                    rh1Var3.Y.setRelativePosition(rh1Var3.Z);
                    rh1Var3.f43001a0 = false;
                    rh1Var3.H0 = false;
                    rh1Var3.f43032q0 = rh1Var3.f43031p0;
                    rh1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                rh1 rh1Var4 = this.f38356b;
                if (currentTimeMillis - rh1Var4.K0 >= 500) {
                    rh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = rh1Var4.C0;
                    if (!z10 && rh1Var4.B0) {
                        rh1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                rh1 rh1Var5 = this.f38356b;
                if (currentTimeMillis2 - rh1Var5.K0 >= 500) {
                    rh1Var5.K0 = System.currentTimeMillis();
                    if (rh1Var5.B0) {
                        rh1Var5.l(!rh1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rh1 rh1Var6 = this.f38356b;
                if (rh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    rh1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(rh1Var6.f43003b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38356b.o();
                return;
        }
    }
}
