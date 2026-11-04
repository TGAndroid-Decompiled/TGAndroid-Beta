package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class lb1 implements View.OnClickListener {
    public final int f47295a;
    public final zb1 f47296b;

    public lb1(zb1 zb1Var, int i3) {
        this.f47295a = i3;
        this.f47296b = zb1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i3;
        switch (this.f47295a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    zb1 zb1Var = this.f47296b;
                    org.telegram.messenger.g0.r(zb1Var.T0);
                    zb1Var.S0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                zb1 zb1Var2 = this.f47296b;
                if (zb1Var2.f52635o0 && zb1Var2.f52633n0 && System.currentTimeMillis() - zb1Var2.L0 > 500) {
                    org.telegram.messenger.g0.r(zb1Var2.T0);
                    zb1Var2.S0 = false;
                    zb1Var2.L0 = System.currentTimeMillis();
                    zb1Var2.f52605a0.setRelativePosition(zb1Var2.Z);
                    zb1Var2.f52608b0 = true;
                    zb1Var2.I0 = true;
                    zb1Var2.f52639r0 = zb1Var2.f52637q0;
                    zb1Var2.G();
                    return;
                }
                return;
            case 2:
                zb1 zb1Var3 = this.f47296b;
                if (zb1Var3.I0 && System.currentTimeMillis() - zb1Var3.L0 > 500) {
                    org.telegram.messenger.g0.r(zb1Var3.T0);
                    zb1Var3.S0 = false;
                    zb1Var3.L0 = System.currentTimeMillis();
                    zb1Var3.Z.setRelativePosition(zb1Var3.f52605a0);
                    zb1Var3.f52608b0 = false;
                    zb1Var3.I0 = false;
                    zb1Var3.f52639r0 = zb1Var3.f52637q0;
                    zb1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                zb1 zb1Var4 = this.f47296b;
                if (currentTimeMillis - zb1Var4.L0 >= 500) {
                    zb1Var4.L0 = System.currentTimeMillis();
                    boolean z10 = zb1Var4.D0;
                    if (!z10 && zb1Var4.C0) {
                        zb1Var4.e(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                zb1 zb1Var5 = this.f47296b;
                if (currentTimeMillis2 - zb1Var5.L0 >= 500) {
                    zb1Var5.L0 = System.currentTimeMillis();
                    if (zb1Var5.C0) {
                        zb1Var5.e(!zb1Var5.D0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zb1 zb1Var6 = this.f47296b;
                if (zb1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    zb1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i3 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(zb1Var6.f52607b, false, Integer.valueOf(i3));
                    return;
                }
                return;
            default:
                this.f47296b.j();
                return;
        }
    }
}
