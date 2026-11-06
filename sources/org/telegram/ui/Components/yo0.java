package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class yo0 implements View.OnClickListener {
    public final int f40689a;
    public final boolean f40690b;
    public final int f40691c;
    public final FrameLayout d;

    public yo0(FrameLayout frameLayout, boolean z9, int i7, int i10) {
        this.f40689a = i10;
        this.d = frameLayout;
        this.f40690b = z9;
        this.f40691c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40689a) {
            case 0:
                xs0 xs0Var = (xs0) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
                if (this.f40690b) {
                    xs0Var.Y0(f2Var, xs0Var.l1, this.f40691c);
                    return;
                }
                f2Var.getMessagesController().f24759e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
            default:
                up0 up0Var = (up0) this.d;
                if (up0Var.f60215e.h() && up0Var.h.getCurrentPosition() != 0) {
                    up0Var.a();
                    return;
                }
                boolean z9 = this.f40690b;
                int i7 = this.f40691c;
                if (z9) {
                    zh.h1 h1Var = new zh.h1(up0Var.getContext(), i7, up0Var.f60214c, null, null);
                    h1Var.e1(org.telegram.messenger.v1.a(i7).c(up0Var.f60214c));
                    h1Var.show();
                    return;
                }
                wg.f1.l1(2, org.telegram.messenger.v1.a(i7).b());
                return;
        }
    }
}
