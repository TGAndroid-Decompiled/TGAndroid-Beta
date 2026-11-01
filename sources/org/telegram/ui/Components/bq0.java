package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class bq0 implements View.OnClickListener {
    public final int f24909a;
    public final boolean f24910b;
    public final int f24911c;
    public final FrameLayout d;

    public bq0(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f24909a = i11;
        this.d = frameLayout;
        this.f24910b = z10;
        this.f24911c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24909a) {
            case 0:
                au0 au0Var = (au0) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
                if (this.f24910b) {
                    au0Var.W0(k2Var, au0Var.l1, this.f24911c);
                    return;
                }
                k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                return;
            default:
                wq0 wq0Var = (wq0) this.d;
                if (wq0Var.e.h() && wq0Var.h.getCurrentPosition() != 0) {
                    wq0Var.a();
                    return;
                }
                boolean z10 = this.f24910b;
                int i10 = this.f24911c;
                if (z10) {
                    ph.l1 l1Var = new ph.l1(wq0Var.getContext(), i10, wq0Var.f45141c, null, null);
                    l1Var.e1(org.telegram.messenger.y1.a(i10).c(wq0Var.f45141c));
                    l1Var.show();
                    return;
                }
                mg.i2.l1(2, org.telegram.messenger.y1.a(i10).b());
                return;
        }
    }
}
