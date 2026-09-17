package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ci1 implements View.OnClickListener {
    public final int f32816a;
    public final ti1 f32817b;
    public final VoIPService f32818c;

    public ci1(ti1 ti1Var, VoIPService voIPService, int i10) {
        this.f32816a = i10;
        this.f32817b = ti1Var;
        this.f32818c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32816a) {
            case 0:
                ti1 ti1Var = this.f32817b;
                AndroidUtilities.runOnUIThread(new di1(ti1Var, 8));
                int i10 = ti1Var.L;
                if (i10 > 0) {
                    this.f32818c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                ti1 ti1Var2 = this.f32817b;
                AndroidUtilities.runOnUIThread(new di1(ti1Var2, 10));
                int i11 = ti1Var2.L;
                if (i11 > 0) {
                    this.f32818c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
