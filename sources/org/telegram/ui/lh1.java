package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class lh1 implements View.OnClickListener {
    public final int f36091a;
    public final ai1 f36092b;

    public lh1(ai1 ai1Var, int i10) {
        this.f36091a = i10;
        this.f36092b = ai1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f36091a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ai1 ai1Var = this.f36092b;
                    AndroidUtilities.cancelRunOnUIThread(ai1Var.P0);
                    ai1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ai1 ai1Var2 = this.f36092b;
                if (ai1Var2.f32622k0 && ai1Var2.f32620j0 && System.currentTimeMillis() - ai1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ai1Var2.P0);
                    ai1Var2.O0 = false;
                    ai1Var2.H0 = System.currentTimeMillis();
                    ai1Var2.W.setRelativePosition(ai1Var2.V);
                    ai1Var2.X = true;
                    ai1Var2.E0 = true;
                    ai1Var2.f32625n0 = ai1Var2.m0;
                    ai1Var2.H();
                    return;
                }
                return;
            case 2:
                ai1 ai1Var3 = this.f36092b;
                if (ai1Var3.E0 && System.currentTimeMillis() - ai1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ai1Var3.P0);
                    ai1Var3.O0 = false;
                    ai1Var3.H0 = System.currentTimeMillis();
                    ai1Var3.V.setRelativePosition(ai1Var3.W);
                    ai1Var3.X = false;
                    ai1Var3.E0 = false;
                    ai1Var3.f32625n0 = ai1Var3.m0;
                    ai1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ai1 ai1Var4 = this.f36092b;
                if (currentTimeMillis - ai1Var4.H0 >= 500) {
                    ai1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ai1Var4.f32642z0;
                    if (!z4 && ai1Var4.f32641y0) {
                        ai1Var4.m(!z4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ai1 ai1Var5 = this.f36092b;
                if (currentTimeMillis2 - ai1Var5.H0 >= 500) {
                    ai1Var5.H0 = System.currentTimeMillis();
                    if (ai1Var5.f32641y0) {
                        ai1Var5.m(!ai1Var5.f32642z0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ai1 ai1Var6 = this.f36092b;
                if (ai1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ai1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ai1Var6.f32601b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f36092b.p();
                return;
        }
    }
}
