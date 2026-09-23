package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class uq0 implements View.OnClickListener {
    public final int f28542a;
    public final boolean f28543b;
    public final int f28544c;
    public final FrameLayout d;

    public uq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f28542a = i11;
        this.d = frameLayout;
        this.f28543b = z10;
        this.f28544c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28542a) {
            case 0:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30450v1;
                if (this.f28543b) {
                    yu0Var.O0(n2Var, yu0Var.f30425j1, this.f28544c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                nr0 nr0Var = (nr0) this.d;
                if (nr0Var.e.h() && nr0Var.h.getCurrentPosition() != 0) {
                    nr0Var.a();
                    return;
                }
                boolean z10 = this.f28543b;
                int i10 = this.f28544c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(nr0Var.getContext(), i10, nr0Var.f46070c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(nr0Var.f46070c));
                    r1Var.show();
                    return;
                }
                tg.n1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
