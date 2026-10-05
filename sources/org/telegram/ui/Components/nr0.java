package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class nr0 implements View.OnClickListener {
    public final int f29139a;
    public final boolean f29140b;
    public final int f29141c;
    public final FrameLayout d;

    public nr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f29139a = i11;
        this.d = frameLayout;
        this.f29140b = z10;
        this.f29141c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29139a) {
            case 0:
                qv0 qv0Var = (qv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
                if (this.f29140b) {
                    qv0Var.O0(n2Var, qv0Var.f30238j1, this.f29141c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                gs0 gs0Var = (gs0) this.d;
                if (gs0Var.f50235e.h() && gs0Var.h.getCurrentPosition() != 0) {
                    gs0Var.a();
                    return;
                }
                boolean z10 = this.f29140b;
                int i10 = this.f29141c;
                if (z10) {
                    xh.q1 q1Var = new xh.q1(gs0Var.getContext(), i10, gs0Var.f50234c, null, null);
                    q1Var.T(BirthdayController.getInstance(i10).isToday(gs0Var.f50234c));
                    q1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
