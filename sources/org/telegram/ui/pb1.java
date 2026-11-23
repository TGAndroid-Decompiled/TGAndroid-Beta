package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class pb1 implements View.OnClickListener {
    public final int f50964a;
    public final fc1 f50965b;
    public final VoIPService f50966c;

    public pb1(fc1 fc1Var, VoIPService voIPService, int i7) {
        this.f50964a = i7;
        this.f50965b = fc1Var;
        this.f50966c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50964a) {
            case 0:
                fc1 fc1Var = this.f50965b;
                org.telegram.messenger.g0.g3(new rb1(fc1Var, 8));
                int i7 = fc1Var.M;
                if (i7 > 0) {
                    this.f50966c.sendCallRating(i7);
                    return;
                }
                return;
            default:
                fc1 fc1Var2 = this.f50965b;
                org.telegram.messenger.g0.g3(new rb1(fc1Var2, 10));
                int i10 = fc1Var2.M;
                if (i10 > 0) {
                    this.f50966c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
