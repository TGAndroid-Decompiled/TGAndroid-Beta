package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class to0 implements View.OnClickListener {
    public final int f38355a;
    public final ys0 f38356b;

    public to0(ys0 ys0Var, int i7) {
        this.f38355a = i7;
        this.f38356b = ys0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38355a) {
            case 0:
                ys0 ys0Var = this.f38356b;
                int closestTab = ys0Var.getClosestTab();
                k60 H = k60.H(ys0Var.f40719x1, view);
                H.J = false;
                if (ys0Var.b0(closestTab, new m(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    H.f35219s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                ys0 ys0Var2 = this.f38356b;
                org.telegram.ui.ActionBar.g5 g5Var = ys0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.f28430b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ys0Var2.b0(ys0Var2.getClosestTab(), new qt(ys0Var2, 4))) {
                    g5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f38356b.V(true);
                return;
            case 3:
                ys0 ys0Var3 = this.f38356b;
                yp0 yp0Var = ys0Var3.f40653b0;
                up0 up0Var = ys0Var3.f40649a0;
                if (ys0Var3.f40706s0.getAlpha() >= 0.1f) {
                    if (up0Var != null && up0Var.g()) {
                        up0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f48865f) {
                        xs0 x12 = ys0Var3.x1(ys0Var3.w1(ys0Var3.getClosestTab()));
                        tr0 g02 = ys0Var3.g0(x12.f40395a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i7 = 0; i7 < cq0Var.getChildCount(); i7++) {
                                View childAt = cq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            ws0 ws0Var = x12.f40397c;
                            if (ws0Var != null && ws0Var.f39733y) {
                                ws0Var.f39733y = false;
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
                org.telegram.ui.ActionBar.f2 f2Var = this.f38356b.f40719x1;
                f2Var.getMessagesController().f24778e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
