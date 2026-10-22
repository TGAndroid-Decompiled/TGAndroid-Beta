package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class sr0 implements View.OnClickListener {
    public final int f30349a;
    public final boolean f30350b;
    public final int f30351c;
    public final FrameLayout d;

    public sr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f30349a = i11;
        this.d = frameLayout;
        this.f30350b = z10;
        this.f30351c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30349a) {
            case 0:
                uv0 uv0Var = (uv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31074v1;
                if (this.f30350b) {
                    uv0Var.Q0(n2Var, uv0Var.f31049j1, this.f30351c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
            default:
                ks0 ks0Var = (ks0) this.d;
                if (ks0Var.e.h() && ks0Var.h.getCurrentPosition() != 0) {
                    ks0Var.a();
                    return;
                }
                boolean z10 = this.f30350b;
                int i10 = this.f30351c;
                if (z10) {
                    yh.o1 o1Var = new yh.o1(ks0Var.getContext(), i10, ks0Var.f50468c, null, null);
                    o1Var.W(BirthdayController.getInstance(i10).isToday(ks0Var.f50468c));
                    o1Var.show();
                    return;
                }
                ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
