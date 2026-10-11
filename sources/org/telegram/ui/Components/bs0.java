package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class bs0 implements View.OnClickListener {
    public final int f25013a;
    public final boolean f25014b;
    public final int f25015c;
    public final FrameLayout d;

    public bs0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25013a = i11;
        this.d = frameLayout;
        this.f25014b = z10;
        this.f25015c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25013a) {
            case 0:
                dw0 dw0Var = (dw0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
                if (this.f25014b) {
                    dw0Var.O0(m2Var, dw0Var.f25710j1, this.f25015c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.D(m2Var.getParentActivity(), m2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ts0 ts0Var = (ts0) this.d;
                if (ts0Var.f51601e.h() && ts0Var.h.getCurrentPosition() != 0) {
                    ts0Var.a();
                    return;
                }
                boolean z10 = this.f25014b;
                int i10 = this.f25015c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(ts0Var.getContext(), i10, ts0Var.f51600c, null, null);
                    r1Var.W(BirthdayController.getInstance(i10).isToday(ts0Var.f51600c));
                    r1Var.show();
                    return;
                }
                tg.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
