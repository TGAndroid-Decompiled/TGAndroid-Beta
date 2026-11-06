package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ob1 implements View.OnClickListener {
    public final int f48335a;
    public final ec1 f48336b;
    public final VoIPService f48337c;

    public ob1(ec1 ec1Var, VoIPService voIPService, int i7) {
        this.f48335a = i7;
        this.f48336b = ec1Var;
        this.f48337c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48335a) {
            case 0:
                ec1 ec1Var = this.f48336b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var, 8));
                int i7 = ec1Var.L;
                if (i7 > 0) {
                    this.f48337c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                ec1 ec1Var2 = this.f48336b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var2, 10));
                int i10 = ec1Var2.L;
                if (i10 > 0) {
                    this.f48337c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
