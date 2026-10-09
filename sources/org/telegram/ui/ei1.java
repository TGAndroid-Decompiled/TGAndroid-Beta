package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ei1 implements View.OnClickListener {
    public final int f37268a;
    public final wi1 f37269b;
    public final VoIPService f37270c;

    public ei1(wi1 wi1Var, VoIPService voIPService, int i10) {
        this.f37268a = i10;
        this.f37269b = wi1Var;
        this.f37270c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37268a) {
            case 0:
                wi1 wi1Var = this.f37269b;
                AndroidUtilities.runOnUIThread(new fi1(wi1Var, 8));
                int i10 = wi1Var.L;
                if (i10 > 0) {
                    this.f37270c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                wi1 wi1Var2 = this.f37269b;
                AndroidUtilities.runOnUIThread(new fi1(wi1Var2, 10));
                int i11 = wi1Var2.L;
                if (i11 > 0) {
                    this.f37270c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
