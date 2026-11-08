package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class pb1 implements View.OnClickListener {
    public final int f48768a;
    public final fc1 f48769b;
    public final VoIPService f48770c;

    public pb1(fc1 fc1Var, VoIPService voIPService, int i7) {
        this.f48768a = i7;
        this.f48769b = fc1Var;
        this.f48770c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48768a) {
            case 0:
                fc1 fc1Var = this.f48769b;
                org.telegram.messenger.g0.h3(new rb1(fc1Var, 8));
                int i7 = fc1Var.L;
                if (i7 > 0) {
                    this.f48770c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                fc1 fc1Var2 = this.f48769b;
                org.telegram.messenger.g0.h3(new rb1(fc1Var2, 10));
                int i10 = fc1Var2.L;
                if (i10 > 0) {
                    this.f48770c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
