package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class fs0 implements View.OnClickListener {
    public final int f26164a;
    public final boolean f26165b;
    public final int f26166c;
    public final FrameLayout d;

    public fs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f26164a = i11;
        this.d = frameLayout;
        this.f26165b = z10;
        this.f26166c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26164a) {
            case 0:
                hw0 hw0Var = (hw0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26972v1;
                if (this.f26165b) {
                    hw0Var.O0(m2Var, hw0Var.f26947j1, this.f26166c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
            default:
                xs0 xs0Var = (xs0) this.d;
                if (xs0Var.f51724e.h() && xs0Var.h.getCurrentPosition() != 0) {
                    xs0Var.a();
                    return;
                }
                boolean z10 = this.f26165b;
                int i10 = this.f26166c;
                if (z10) {
                    xh.q1 q1Var = new xh.q1(xs0Var.getContext(), i10, xs0Var.f51723c, null, null);
                    q1Var.W(BirthdayController.getInstance(i10).isToday(xs0Var.f51723c));
                    q1Var.show();
                    return;
                }
                tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
