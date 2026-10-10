package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class as0 implements View.OnClickListener {
    public final int f24616a;
    public final boolean f24617b;
    public final int f24618c;
    public final FrameLayout d;

    public as0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24616a = i11;
        this.d = frameLayout;
        this.f24617b = z10;
        this.f24618c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24616a) {
            case 0:
                cw0 cw0Var = (cw0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
                if (this.f24617b) {
                    cw0Var.O0(n2Var, cw0Var.f25449j1, this.f24618c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ss0 ss0Var = (ss0) this.d;
                if (ss0Var.f51558e.h() && ss0Var.h.getCurrentPosition() != 0) {
                    ss0Var.a();
                    return;
                }
                boolean z10 = this.f24617b;
                int i10 = this.f24618c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(ss0Var.getContext(), i10, ss0Var.f51557c, null, null);
                    r1Var.W(BirthdayController.getInstance(i10).isToday(ss0Var.f51557c));
                    r1Var.show();
                    return;
                }
                tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
