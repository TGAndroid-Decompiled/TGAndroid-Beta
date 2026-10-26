package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ur0 implements View.OnClickListener {
    public final int f33485a;
    public final aw0 f33486b;

    public ur0(aw0 aw0Var, int i10) {
        this.f33485a = i10;
        this.f33486b = aw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33485a) {
            case 0:
                aw0 aw0Var = this.f33486b;
                int closestTab = aw0Var.getClosestTab();
                k80 H = k80.H(aw0Var.f26704x1, view);
                H.J = false;
                if (aw0Var.Y(closestTab, new jg.s0(H, 22))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -AndroidUtilities.dp(52.0f));
                    }
                    H.f29868s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                aw0 aw0Var2 = this.f33486b;
                org.telegram.ui.ActionBar.y5 y5Var = aw0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y5Var.f23176b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (aw0Var2.Y(aw0Var2.getClosestTab(), new jg.i(aw0Var2))) {
                    y5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f33486b.S(true);
                return;
            case 3:
                aw0 aw0Var3 = this.f33486b;
                zs0 zs0Var = aw0Var3.f26640b0;
                vs0 vs0Var = aw0Var3.f26637a0;
                if (aw0Var3.f26691s0.getAlpha() >= 0.1f) {
                    if (vs0Var != null && vs0Var.g()) {
                        vs0Var.i();
                    }
                    if (zs0Var != null && zs0Var.f41114f) {
                        zv0 r12 = aw0Var3.r1(aw0Var3.q1(aw0Var3.getClosestTab()));
                        tu0 d02 = aw0Var3.d0(r12.f35412a);
                        if (d02 != null) {
                            zs0Var.setReorderingAlbums(false);
                            dt0 dt0Var = d02.h;
                            for (int i10 = 0; i10 < dt0Var.getChildCount(); i10++) {
                                View childAt = dt0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.w7) {
                                    ((org.telegram.ui.Cells.w7) childAt).l(false, true);
                                }
                            }
                            yv0 yv0Var = r12.f35414c;
                            if (yv0Var != null && yv0Var.f34835x) {
                                yv0Var.f34835x = false;
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
                org.telegram.ui.ActionBar.r2 r2Var = this.f33486b.f26704x1;
                r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
