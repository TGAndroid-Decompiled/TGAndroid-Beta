package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ah1 implements View.OnClickListener {
    public final int f37804a;
    public final ph1 f37805b;

    public ah1(ph1 ph1Var, int i10) {
        this.f37804a = i10;
        this.f37805b = ph1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f37804a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ph1 ph1Var = this.f37805b;
                    AndroidUtilities.cancelRunOnUIThread(ph1Var.S0);
                    ph1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ph1 ph1Var2 = this.f37805b;
                if (ph1Var2.f42539n0 && ph1Var2.m0 && System.currentTimeMillis() - ph1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ph1Var2.S0);
                    ph1Var2.R0 = false;
                    ph1Var2.K0 = System.currentTimeMillis();
                    ph1Var2.Z.setRelativePosition(ph1Var2.Y);
                    ph1Var2.f42511a0 = true;
                    ph1Var2.H0 = true;
                    ph1Var2.f42542q0 = ph1Var2.f42541p0;
                    ph1Var2.G();
                    return;
                }
                return;
            case 2:
                ph1 ph1Var3 = this.f37805b;
                if (ph1Var3.H0 && System.currentTimeMillis() - ph1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ph1Var3.S0);
                    ph1Var3.R0 = false;
                    ph1Var3.K0 = System.currentTimeMillis();
                    ph1Var3.Y.setRelativePosition(ph1Var3.Z);
                    ph1Var3.f42511a0 = false;
                    ph1Var3.H0 = false;
                    ph1Var3.f42542q0 = ph1Var3.f42541p0;
                    ph1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ph1 ph1Var4 = this.f37805b;
                if (currentTimeMillis - ph1Var4.K0 >= 500) {
                    ph1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ph1Var4.C0;
                    if (!z10 && ph1Var4.B0) {
                        ph1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ph1 ph1Var5 = this.f37805b;
                if (currentTimeMillis2 - ph1Var5.K0 >= 500) {
                    ph1Var5.K0 = System.currentTimeMillis();
                    if (ph1Var5.B0) {
                        ph1Var5.l(!ph1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ph1 ph1Var6 = this.f37805b;
                if (ph1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ph1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ph1Var6.f42513b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f37805b.o();
                return;
        }
    }
}
