package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class mr0 implements View.OnClickListener {
    public final int f28684a;
    public final boolean f28685b;
    public final int f28686c;
    public final FrameLayout d;

    public mr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f28684a = i11;
        this.d = frameLayout;
        this.f28685b = z10;
        this.f28686c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28684a) {
            case 0:
                pv0 pv0Var = (pv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29800v1;
                if (this.f28685b) {
                    pv0Var.O0(n2Var, pv0Var.f29775j1, this.f28686c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.kc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                fs0 fs0Var = (fs0) this.d;
                if (fs0Var.f50219e.h() && fs0Var.h.getCurrentPosition() != 0) {
                    fs0Var.a();
                    return;
                }
                boolean z10 = this.f28685b;
                int i10 = this.f28686c;
                if (z10) {
                    xh.q1 q1Var = new xh.q1(fs0Var.getContext(), i10, fs0Var.f50218c, null, null);
                    q1Var.T(BirthdayController.getInstance(i10).isToday(fs0Var.f50218c));
                    q1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
