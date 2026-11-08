package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class yo0 implements View.OnClickListener {
    public final int f40727a;
    public final boolean f40728b;
    public final int f40729c;
    public final FrameLayout d;

    public yo0(FrameLayout frameLayout, boolean z9, int i7, int i10) {
        this.f40727a = i10;
        this.d = frameLayout;
        this.f40728b = z9;
        this.f40729c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40727a) {
            case 0:
                xs0 xs0Var = (xs0) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40461x1;
                if (this.f40728b) {
                    xs0Var.Y0(f2Var, xs0Var.l1, this.f40729c);
                    return;
                }
                f2Var.getMessagesController().f24774e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
            default:
                up0 up0Var = (up0) this.d;
                if (up0Var.f60285e.h() && up0Var.h.getCurrentPosition() != 0) {
                    up0Var.a();
                    return;
                }
                boolean z9 = this.f40728b;
                int i7 = this.f40729c;
                if (z9) {
                    zh.g1 g1Var = new zh.g1(up0Var.getContext(), i7, up0Var.f60284c, null, null);
                    g1Var.e1(org.telegram.messenger.v1.a(i7).c(up0Var.f60284c));
                    g1Var.show();
                    return;
                }
                wg.f1.l1(2, org.telegram.messenger.v1.a(i7).b());
                return;
        }
    }
}
