package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class di1 implements View.OnClickListener {
    public final int f33032a;
    public final si1 f33033b;

    public di1(si1 si1Var, int i10) {
        this.f33032a = i10;
        this.f33033b = si1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f33032a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    si1 si1Var = this.f33033b;
                    AndroidUtilities.cancelRunOnUIThread(si1Var.S0);
                    si1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                si1 si1Var2 = this.f33033b;
                if (si1Var2.f37324n0 && si1Var2.m0 && System.currentTimeMillis() - si1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(si1Var2.S0);
                    si1Var2.R0 = false;
                    si1Var2.K0 = System.currentTimeMillis();
                    si1Var2.Z.setRelativePosition(si1Var2.Y);
                    si1Var2.f37296a0 = true;
                    si1Var2.H0 = true;
                    si1Var2.f37327q0 = si1Var2.f37326p0;
                    si1Var2.H();
                    return;
                }
                return;
            case 2:
                si1 si1Var3 = this.f33033b;
                if (si1Var3.H0 && System.currentTimeMillis() - si1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(si1Var3.S0);
                    si1Var3.R0 = false;
                    si1Var3.K0 = System.currentTimeMillis();
                    si1Var3.Y.setRelativePosition(si1Var3.Z);
                    si1Var3.f37296a0 = false;
                    si1Var3.H0 = false;
                    si1Var3.f37327q0 = si1Var3.f37326p0;
                    si1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                si1 si1Var4 = this.f33033b;
                if (currentTimeMillis - si1Var4.K0 >= 500) {
                    si1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = si1Var4.C0;
                    if (!z10 && si1Var4.B0) {
                        si1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                si1 si1Var5 = this.f33033b;
                if (currentTimeMillis2 - si1Var5.K0 >= 500) {
                    si1Var5.K0 = System.currentTimeMillis();
                    if (si1Var5.B0) {
                        si1Var5.m(!si1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                si1 si1Var6 = this.f33033b;
                if (si1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    si1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(si1Var6.f37298b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f33033b.p();
                return;
        }
    }
}
