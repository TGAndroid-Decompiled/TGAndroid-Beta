package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class hr0 implements View.OnClickListener {
    public final int f24741a;
    public final boolean f24742b;
    public final int f24743c;
    public final FrameLayout d;

    public hr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24741a = i11;
        this.d = frameLayout;
        this.f24742b = z10;
        this.f24743c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24741a) {
            case 0:
                jv0 jv0Var = (jv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
                if (this.f24742b) {
                    jv0Var.O0(n2Var, jv0Var.f25503j1, this.f24743c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                yr0 yr0Var = (yr0) this.d;
                if (yr0Var.e.h() && yr0Var.h.getCurrentPosition() != 0) {
                    yr0Var.a();
                    return;
                }
                boolean z10 = this.f24742b;
                int i10 = this.f24743c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(yr0Var.getContext(), i10, yr0Var.f46418c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(yr0Var.f46418c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
