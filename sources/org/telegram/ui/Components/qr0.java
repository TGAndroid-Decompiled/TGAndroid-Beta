package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class qr0 implements View.OnClickListener {
    public final int f29724a;
    public final boolean f29725b;
    public final int f29726c;
    public final FrameLayout d;

    public qr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f29724a = i11;
        this.d = frameLayout;
        this.f29725b = z10;
        this.f29726c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29724a) {
            case 0:
                sv0 sv0Var = (sv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
                if (this.f29725b) {
                    sv0Var.Q0(n2Var, sv0Var.f30363j1, this.f29726c);
                    return;
                }
                n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ei.vb.D(n2Var.getParentActivity(), n2Var.getCurrentAccount()).Q(null);
                return;
            default:
                is0 is0Var = (is0) this.d;
                if (is0Var.e.h() && is0Var.h.getCurrentPosition() != 0) {
                    is0Var.a();
                    return;
                }
                boolean z10 = this.f29725b;
                int i10 = this.f29726c;
                if (z10) {
                    yh.o1 o1Var = new yh.o1(is0Var.getContext(), i10, is0Var.f50459c, null, null);
                    o1Var.W(BirthdayController.getInstance(i10).isToday(is0Var.f50459c));
                    o1Var.show();
                    return;
                }
                ug.m1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
