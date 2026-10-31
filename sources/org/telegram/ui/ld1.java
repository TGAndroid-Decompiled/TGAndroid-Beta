package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ld1 implements View.OnClickListener {
    public final int f39187a;
    public final be1 f39188b;
    public final VoIPService f39189c;

    public ld1(be1 be1Var, VoIPService voIPService, int i10) {
        this.f39187a = i10;
        this.f39188b = be1Var;
        this.f39189c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39187a) {
            case 0:
                be1 be1Var = this.f39188b;
                org.telegram.messenger.i0.g3(new md1(be1Var, 8));
                int i10 = be1Var.L;
                if (i10 > 0) {
                    this.f39189c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                be1 be1Var2 = this.f39188b;
                org.telegram.messenger.i0.g3(new md1(be1Var2, 10));
                int i11 = be1Var2.L;
                if (i11 > 0) {
                    this.f39189c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
