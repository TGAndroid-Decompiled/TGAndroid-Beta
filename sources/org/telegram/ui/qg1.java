package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class qg1 implements View.OnClickListener {
    public final int f40571a;
    public final hh1 f40572b;
    public final VoIPService f40573c;

    public qg1(hh1 hh1Var, VoIPService voIPService, int i10) {
        this.f40571a = i10;
        this.f40572b = hh1Var;
        this.f40573c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40571a) {
            case 0:
                hh1 hh1Var = this.f40572b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var, 8));
                int i10 = hh1Var.L;
                if (i10 > 0) {
                    this.f40573c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                hh1 hh1Var2 = this.f40572b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var2, 10));
                int i11 = hh1Var2.L;
                if (i11 > 0) {
                    this.f40573c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
