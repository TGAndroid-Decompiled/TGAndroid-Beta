package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class qg1 implements View.OnClickListener {
    public final int f40575a;
    public final hh1 f40576b;
    public final VoIPService f40577c;

    public qg1(hh1 hh1Var, VoIPService voIPService, int i10) {
        this.f40575a = i10;
        this.f40576b = hh1Var;
        this.f40577c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40575a) {
            case 0:
                hh1 hh1Var = this.f40576b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var, 8));
                int i10 = hh1Var.L;
                if (i10 > 0) {
                    this.f40577c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                hh1 hh1Var2 = this.f40576b;
                AndroidUtilities.runOnUIThread(new rg1(hh1Var2, 10));
                int i11 = hh1Var2.L;
                if (i11 > 0) {
                    this.f40577c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
