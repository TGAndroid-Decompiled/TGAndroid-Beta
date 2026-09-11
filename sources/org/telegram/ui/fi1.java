package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class fi1 implements View.OnClickListener {
    public final int f36416a;
    public final ui1 f36417b;

    public fi1(ui1 ui1Var, int i10) {
        this.f36416a = i10;
        this.f36417b = ui1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f36416a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ui1 ui1Var = this.f36417b;
                    AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
                    ui1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ui1 ui1Var2 = this.f36417b;
                if (ui1Var2.f41137n0 && ui1Var2.m0 && System.currentTimeMillis() - ui1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ui1Var2.S0);
                    ui1Var2.R0 = false;
                    ui1Var2.K0 = System.currentTimeMillis();
                    ui1Var2.Z.setRelativePosition(ui1Var2.Y);
                    ui1Var2.f41108a0 = true;
                    ui1Var2.H0 = true;
                    ui1Var2.f41140q0 = ui1Var2.f41139p0;
                    ui1Var2.H();
                    return;
                }
                return;
            case 2:
                ui1 ui1Var3 = this.f36417b;
                if (ui1Var3.H0 && System.currentTimeMillis() - ui1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ui1Var3.S0);
                    ui1Var3.R0 = false;
                    ui1Var3.K0 = System.currentTimeMillis();
                    ui1Var3.Y.setRelativePosition(ui1Var3.Z);
                    ui1Var3.f41108a0 = false;
                    ui1Var3.H0 = false;
                    ui1Var3.f41140q0 = ui1Var3.f41139p0;
                    ui1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ui1 ui1Var4 = this.f36417b;
                if (currentTimeMillis - ui1Var4.K0 >= 500) {
                    ui1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ui1Var4.C0;
                    if (!z10 && ui1Var4.B0) {
                        ui1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ui1 ui1Var5 = this.f36417b;
                if (currentTimeMillis2 - ui1Var5.K0 >= 500) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    if (ui1Var5.B0) {
                        ui1Var5.m(!ui1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ui1 ui1Var6 = this.f36417b;
                if (ui1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ui1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ui1Var6.f41110b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f36417b.p();
                return;
        }
    }
}
