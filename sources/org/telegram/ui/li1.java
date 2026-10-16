package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class li1 implements View.OnClickListener {
    public final int f37768a;
    public final cj1 f37769b;
    public final VoIPService f37770c;

    public li1(cj1 cj1Var, VoIPService voIPService, int i10) {
        this.f37768a = i10;
        this.f37769b = cj1Var;
        this.f37770c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37768a) {
            case 0:
                cj1 cj1Var = this.f37769b;
                AndroidUtilities.runOnUIThread(new mi1(cj1Var, 8));
                int i10 = cj1Var.L;
                if (i10 > 0) {
                    this.f37770c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                cj1 cj1Var2 = this.f37769b;
                AndroidUtilities.runOnUIThread(new mi1(cj1Var2, 10));
                int i11 = cj1Var2.L;
                if (i11 > 0) {
                    this.f37770c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
