package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ii1 implements View.OnClickListener {
    public final int f38923a;
    public final xi1 f38924b;

    public ii1(xi1 xi1Var, int i10) {
        this.f38923a = i10;
        this.f38924b = xi1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38923a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    xi1 xi1Var = this.f38924b;
                    AndroidUtilities.cancelRunOnUIThread(xi1Var.S0);
                    xi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                xi1 xi1Var2 = this.f38924b;
                if (xi1Var2.f44013n0 && xi1Var2.m0 && System.currentTimeMillis() - xi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(xi1Var2.S0);
                    xi1Var2.R0 = false;
                    xi1Var2.K0 = System.currentTimeMillis();
                    xi1Var2.Z.setRelativePosition(xi1Var2.Y);
                    xi1Var2.f43984a0 = true;
                    xi1Var2.H0 = true;
                    xi1Var2.f44016q0 = xi1Var2.f44015p0;
                    xi1Var2.G();
                    return;
                }
                return;
            case 2:
                xi1 xi1Var3 = this.f38924b;
                if (xi1Var3.H0 && System.currentTimeMillis() - xi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(xi1Var3.S0);
                    xi1Var3.R0 = false;
                    xi1Var3.K0 = System.currentTimeMillis();
                    xi1Var3.Y.setRelativePosition(xi1Var3.Z);
                    xi1Var3.f43984a0 = false;
                    xi1Var3.H0 = false;
                    xi1Var3.f44016q0 = xi1Var3.f44015p0;
                    xi1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                xi1 xi1Var4 = this.f38924b;
                if (currentTimeMillis - xi1Var4.K0 >= 500) {
                    xi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = xi1Var4.C0;
                    if (!z10 && xi1Var4.B0) {
                        xi1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                xi1 xi1Var5 = this.f38924b;
                if (currentTimeMillis2 - xi1Var5.K0 >= 500) {
                    xi1Var5.K0 = System.currentTimeMillis();
                    if (xi1Var5.B0) {
                        xi1Var5.l(!xi1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                xi1 xi1Var6 = this.f38924b;
                if (xi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    xi1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(xi1Var6.f43986b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38924b.o();
                return;
        }
    }
}
