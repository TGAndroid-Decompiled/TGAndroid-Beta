package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class ir0 implements View.OnClickListener {
    public final int f25221a;
    public final boolean f25222b;
    public final int f25223c;
    public final FrameLayout d;

    public ir0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25221a = i11;
        this.d = frameLayout;
        this.f25222b = z10;
        this.f25223c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25221a) {
            case 0:
                lv0 lv0Var = (lv0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
                if (this.f25222b) {
                    lv0Var.O0(o2Var, lv0Var.f26187j1, this.f25223c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
            default:
                bs0 bs0Var = (bs0) this.d;
                if (bs0Var.e.h() && bs0Var.h.getCurrentPosition() != 0) {
                    bs0Var.a();
                    return;
                }
                boolean z10 = this.f25222b;
                int i10 = this.f25223c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(bs0Var.getContext(), i10, bs0Var.f46471c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(bs0Var.f46471c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
