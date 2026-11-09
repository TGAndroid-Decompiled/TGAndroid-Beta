package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uo0 implements View.OnClickListener {
    public final int f38763a;
    public final zs0 f38764b;

    public uo0(zs0 zs0Var, int i7) {
        this.f38763a = i7;
        this.f38764b = zs0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38763a) {
            case 0:
                zs0 zs0Var = this.f38764b;
                int closestTab = zs0Var.getClosestTab();
                l60 H = l60.H(zs0Var.f41127x1, view);
                H.J = false;
                if (zs0Var.b0(closestTab, new n(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    H.f35617s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                zs0 zs0Var2 = this.f38764b;
                org.telegram.ui.ActionBar.f5 f5Var = zs0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.f28425b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (zs0Var2.b0(zs0Var2.getClosestTab(), new rt(zs0Var2, 4))) {
                    f5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f38764b.V(true);
                return;
            case 3:
                zs0 zs0Var3 = this.f38764b;
                zp0 zp0Var = zs0Var3.f41061b0;
                vp0 vp0Var = zs0Var3.f41057a0;
                if (zs0Var3.f41114s0.getAlpha() >= 0.1f) {
                    if (vp0Var != null && vp0Var.g()) {
                        vp0Var.i();
                    }
                    if (zp0Var != null && zp0Var.f48549f) {
                        ys0 x12 = zs0Var3.x1(zs0Var3.w1(zs0Var3.getClosestTab()));
                        ur0 g02 = zs0Var3.g0(x12.f40800a);
                        if (g02 != null) {
                            zp0Var.setReorderingAlbums(false);
                            dq0 dq0Var = g02.h;
                            for (int i7 = 0; i7 < dq0Var.getChildCount(); i7++) {
                                View childAt = dq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            xs0 xs0Var = x12.f40802c;
                            if (xs0Var != null && xs0Var.f40148y) {
                                xs0Var.f40148y = false;
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
                org.telegram.ui.ActionBar.f2 f2Var = this.f38764b.f41127x1;
                f2Var.getMessagesController().f24774e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
