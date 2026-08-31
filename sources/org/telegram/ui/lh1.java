package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class lh1 implements View.OnClickListener {
    public final int f38749a;
    public final ci1 f38750b;
    public final VoIPService f38751c;

    public lh1(ci1 ci1Var, VoIPService voIPService, int i10) {
        this.f38749a = i10;
        this.f38750b = ci1Var;
        this.f38751c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38749a) {
            case 0:
                ci1 ci1Var = this.f38750b;
                AndroidUtilities.runOnUIThread(new mh1(ci1Var, 8));
                int i10 = ci1Var.I;
                if (i10 > 0) {
                    this.f38751c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ci1 ci1Var2 = this.f38750b;
                AndroidUtilities.runOnUIThread(new mh1(ci1Var2, 10));
                int i11 = ci1Var2.I;
                if (i11 > 0) {
                    this.f38751c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
