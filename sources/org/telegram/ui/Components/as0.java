package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class as0 implements View.OnClickListener {
    public final int f24658a;
    public final boolean f24659b;
    public final int f24660c;
    public final FrameLayout d;

    public as0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24658a = i11;
        this.d = frameLayout;
        this.f24659b = z10;
        this.f24660c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24658a) {
            case 0:
                cw0 cw0Var = (cw0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
                if (this.f24659b) {
                    cw0Var.O0(m2Var, cw0Var.f25511j1, this.f24660c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ss0 ss0Var = (ss0) this.d;
                if (ss0Var.f51635e.h() && ss0Var.h.getCurrentPosition() != 0) {
                    ss0Var.a();
                    return;
                }
                boolean z10 = this.f24659b;
                int i10 = this.f24660c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(ss0Var.getContext(), i10, ss0Var.f51634c, null, null);
                    r1Var.W(BirthdayController.getInstance(i10).isToday(ss0Var.f51634c));
                    r1Var.show();
                    return;
                }
                tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
