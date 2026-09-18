package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class ir0 implements View.OnClickListener {
    public final int f25034a;
    public final boolean f25035b;
    public final int f25036c;
    public final FrameLayout d;

    public ir0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f25034a = i11;
        this.d = frameLayout;
        this.f25035b = z10;
        this.f25036c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25034a) {
            case 0:
                kv0 kv0Var = (kv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
                if (this.f25035b) {
                    kv0Var.O0(n2Var, kv0Var.f25823j1, this.f25036c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ci.oc.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                return;
            default:
                zr0 zr0Var = (zr0) this.d;
                if (zr0Var.e.h() && zr0Var.h.getCurrentPosition() != 0) {
                    zr0Var.a();
                    return;
                }
                boolean z10 = this.f25035b;
                int i10 = this.f25036c;
                if (z10) {
                    xh.r1 r1Var = new xh.r1(zr0Var.getContext(), i10, zr0Var.f46371c, null, null);
                    r1Var.V(BirthdayController.getInstance(i10).isToday(zr0Var.f46371c));
                    r1Var.show();
                    return;
                }
                tg.m1.e0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
