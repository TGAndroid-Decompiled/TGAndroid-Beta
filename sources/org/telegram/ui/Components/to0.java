package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class to0 implements View.OnClickListener {
    public final int f38397a;
    public final xs0 f38398b;

    public to0(xs0 xs0Var, int i7) {
        this.f38397a = i7;
        this.f38398b = xs0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38397a) {
            case 0:
                xs0 xs0Var = this.f38398b;
                int closestTab = xs0Var.getClosestTab();
                k60 H = k60.H(xs0Var.f40405x1, view);
                H.J = false;
                if (xs0Var.b0(closestTab, new n(H))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    H.f35216s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                xs0 xs0Var2 = this.f38398b;
                org.telegram.ui.ActionBar.f5 f5Var = xs0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.f28420b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (xs0Var2.b0(xs0Var2.getClosestTab(), new qt(xs0Var2, 4))) {
                    f5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f38398b.V(true);
                return;
            case 3:
                xs0 xs0Var3 = this.f38398b;
                yp0 yp0Var = xs0Var3.f40339b0;
                up0 up0Var = xs0Var3.f40335a0;
                if (xs0Var3.f40392s0.getAlpha() >= 0.1f) {
                    if (up0Var != null && up0Var.g()) {
                        up0Var.i();
                    }
                    if (yp0Var != null && yp0Var.f47313f) {
                        ws0 v12 = xs0Var3.v1(xs0Var3.u1(xs0Var3.getClosestTab()));
                        sr0 g02 = xs0Var3.g0(v12.f40070a);
                        if (g02 != null) {
                            yp0Var.setReorderingAlbums(false);
                            cq0 cq0Var = g02.h;
                            for (int i7 = 0; i7 < cq0Var.getChildCount(); i7++) {
                                View childAt = cq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            vs0 vs0Var = v12.f40072c;
                            if (vs0Var != null && vs0Var.f38733y) {
                                vs0Var.f38733y = false;
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
                org.telegram.ui.ActionBar.f2 f2Var = this.f38398b.f40405x1;
                f2Var.getMessagesController().f24759e7.edit().putBoolean("story_keep", true).apply();
                fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
