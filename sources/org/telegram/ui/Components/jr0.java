package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class jr0 implements View.OnClickListener {
    public final int f25439a;
    public final boolean f25440b;
    public final int f25441c;
    public final FrameLayout d;

    public jr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25439a = i11;
        this.d = frameLayout;
        this.f25440b = z10;
        this.f25441c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25439a) {
            case 0:
                lv0 lv0Var = (lv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
                if (this.f25440b) {
                    lv0Var.O0(n2Var, lv0Var.f26209j1, this.f25441c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                bs0 bs0Var = (bs0) this.d;
                if (bs0Var.e.h() && bs0Var.h.getCurrentPosition() != 0) {
                    bs0Var.a();
                    return;
                }
                boolean z10 = this.f25440b;
                int i10 = this.f25441c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(bs0Var.getContext(), i10, bs0Var.f46439c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(bs0Var.f46439c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
