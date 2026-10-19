package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class rr0 implements View.OnClickListener {
    public final int f30030a;
    public final boolean f30031b;
    public final int f30032c;
    public final FrameLayout d;

    public rr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f30030a = i11;
        this.d = frameLayout;
        this.f30031b = z10;
        this.f30032c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30030a) {
            case 0:
                tv0 tv0Var = (tv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
                if (this.f30031b) {
                    tv0Var.Q0(n2Var, tv0Var.f30707j1, this.f30032c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
            default:
                js0 js0Var = (js0) this.d;
                if (js0Var.e.h() && js0Var.h.getCurrentPosition() != 0) {
                    js0Var.a();
                    return;
                }
                boolean z10 = this.f30031b;
                int i10 = this.f30032c;
                if (z10) {
                    yh.o1 o1Var = new yh.o1(js0Var.getContext(), i10, js0Var.f50460c, null, null);
                    o1Var.W(BirthdayController.getInstance(i10).isToday(js0Var.f50460c));
                    o1Var.show();
                    return;
                }
                ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
