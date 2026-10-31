package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class aq0 implements View.OnClickListener {
    public final int f24447a;
    public final boolean f24448b;
    public final int f24449c;
    public final FrameLayout d;

    public aq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24447a = i11;
        this.d = frameLayout;
        this.f24448b = z10;
        this.f24449c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24447a) {
            case 0:
                zt0 zt0Var = (zt0) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
                if (this.f24448b) {
                    zt0Var.V0(k2Var, zt0Var.l1, this.f24449c);
                    return;
                }
                k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                return;
            default:
                vq0 vq0Var = (vq0) this.d;
                if (vq0Var.e.h() && vq0Var.h.getCurrentPosition() != 0) {
                    vq0Var.a();
                    return;
                }
                boolean z10 = this.f24448b;
                int i10 = this.f24449c;
                if (z10) {
                    ph.l1 l1Var = new ph.l1(vq0Var.getContext(), i10, vq0Var.f45130c, null, null);
                    l1Var.e1(org.telegram.messenger.y1.a(i10).c(vq0Var.f45130c));
                    l1Var.show();
                    return;
                }
                mg.i2.l1(2, org.telegram.messenger.y1.a(i10).b());
                return;
        }
    }
}
