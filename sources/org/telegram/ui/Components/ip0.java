package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ip0 implements View.OnClickListener {
    public final int f36297a;
    public final jt0 f36298b;

    public ip0(jt0 jt0Var, int i7) {
        this.f36297a = i7;
        this.f36298b = jt0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36297a) {
            case 0:
                jt0 jt0Var = this.f36298b;
                int closestTab = jt0Var.getClosestTab();
                a70 I = a70.I(jt0Var.f36683y1, view);
                I.J = false;
                if (jt0Var.b0(closestTab, new org.telegram.ui.Cells.c5(I))) {
                    if (closestTab != 13 && closestTab != 11) {
                        I.f33367b0 = true;
                    } else {
                        I.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    I.f33397s = 0;
                    I.a0();
                    return;
                }
                return;
            case 1:
                jt0 jt0Var2 = this.f36298b;
                org.telegram.ui.ActionBar.g5 g5Var = jt0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.f29902b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (jt0Var2.b0(jt0Var2.getClosestTab(), new qf(jt0Var2, 6))) {
                    g5Var.V(null, null);
                    return;
                }
                return;
            case 2:
                this.f36298b.V(true);
                return;
            case 3:
                jt0 jt0Var3 = this.f36298b;
                jq0 jq0Var = jt0Var3.f36617c0;
                gq0 gq0Var = jt0Var3.f36613b0;
                if (jt0Var3.f36669t0.getAlpha() >= 0.1f) {
                    if (gq0Var != null && gq0Var.g()) {
                        gq0Var.i();
                    }
                    if (jq0Var != null && jq0Var.f50351f) {
                        it0 x12 = jt0Var3.x1(jt0Var3.w1(jt0Var3.getClosestTab()));
                        ds0 g02 = jt0Var3.g0(x12.f36307a);
                        if (g02 != null) {
                            jq0Var.setReorderingAlbums(false);
                            nq0 nq0Var = g02.h;
                            for (int i7 = 0; i7 < nq0Var.getChildCount(); i7++) {
                                View childAt = nq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.p7) {
                                    ((org.telegram.ui.Cells.p7) childAt).l(false, true);
                                }
                            }
                            ht0 ht0Var = x12.f36309c;
                            if (ht0Var != null && ht0Var.f35673y) {
                                ht0Var.f35673y = false;
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
                org.telegram.ui.ActionBar.g2 g2Var = this.f36298b.f36683y1;
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                hi.sa.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
