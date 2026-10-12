package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class gi1 implements View.OnClickListener {
    public final int f38072a;
    public final xi1 f38073b;
    public final VoIPService f38074c;

    public gi1(xi1 xi1Var, VoIPService voIPService, int i10) {
        this.f38072a = i10;
        this.f38073b = xi1Var;
        this.f38074c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38072a) {
            case 0:
                xi1 xi1Var = this.f38073b;
                AndroidUtilities.runOnUIThread(new hi1(xi1Var, 8));
                int i10 = xi1Var.L;
                if (i10 > 0) {
                    this.f38074c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                xi1 xi1Var2 = this.f38073b;
                AndroidUtilities.runOnUIThread(new hi1(xi1Var2, 10));
                int i11 = xi1Var2.L;
                if (i11 > 0) {
                    this.f38074c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
