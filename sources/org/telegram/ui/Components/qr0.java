package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
public final class qr0 implements View.OnClickListener {
    public final int f29725a;
    public final boolean f29726b;
    public final int f29727c;
    public final FrameLayout d;

    public qr0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f29725a = i11;
        this.d = frameLayout;
        this.f29726b = z10;
        this.f29727c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29725a) {
            case 0:
                sv0 sv0Var = (sv0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
                if (this.f29726b) {
                    sv0Var.Q0(n2Var, sv0Var.f30363j1, this.f29727c);
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
                boolean z10 = this.f29726b;
                int i10 = this.f29727c;
                if (z10) {
                    yh.p1 p1Var = new yh.p1(is0Var.getContext(), i10, is0Var.f50494c, null, null);
                    p1Var.W(BirthdayController.getInstance(i10).isToday(is0Var.f50494c));
                    p1Var.show();
                    return;
                }
                ug.l1.f0(2, BirthdayController.getInstance(i10).getState());
                return;
        }
    }
}
