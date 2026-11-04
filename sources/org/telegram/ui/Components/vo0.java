package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vo0 implements View.OnClickListener {
    public final int f39199a;
    public final ws0 f39200b;

    public vo0(ws0 ws0Var, int i3) {
        this.f39199a = i3;
        this.f39200b = ws0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39199a) {
            case 0:
                ws0 ws0Var = this.f39200b;
                int closestTab = ws0Var.getClosestTab();
                f60 H = f60.H(ws0Var.f40142y1, view);
                H.J = false;
                if (ws0Var.b0(closestTab, new y00(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    H.f33747s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                ws0 ws0Var2 = this.f39200b;
                org.telegram.ui.ActionBar.f5 f5Var = ws0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.f28440b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ws0Var2.b0(ws0Var2.getClosestTab(), new i9(ws0Var2, 7))) {
                    f5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f39200b.V(true);
                return;
            case 3:
                ws0 ws0Var3 = this.f39200b;
                yp0 yp0Var = ws0Var3.f40076c0;
                vp0 vp0Var = ws0Var3.f40072b0;
                if (ws0Var3.f40128t0.getAlpha() >= 0.1f) {
                    if (vp0Var != null && vp0Var.g()) {
                        vp0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f44470f) {
                        vs0 v12 = ws0Var3.v1(ws0Var3.u1(ws0Var3.getClosestTab()));
                        rr0 g02 = ws0Var3.g0(v12.f39780a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i3 = 0; i3 < cq0Var.getChildCount(); i3++) {
                                View childAt = cq0Var.getChildAt(i3);
                                if (childAt instanceof org.telegram.ui.Cells.n7) {
                                    ((org.telegram.ui.Cells.n7) childAt).l(false, true);
                                }
                            }
                            us0 us0Var = v12.f39782c;
                            if (us0Var != null && us0Var.f38553y) {
                                us0Var.f38553y = false;
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
                org.telegram.ui.ActionBar.d2 d2Var = this.f39200b.f40142y1;
                d2Var.getMessagesController().f22999e7.edit().putBoolean("story_keep", true).apply();
                gi.va.D(d2Var.getParentActivity(), d2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
