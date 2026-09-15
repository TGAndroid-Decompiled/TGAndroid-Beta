package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ei1 implements View.OnClickListener {
    public final int f33352a;
    public final ti1 f33353b;

    public ei1(ti1 ti1Var, int i10) {
        this.f33352a = i10;
        this.f33353b = ti1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f33352a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ti1 ti1Var = this.f33353b;
                    AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
                    ti1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ti1 ti1Var2 = this.f33353b;
                if (ti1Var2.f37722n0 && ti1Var2.m0 && System.currentTimeMillis() - ti1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ti1Var2.S0);
                    ti1Var2.R0 = false;
                    ti1Var2.K0 = System.currentTimeMillis();
                    ti1Var2.Z.setRelativePosition(ti1Var2.Y);
                    ti1Var2.f37694a0 = true;
                    ti1Var2.H0 = true;
                    ti1Var2.f37725q0 = ti1Var2.f37724p0;
                    ti1Var2.H();
                    return;
                }
                return;
            case 2:
                ti1 ti1Var3 = this.f33353b;
                if (ti1Var3.H0 && System.currentTimeMillis() - ti1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ti1Var3.S0);
                    ti1Var3.R0 = false;
                    ti1Var3.K0 = System.currentTimeMillis();
                    ti1Var3.Y.setRelativePosition(ti1Var3.Z);
                    ti1Var3.f37694a0 = false;
                    ti1Var3.H0 = false;
                    ti1Var3.f37725q0 = ti1Var3.f37724p0;
                    ti1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ti1 ti1Var4 = this.f33353b;
                if (currentTimeMillis - ti1Var4.K0 >= 500) {
                    ti1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ti1Var4.C0;
                    if (!z10 && ti1Var4.B0) {
                        ti1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ti1 ti1Var5 = this.f33353b;
                if (currentTimeMillis2 - ti1Var5.K0 >= 500) {
                    ti1Var5.K0 = System.currentTimeMillis();
                    if (ti1Var5.B0) {
                        ti1Var5.m(!ti1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ti1 ti1Var6 = this.f33353b;
                if (ti1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ti1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ti1Var6.f37696b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f33353b.p();
                return;
        }
    }
}
