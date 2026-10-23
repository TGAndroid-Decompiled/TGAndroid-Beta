package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class vr0 implements View.OnClickListener {
    public final int f32043a;
    public final boolean f32044b;
    public final int f32045c;
    public final FrameLayout d;

    public vr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f32043a = i11;
        this.d = frameLayout;
        this.f32044b = z10;
        this.f32045c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32043a) {
            case 0:
                xv0 xv0Var = (xv0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
                if (this.f32044b) {
                    xv0Var.R0(o2Var, xv0Var.f32686j1, this.f32045c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(o2Var.getParentActivity(), o2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ns0 ns0Var = (ns0) this.d;
                if (ns0Var.e.h() && ns0Var.h.getCurrentPosition() != 0) {
                    ns0Var.a();
                    return;
                }
                boolean z10 = this.f32044b;
                int i10 = this.f32045c;
                if (z10) {
                    yh.o1 o1Var = new yh.o1(ns0Var.getContext(), i10, ns0Var.f50926c, null, null);
                    o1Var.V(BirthdayController.getInstance(i10).isToday(ns0Var.f50926c));
                    o1Var.show();
                    return;
                }
                ug.l1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
