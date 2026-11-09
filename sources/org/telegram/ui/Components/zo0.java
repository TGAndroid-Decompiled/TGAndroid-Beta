package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class zo0 implements View.OnClickListener {
    public final int f41030a;
    public final boolean f41031b;
    public final int f41032c;
    public final FrameLayout d;

    public zo0(FrameLayout frameLayout, boolean z9, int i7, int i10) {
        this.f41030a = i10;
        this.d = frameLayout;
        this.f41031b = z9;
        this.f41032c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41030a) {
            case 0:
                zs0 zs0Var = (zs0) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
                if (this.f41031b) {
                    zs0Var.a1(f2Var, zs0Var.l1, this.f41032c);
                    return;
                }
                f2Var.getMessagesController().f24774e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
            default:
                vp0 vp0Var = (vp0) this.d;
                if (vp0Var.f60295e.h() && vp0Var.h.getCurrentPosition() != 0) {
                    vp0Var.a();
                    return;
                }
                boolean z9 = this.f41031b;
                int i7 = this.f41032c;
                if (z9) {
                    zh.g1 g1Var = new zh.g1(vp0Var.getContext(), i7, vp0Var.f60294c, null, null);
                    g1Var.e1(org.telegram.messenger.v1.a(i7).c(vp0Var.f60294c));
                    g1Var.show();
                    return;
                }
                wg.f1.l1(2, org.telegram.messenger.v1.a(i7).b());
                return;
        }
    }
}
