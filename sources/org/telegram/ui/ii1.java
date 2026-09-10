package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ii1 implements View.OnClickListener {
    public final int f33742a;
    public final zi1 f33743b;
    public final VoIPService f33744c;

    public ii1(zi1 zi1Var, VoIPService voIPService, int i10) {
        this.f33742a = i10;
        this.f33743b = zi1Var;
        this.f33744c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33742a) {
            case 0:
                zi1 zi1Var = this.f33743b;
                AndroidUtilities.runOnUIThread(new ji1(zi1Var, 8));
                int i10 = zi1Var.L;
                if (i10 > 0) {
                    this.f33744c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                zi1 zi1Var2 = this.f33743b;
                AndroidUtilities.runOnUIThread(new ji1(zi1Var2, 10));
                int i11 = zi1Var2.L;
                if (i11 > 0) {
                    this.f33744c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
