package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hp0 implements View.OnClickListener {
    public final int f35784a;
    public final it0 f35785b;

    public hp0(it0 it0Var, int i7) {
        this.f35784a = i7;
        this.f35785b = it0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35784a) {
            case 0:
                it0 it0Var = this.f35785b;
                int closestTab = it0Var.getClosestTab();
                x60 I = x60.I(it0Var.f36166y1, view);
                I.J = false;
                if (it0Var.b0(closestTab, new org.telegram.ui.ActionBar.i5(I))) {
                    if (closestTab != 13 && closestTab != 11) {
                        I.f41862b0 = true;
                    } else {
                        I.b0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                    }
                    I.f41892s = 0;
                    I.a0();
                    return;
                }
                return;
            case 1:
                it0 it0Var2 = this.f35785b;
                org.telegram.ui.ActionBar.g5 g5Var = it0Var2.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.f29959b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (it0Var2.b0(it0Var2.getClosestTab(), new org.telegram.ui.Cells.aa(it0Var2, 8))) {
                    g5Var.V(null, null);
                    return;
                }
                return;
            case 2:
                this.f35785b.V(true);
                return;
            case 3:
                it0 it0Var3 = this.f35785b;
                iq0 iq0Var = it0Var3.f36100c0;
                fq0 fq0Var = it0Var3.f36096b0;
                if (it0Var3.f36152t0.getAlpha() >= 0.1f) {
                    if (fq0Var != null && fq0Var.g()) {
                        fq0Var.i();
                    }
                    if (iq0Var != null && iq0Var.f49873f) {
                        ht0 x12 = it0Var3.x1(it0Var3.w1(it0Var3.getClosestTab()));
                        ds0 g02 = it0Var3.g0(x12.f35816a);
                        if (g02 != null) {
                            iq0Var.setReorderingAlbums(false);
                            mq0 mq0Var = g02.h;
                            for (int i7 = 0; i7 < mq0Var.getChildCount(); i7++) {
                                View childAt = mq0Var.getChildAt(i7);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    ((org.telegram.ui.Cells.o7) childAt).l(false, true);
                                }
                            }
                            gt0 gt0Var = x12.f35818c;
                            if (gt0Var != null && gt0Var.f35202y) {
                                gt0Var.f35202y = false;
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
                org.telegram.ui.ActionBar.g2 g2Var = this.f35785b.f36166y1;
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                hi.nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
