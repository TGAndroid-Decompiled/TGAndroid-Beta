package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class mi1 implements View.OnClickListener {
    public final int f38274a;
    public final dj1 f38275b;
    public final VoIPService f38276c;

    public mi1(dj1 dj1Var, VoIPService voIPService, int i10) {
        this.f38274a = i10;
        this.f38275b = dj1Var;
        this.f38276c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38274a) {
            case 0:
                dj1 dj1Var = this.f38275b;
                AndroidUtilities.runOnUIThread(new ni1(dj1Var, 8));
                int i10 = dj1Var.L;
                if (i10 > 0) {
                    this.f38276c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                dj1 dj1Var2 = this.f38275b;
                AndroidUtilities.runOnUIThread(new ni1(dj1Var2, 10));
                int i11 = dj1Var2.L;
                if (i11 > 0) {
                    this.f38276c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
