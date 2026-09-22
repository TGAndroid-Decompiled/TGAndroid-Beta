package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class uq0 implements View.OnClickListener {
    public final int f28485a;
    public final boolean f28486b;
    public final int f28487c;
    public final FrameLayout d;

    public uq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f28485a = i11;
        this.d = frameLayout;
        this.f28486b = z10;
        this.f28487c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28485a) {
            case 0:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30389v1;
                if (this.f28486b) {
                    yu0Var.O0(n2Var, yu0Var.f30364j1, this.f28487c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                nr0 nr0Var = (nr0) this.d;
                if (nr0Var.e.h() && nr0Var.h.getCurrentPosition() != 0) {
                    nr0Var.a();
                    return;
                }
                boolean z10 = this.f28486b;
                int i10 = this.f28487c;
                if (z10) {
                    xh.q1 q1Var = new xh.q1(nr0Var.getContext(), i10, nr0Var.f46103c, null, null);
                    q1Var.V(BirthdayController.getInstance(i10).isToday(nr0Var.f46103c));
                    q1Var.show();
                    return;
                }
                tg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
