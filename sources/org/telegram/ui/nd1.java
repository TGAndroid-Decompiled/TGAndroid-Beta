package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class nd1 implements View.OnClickListener {
    public final int f39915a;
    public final be1 f39916b;

    public nd1(be1 be1Var, int i10) {
        this.f39915a = i10;
        this.f39916b = be1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f39915a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    be1 be1Var = this.f39916b;
                    org.telegram.messenger.i0.r(be1Var.S0);
                    be1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                be1 be1Var2 = this.f39916b;
                if (be1Var2.f36225n0 && be1Var2.m0 && System.currentTimeMillis() - be1Var2.K0 > 500) {
                    org.telegram.messenger.i0.r(be1Var2.S0);
                    be1Var2.R0 = false;
                    be1Var2.K0 = System.currentTimeMillis();
                    be1Var2.Z.setRelativePosition(be1Var2.Y);
                    be1Var2.f36197a0 = true;
                    be1Var2.H0 = true;
                    be1Var2.f36228q0 = be1Var2.f36227p0;
                    be1Var2.G();
                    return;
                }
                return;
            case 2:
                be1 be1Var3 = this.f39916b;
                if (be1Var3.H0 && System.currentTimeMillis() - be1Var3.K0 > 500) {
                    org.telegram.messenger.i0.r(be1Var3.S0);
                    be1Var3.R0 = false;
                    be1Var3.K0 = System.currentTimeMillis();
                    be1Var3.Y.setRelativePosition(be1Var3.Z);
                    be1Var3.f36197a0 = false;
                    be1Var3.H0 = false;
                    be1Var3.f36228q0 = be1Var3.f36227p0;
                    be1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                be1 be1Var4 = this.f39916b;
                if (currentTimeMillis - be1Var4.K0 >= 500) {
                    be1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = be1Var4.C0;
                    if (!z10 && be1Var4.B0) {
                        be1Var4.e(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                be1 be1Var5 = this.f39916b;
                if (currentTimeMillis2 - be1Var5.K0 >= 500) {
                    be1Var5.K0 = System.currentTimeMillis();
                    if (be1Var5.B0) {
                        be1Var5.e(!be1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                be1 be1Var6 = this.f39916b;
                if (be1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    be1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(be1Var6.f36199b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f39916b.j();
                return;
        }
    }
}
