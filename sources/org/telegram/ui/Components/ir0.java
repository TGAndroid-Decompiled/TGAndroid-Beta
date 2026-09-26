package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class ir0 implements View.OnClickListener {
    public final int f25181a;
    public final boolean f25182b;
    public final int f25183c;
    public final FrameLayout d;

    public ir0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25181a = i11;
        this.d = frameLayout;
        this.f25182b = z10;
        this.f25183c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25181a) {
            case 0:
                kv0 kv0Var = (kv0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
                if (this.f25182b) {
                    kv0Var.O0(m2Var, kv0Var.f25841j1, this.f25183c);
                    return;
                }
                m2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.lc.E(m2Var.getParentActivity(), m2Var.getCurrentAccount()).R(null);
                return;
            default:
                as0 as0Var = (as0) this.d;
                if (as0Var.e.h() && as0Var.h.getCurrentPosition() != 0) {
                    as0Var.a();
                    return;
                }
                boolean z10 = this.f25182b;
                int i10 = this.f25183c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(as0Var.getContext(), i10, as0Var.f46397c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(as0Var.f46397c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
