package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class jr0 implements View.OnClickListener {
    public final int f25506a;
    public final boolean f25507b;
    public final int f25508c;
    public final FrameLayout d;

    public jr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25506a = i11;
        this.d = frameLayout;
        this.f25507b = z10;
        this.f25508c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25506a) {
            case 0:
                lv0 lv0Var = (lv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26154v1;
                if (this.f25507b) {
                    lv0Var.O0(m2Var, lv0Var.f26129j1, this.f25508c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
            default:
                bs0 bs0Var = (bs0) this.d;
                if (bs0Var.e.h() && bs0Var.h.getCurrentPosition() != 0) {
                    bs0Var.a();
                    return;
                }
                boolean z10 = this.f25507b;
                int i10 = this.f25508c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(bs0Var.getContext(), i10, bs0Var.f46400c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(bs0Var.f46400c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
