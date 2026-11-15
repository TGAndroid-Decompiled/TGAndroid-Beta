package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xo0 implements View.OnClickListener {
    public final int f41744a;
    public final ys0 f41745b;

    public xo0(ys0 ys0Var, int i7) {
        this.f41744a = i7;
        this.f41745b = ys0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41744a) {
            case 0:
                ys0 ys0Var = this.f41745b;
                int closestTab = ys0Var.getClosestTab();
                m60 H = m60.H(ys0Var.f42150y1, view);
                H.J = false;
                if (ys0Var.b0(closestTab, new cf(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    H.f37111s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                ys0 ys0Var2 = this.f41745b;
                org.telegram.ui.ActionBar.d5 d5Var = ys0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.f29497b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ys0Var2.b0(ys0Var2.getClosestTab(), new ff(ys0Var2, 6))) {
                    d5Var.V(null, null);
                    return;
                }
                return;
            case 2:
                this.f41745b.V(true);
                return;
            case 3:
                ys0 ys0Var3 = this.f41745b;
                zp0 zp0Var = ys0Var3.f42084c0;
                wp0 wp0Var = ys0Var3.f42080b0;
                if (ys0Var3.f42136t0.getAlpha() >= 0.1f) {
                    if (wp0Var != null && wp0Var.g()) {
                        wp0Var.i();
                    }
                    if (zp0Var != null && zp0Var.f48495f) {
                        xs0 x12 = ys0Var3.x1(ys0Var3.w1(ys0Var3.getClosestTab()));
                        tr0 g02 = ys0Var3.g0(x12.f41758a);
                        if (g02 != null) {
                            zp0Var.setReorderingAlbums(false);
                            dq0 dq0Var = g02.h;
                            for (int i7 = 0; i7 < dq0Var.getChildCount(); i7++) {
                                View childAt = dq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.n7) {
                                    ((org.telegram.ui.Cells.n7) childAt).l(false, true);
                                }
                            }
                            ws0 ws0Var = x12.f41760c;
                            if (ws0Var != null && ws0Var.f41149y) {
                                ws0Var.f41149y = false;
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
                org.telegram.ui.ActionBar.e2 e2Var = this.f41745b.f42150y1;
                e2Var.getMessagesController().f25280f7.edit().putBoolean("story_keep", true).apply();
                hi.sa.D(e2Var.getParentActivity(), e2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
