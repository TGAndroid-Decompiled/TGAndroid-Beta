package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class up0 implements View.OnClickListener {
    public final int f31011a;
    public final zt0 f31012b;

    public up0(zt0 zt0Var, int i10) {
        this.f31011a = i10;
        this.f31012b = zt0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31011a) {
            case 0:
                zt0 zt0Var = this.f31012b;
                int closestTab = zt0Var.getClosestTab();
                z60 H = z60.H(zt0Var.f33240x1, view);
                H.J = false;
                if (zt0Var.Z(closestTab, new k2.m0(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.i0.L(52.0f));
                    }
                    H.f32941s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                zt0 zt0Var2 = this.f31012b;
                org.telegram.ui.ActionBar.p5 p5Var = zt0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p5Var.f20826b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (zt0Var2.Z(zt0Var2.getClosestTab(), new n2.u(zt0Var2, 14))) {
                    p5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f31012b.T(true);
                return;
            case 3:
                zt0 zt0Var3 = this.f31012b;
                zq0 zq0Var = zt0Var3.f33173b0;
                vq0 vq0Var = zt0Var3.f33170a0;
                if (zt0Var3.f33227s0.getAlpha() >= 0.1f) {
                    if (vq0Var != null && vq0Var.g()) {
                        vq0Var.i();
                    }
                    if (zq0Var != null && zq0Var.f44256f) {
                        yt0 s12 = zt0Var3.s1(zt0Var3.r1(zt0Var3.getClosestTab()));
                        ss0 e02 = zt0Var3.e0(s12.f32788a);
                        if (e02 != null) {
                            zq0Var.setReorderingAlbums(false);
                            dr0 dr0Var = e02.h;
                            for (int i10 = 0; i10 < dr0Var.getChildCount(); i10++) {
                                View childAt = dr0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    ((org.telegram.ui.Cells.s7) childAt).l(false, true);
                                }
                            }
                            xt0 xt0Var = s12.f32790c;
                            if (xt0Var != null && xt0Var.f32254y) {
                                xt0Var.f32254y = false;
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
                org.telegram.ui.ActionBar.k2 k2Var = this.f31012b.f33240x1;
                k2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
