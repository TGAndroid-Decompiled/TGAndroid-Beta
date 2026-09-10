package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class fr0 implements View.OnClickListener {
    public final int f23072a;
    public final boolean f23073b;
    public final int f23074c;
    public final FrameLayout d;

    public fr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f23072a = i11;
        this.d = frameLayout;
        this.f23073b = z10;
        this.f23074c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23072a) {
            case 0:
                iv0 iv0Var = (iv0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
                if (this.f23073b) {
                    iv0Var.O0(p2Var, iv0Var.f24106j1, this.f23074c);
                    return;
                }
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                bi.ce.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
            default:
                wr0 wr0Var = (wr0) this.d;
                if (wr0Var.e.h() && wr0Var.h.getCurrentPosition() != 0) {
                    wr0Var.a();
                    return;
                }
                boolean z10 = this.f23073b;
                int i10 = this.f23074c;
                if (z10) {
                    wh.p1 p1Var = new wh.p1(wr0Var.getContext(), i10, wr0Var.f44319c, null, null);
                    p1Var.V(BirthdayController.getInstance(i10).isToday(wr0Var.f44319c));
                    p1Var.show();
                    return;
                }
                sg.p1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
