package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ld1 implements View.OnClickListener {
    public final int f39197a;
    public final zd1 f39198b;

    public ld1(zd1 zd1Var, int i10) {
        this.f39197a = i10;
        this.f39198b = zd1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f39197a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zd1 zd1Var = this.f39198b;
                    org.telegram.messenger.i0.r(zd1Var.S0);
                    zd1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                zd1 zd1Var2 = this.f39198b;
                if (zd1Var2.f43964n0 && zd1Var2.m0 && System.currentTimeMillis() - zd1Var2.K0 > 500) {
                    org.telegram.messenger.i0.r(zd1Var2.S0);
                    zd1Var2.R0 = false;
                    zd1Var2.K0 = System.currentTimeMillis();
                    zd1Var2.Z.setRelativePosition(zd1Var2.Y);
                    zd1Var2.f43936a0 = true;
                    zd1Var2.H0 = true;
                    zd1Var2.f43967q0 = zd1Var2.f43966p0;
                    zd1Var2.G();
                    return;
                }
                return;
            case 2:
                zd1 zd1Var3 = this.f39198b;
                if (zd1Var3.H0 && System.currentTimeMillis() - zd1Var3.K0 > 500) {
                    org.telegram.messenger.i0.r(zd1Var3.S0);
                    zd1Var3.R0 = false;
                    zd1Var3.K0 = System.currentTimeMillis();
                    zd1Var3.Y.setRelativePosition(zd1Var3.Z);
                    zd1Var3.f43936a0 = false;
                    zd1Var3.H0 = false;
                    zd1Var3.f43967q0 = zd1Var3.f43966p0;
                    zd1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zd1 zd1Var4 = this.f39198b;
                if (currentTimeMillis - zd1Var4.K0 >= 500) {
                    zd1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = zd1Var4.C0;
                    if (!z10 && zd1Var4.B0) {
                        zd1Var4.e(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zd1 zd1Var5 = this.f39198b;
                if (currentTimeMillis2 - zd1Var5.K0 >= 500) {
                    zd1Var5.K0 = System.currentTimeMillis();
                    if (zd1Var5.B0) {
                        zd1Var5.e(!zd1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zd1 zd1Var6 = this.f39198b;
                if (zd1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zd1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zd1Var6.f43938b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f39198b.j();
                return;
        }
    }
}
