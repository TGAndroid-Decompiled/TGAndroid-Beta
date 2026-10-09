package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class zr0 implements View.OnClickListener {
    public final int f33628a;
    public final boolean f33629b;
    public final int f33630c;
    public final FrameLayout d;

    public zr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f33628a = i11;
        this.d = frameLayout;
        this.f33629b = z10;
        this.f33630c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33628a) {
            case 0:
                bw0 bw0Var = (bw0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
                if (this.f33629b) {
                    bw0Var.O0(n2Var, bw0Var.f25141j1, this.f33630c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
            default:
                rs0 rs0Var = (rs0) this.d;
                if (rs0Var.f51512e.h() && rs0Var.h.getCurrentPosition() != 0) {
                    rs0Var.a();
                    return;
                }
                boolean z10 = this.f33629b;
                int i10 = this.f33630c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(rs0Var.getContext(), i10, rs0Var.f51511c, null, null);
                    r1Var.W(BirthdayController.getInstance(i10).isToday(rs0Var.f51511c));
                    r1Var.show();
                    return;
                }
                tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
