package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class di1 implements View.OnClickListener {
    public final int f35829a;
    public final ui1 f35830b;
    public final VoIPService f35831c;

    public di1(ui1 ui1Var, VoIPService voIPService, int i10) {
        this.f35829a = i10;
        this.f35830b = ui1Var;
        this.f35831c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35829a) {
            case 0:
                ui1 ui1Var = this.f35830b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var, 8));
                int i10 = ui1Var.L;
                if (i10 > 0) {
                    this.f35831c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ui1 ui1Var2 = this.f35830b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var2, 10));
                int i11 = ui1Var2.L;
                if (i11 > 0) {
                    this.f35831c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
