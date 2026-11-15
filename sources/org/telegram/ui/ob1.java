package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ob1 implements View.OnClickListener {
    public final int f49902a;
    public final ec1 f49903b;
    public final VoIPService f49904c;

    public ob1(ec1 ec1Var, VoIPService voIPService, int i7) {
        this.f49902a = i7;
        this.f49903b = ec1Var;
        this.f49904c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49902a) {
            case 0:
                ec1 ec1Var = this.f49903b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var, 8));
                int i7 = ec1Var.M;
                if (i7 > 0) {
                    this.f49904c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                ec1 ec1Var2 = this.f49903b;
                org.telegram.messenger.g0.h3(new qb1(ec1Var2, 10));
                int i10 = ec1Var2.M;
                if (i10 > 0) {
                    this.f49904c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
