package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class wr0 implements View.OnClickListener {
    public final int f30951a;
    public final boolean f30952b;
    public final int f30953c;
    public final FrameLayout d;

    public wr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f30951a = i11;
        this.d = frameLayout;
        this.f30952b = z10;
        this.f30953c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30951a) {
            case 0:
                xv0 xv0Var = (xv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
                if (this.f30952b) {
                    xv0Var.O0(m2Var, xv0Var.f31363j1, this.f30953c);
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
                boolean z10 = this.f30952b;
                int i10 = this.f30953c;
                if (z10) {
                    yh.p1 p1Var = new yh.p1(ns0Var.getContext(), i10, ns0Var.f49091c, null, null);
                    p1Var.W(BirthdayController.getInstance(i10).isToday(ns0Var.f49091c));
                    p1Var.show();
                    return;
                }
                ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
