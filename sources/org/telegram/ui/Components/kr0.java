package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class kr0 implements View.OnClickListener {
    public final int f25815a;
    public final boolean f25816b;
    public final int f25817c;
    public final FrameLayout d;

    public kr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25815a = i11;
        this.d = frameLayout;
        this.f25816b = z10;
        this.f25817c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25815a) {
            case 0:
                mv0 mv0Var = (mv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
                if (this.f25816b) {
                    mv0Var.O0(m2Var, mv0Var.f26424j1, this.f25817c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
            default:
                cs0 cs0Var = (cs0) this.d;
                if (cs0Var.e.h() && cs0Var.h.getCurrentPosition() != 0) {
                    cs0Var.a();
                    return;
                }
                boolean z10 = this.f25816b;
                int i10 = this.f25817c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(cs0Var.getContext(), i10, cs0Var.f46506c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(cs0Var.f46506c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
