package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class qg1 implements View.OnClickListener {
    public final int f40574a;
    public final hh1 f40575b;
    public final VoIPService f40576c;

    public qg1(hh1 hh1Var, VoIPService voIPService, int i10) {
        this.f40574a = i10;
        this.f40575b = hh1Var;
        this.f40576c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40574a) {
            case 0:
                hh1 hh1Var = this.f40575b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var, 8));
                int i10 = hh1Var.L;
                if (i10 > 0) {
                    this.f40576c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                hh1 hh1Var2 = this.f40575b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var2, 10));
                int i11 = hh1Var2.L;
                if (i11 > 0) {
                    this.f40576c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
