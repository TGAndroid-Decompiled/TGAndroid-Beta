package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class hr0 implements View.OnClickListener {
    public final int f24832a;
    public final boolean f24833b;
    public final int f24834c;
    public final FrameLayout d;

    public hr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24832a = i11;
        this.d = frameLayout;
        this.f24833b = z10;
        this.f24834c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24832a) {
            case 0:
                jv0 jv0Var = (jv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
                if (this.f24833b) {
                    jv0Var.O0(m2Var, jv0Var.f25518j1, this.f24834c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
            default:
                zr0 zr0Var = (zr0) this.d;
                if (zr0Var.e.h() && zr0Var.h.getCurrentPosition() != 0) {
                    zr0Var.a();
                    return;
                }
                boolean z10 = this.f24833b;
                int i10 = this.f24834c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(zr0Var.getContext(), i10, zr0Var.f46384c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(zr0Var.f46384c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
