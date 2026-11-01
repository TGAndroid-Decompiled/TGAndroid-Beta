package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vp0 implements View.OnClickListener {
    public final int f31868a;
    public final au0 f31869b;

    public vp0(au0 au0Var, int i10) {
        this.f31868a = i10;
        this.f31869b = au0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31868a) {
            case 0:
                au0 au0Var = this.f31869b;
                int closestTab = au0Var.getClosestTab();
                z60 H = z60.H(au0Var.f24568x1, view);
                H.J = false;
                if (au0Var.a0(closestTab, new k2.m0(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.i0.L(52.0f));
                    }
                    H.f33044s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                au0 au0Var2 = this.f31869b;
                org.telegram.ui.ActionBar.p5 p5Var = au0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p5Var.f20827b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (au0Var2.a0(au0Var2.getClosestTab(), new n2.u(au0Var2, 14))) {
                    p5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f31869b.U(true);
                return;
            case 3:
                au0 au0Var3 = this.f31869b;
                ar0 ar0Var = au0Var3.f24501b0;
                wq0 wq0Var = au0Var3.f24498a0;
                if (au0Var3.f24555s0.getAlpha() >= 0.1f) {
                    if (wq0Var != null && wq0Var.g()) {
                        wq0Var.i();
                    }
                    if (ar0Var != null && ar0Var.f43750f) {
                        zt0 t12 = au0Var3.t1(au0Var3.s1(au0Var3.getClosestTab()));
                        ts0 f02 = au0Var3.f0(t12.f33222a);
                        if (f02 != null) {
                            ar0Var.setReorderingAlbums(false);
                            er0 er0Var = f02.h;
                            for (int i10 = 0; i10 < er0Var.getChildCount(); i10++) {
                                View childAt = er0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            yt0 yt0Var = t12.f33224c;
                            if (yt0Var != null && yt0Var.f32638y) {
                                yt0Var.f32638y = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = this.f31869b.f24568x1;
                k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
