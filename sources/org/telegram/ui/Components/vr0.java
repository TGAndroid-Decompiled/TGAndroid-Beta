package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class vr0 implements View.OnClickListener {
    public final int f30299a;
    public final boolean f30300b;
    public final int f30301c;
    public final FrameLayout d;

    public vr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f30299a = i11;
        this.d = frameLayout;
        this.f30300b = z10;
        this.f30301c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30299a) {
            case 0:
                xv0 xv0Var = (xv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31069v1;
                if (this.f30300b) {
                    xv0Var.P0(m2Var, xv0Var.f31044j1, this.f30301c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.kc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ns0 ns0Var = (ns0) this.d;
                if (ns0Var.e.h() && ns0Var.h.getCurrentPosition() != 0) {
                    ns0Var.a();
                    return;
                }
                boolean z10 = this.f30300b;
                int i10 = this.f30301c;
                if (z10) {
                    yh.p1 p1Var = new yh.p1(ns0Var.getContext(), i10, ns0Var.f49090c, null, null);
                    p1Var.W(BirthdayController.getInstance(i10).isToday(ns0Var.f49090c));
                    p1Var.show();
                    return;
                }
                ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
