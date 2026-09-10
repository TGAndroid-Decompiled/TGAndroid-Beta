package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements View.OnClickListener {
    public final int f34382a;
    public final zi1 f34383b;

    public ki1(zi1 zi1Var, int i10) {
        this.f34382a = i10;
        this.f34383b = zi1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f34382a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zi1 zi1Var = this.f34383b;
                    AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
                    zi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                zi1 zi1Var2 = this.f34383b;
                if (zi1Var2.f39385n0 && zi1Var2.m0 && System.currentTimeMillis() - zi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(zi1Var2.S0);
                    zi1Var2.R0 = false;
                    zi1Var2.K0 = System.currentTimeMillis();
                    zi1Var2.Z.setRelativePosition(zi1Var2.Y);
                    zi1Var2.f39357a0 = true;
                    zi1Var2.H0 = true;
                    zi1Var2.f39388q0 = zi1Var2.f39387p0;
                    zi1Var2.H();
                    return;
                }
                return;
            case 2:
                zi1 zi1Var3 = this.f34383b;
                if (zi1Var3.H0 && System.currentTimeMillis() - zi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(zi1Var3.S0);
                    zi1Var3.R0 = false;
                    zi1Var3.K0 = System.currentTimeMillis();
                    zi1Var3.Y.setRelativePosition(zi1Var3.Z);
                    zi1Var3.f39357a0 = false;
                    zi1Var3.H0 = false;
                    zi1Var3.f39388q0 = zi1Var3.f39387p0;
                    zi1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zi1 zi1Var4 = this.f34383b;
                if (currentTimeMillis - zi1Var4.K0 >= 500) {
                    zi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = zi1Var4.C0;
                    if (!z10 && zi1Var4.B0) {
                        zi1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zi1 zi1Var5 = this.f34383b;
                if (currentTimeMillis2 - zi1Var5.K0 >= 500) {
                    zi1Var5.K0 = System.currentTimeMillis();
                    if (zi1Var5.B0) {
                        zi1Var5.m(!zi1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zi1 zi1Var6 = this.f34383b;
                if (zi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zi1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zi1Var6.f39359b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f34383b.p();
                return;
        }
    }
}
