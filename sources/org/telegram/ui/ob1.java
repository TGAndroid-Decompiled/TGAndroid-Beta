package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ob1 implements View.OnClickListener {
    public final int f48364a;
    public final ec1 f48365b;
    public final VoIPService f48366c;

    public ob1(ec1 ec1Var, VoIPService voIPService, int i7) {
        this.f48364a = i7;
        this.f48365b = ec1Var;
        this.f48366c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48364a) {
            case 0:
                ec1 ec1Var = this.f48365b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var, 8));
                int i7 = ec1Var.L;
                if (i7 > 0) {
                    this.f48366c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                ec1 ec1Var2 = this.f48365b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var2, 10));
                int i10 = ec1Var2.L;
                if (i10 > 0) {
                    this.f48366c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
