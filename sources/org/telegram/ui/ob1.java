package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ob1 implements View.OnClickListener {
    public final int f48363a;
    public final ec1 f48364b;
    public final VoIPService f48365c;

    public ob1(ec1 ec1Var, VoIPService voIPService, int i7) {
        this.f48363a = i7;
        this.f48364b = ec1Var;
        this.f48365c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48363a) {
            case 0:
                ec1 ec1Var = this.f48364b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var, 8));
                int i7 = ec1Var.L;
                if (i7 > 0) {
                    this.f48365c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                ec1 ec1Var2 = this.f48364b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var2, 10));
                int i10 = ec1Var2.L;
                if (i10 > 0) {
                    this.f48365c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
