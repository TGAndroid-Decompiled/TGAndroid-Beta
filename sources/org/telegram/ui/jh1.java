package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class jh1 implements View.OnClickListener {
    public final int f35352a;
    public final ai1 f35353b;
    public final VoIPService f35354c;

    public jh1(ai1 ai1Var, VoIPService voIPService, int i10) {
        this.f35352a = i10;
        this.f35353b = ai1Var;
        this.f35354c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35352a) {
            case 0:
                ai1 ai1Var = this.f35353b;
                AndroidUtilities.runOnUIThread(new kh1(ai1Var, 8));
                int i10 = ai1Var.I;
                if (i10 > 0) {
                    this.f35354c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ai1 ai1Var2 = this.f35353b;
                AndroidUtilities.runOnUIThread(new kh1(ai1Var2, 10));
                int i11 = ai1Var2.I;
                if (i11 > 0) {
                    this.f35354c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
