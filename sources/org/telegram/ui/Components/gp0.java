package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gp0 implements View.OnClickListener {
    public final int f35547a;
    public final gt0 f35548b;

    public gp0(gt0 gt0Var, int i7) {
        this.f35547a = i7;
        this.f35548b = gt0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35547a) {
            case 0:
                gt0 gt0Var = this.f35548b;
                int closestTab = gt0Var.getClosestTab();
                y60 I = y60.I(gt0Var.f35642y1, view);
                I.J = false;
                if (gt0Var.b0(closestTab, new org.telegram.ui.Cells.b5(I))) {
                    if (closestTab != 13 && closestTab != 11) {
                        I.f42345b0 = true;
                    } else {
                        I.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    I.f42375s = 0;
                    I.a0();
                    return;
                }
                return;
            case 1:
                gt0 gt0Var2 = this.f35548b;
                org.telegram.ui.ActionBar.h5 h5Var = gt0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.f29918b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (gt0Var2.b0(gt0Var2.getClosestTab(), new of(gt0Var2, 6))) {
                    h5Var.V(null, null);
                    return;
                }
                return;
            case 2:
                this.f35548b.V(true);
                return;
            case 3:
                gt0 gt0Var3 = this.f35548b;
                hq0 hq0Var = gt0Var3.f35576c0;
                eq0 eq0Var = gt0Var3.f35572b0;
                if (gt0Var3.f35628t0.getAlpha() >= 0.1f) {
                    if (eq0Var != null && eq0Var.g()) {
                        eq0Var.i();
                    }
                    if (hq0Var != null && hq0Var.f50356f) {
                        ft0 x12 = gt0Var3.x1(gt0Var3.w1(gt0Var3.getClosestTab()));
                        bs0 g02 = gt0Var3.g0(x12.f35164a);
                        if (g02 != null) {
                            hq0Var.setReorderingAlbums(false);
                            lq0 lq0Var = g02.h;
                            for (int i7 = 0; i7 < lq0Var.getChildCount(); i7++) {
                                View childAt = lq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            et0 et0Var = x12.f35166c;
                            if (et0Var != null && et0Var.f34507y) {
                                et0Var.f34507y = false;
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
                org.telegram.ui.ActionBar.h2 h2Var = this.f35548b.f35642y1;
                h2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                hi.ta.D(h2Var.getParentActivity(), h2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
