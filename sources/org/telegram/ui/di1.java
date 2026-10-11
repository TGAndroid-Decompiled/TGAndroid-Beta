package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class di1 implements View.OnClickListener {
    public final int f37063a;
    public final ui1 f37064b;
    public final VoIPService f37065c;

    public di1(ui1 ui1Var, VoIPService voIPService, int i10) {
        this.f37063a = i10;
        this.f37064b = ui1Var;
        this.f37065c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37063a) {
            case 0:
                ui1 ui1Var = this.f37064b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var, 8));
                int i10 = ui1Var.L;
                if (i10 > 0) {
                    this.f37065c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ui1 ui1Var2 = this.f37064b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var2, 10));
                int i11 = ui1Var2.L;
                if (i11 > 0) {
                    this.f37065c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
