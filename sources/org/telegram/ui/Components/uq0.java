package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class uq0 implements View.OnClickListener {
    public final int f30985a;
    public final boolean f30986b;
    public final int f30987c;
    public final FrameLayout d;

    public uq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f30985a = i11;
        this.d = frameLayout;
        this.f30986b = z10;
        this.f30987c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30985a) {
            case 0:
                xu0 xu0Var = (xu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
                if (this.f30986b) {
                    xu0Var.O0(n2Var, xu0Var.f32728j1, this.f30987c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                di.pc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                nr0 nr0Var = (nr0) this.d;
                if (nr0Var.f50547e.h() && nr0Var.h.getCurrentPosition() != 0) {
                    nr0Var.a();
                    return;
                }
                boolean z10 = this.f30986b;
                int i10 = this.f30987c;
                if (z10) {
                    yh.p1 p1Var = new yh.p1(nr0Var.getContext(), i10, nr0Var.f50546c, null, null);
                    p1Var.V(BirthdayController.getInstance(i10).isToday(nr0Var.f50546c));
                    p1Var.show();
                    return;
                }
                ug.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
