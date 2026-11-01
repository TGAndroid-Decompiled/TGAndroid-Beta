package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class jd1 implements View.OnClickListener {
    public final int f38367a;
    public final zd1 f38368b;
    public final VoIPService f38369c;

    public jd1(zd1 zd1Var, VoIPService voIPService, int i10) {
        this.f38367a = i10;
        this.f38368b = zd1Var;
        this.f38369c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38367a) {
            case 0:
                zd1 zd1Var = this.f38368b;
                org.telegram.messenger.i0.g3(new kd1(zd1Var, 8));
                int i10 = zd1Var.L;
                if (i10 > 0) {
                    this.f38369c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                zd1 zd1Var2 = this.f38368b;
                org.telegram.messenger.i0.g3(new kd1(zd1Var2, 10));
                int i11 = zd1Var2.L;
                if (i11 > 0) {
                    this.f38369c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
