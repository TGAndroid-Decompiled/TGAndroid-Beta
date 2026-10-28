package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vr0 implements View.OnClickListener {
    public final int f34359a;
    public final bw0 f34360b;

    public vr0(bw0 bw0Var, int i10) {
        this.f34359a = i10;
        this.f34360b = bw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34359a) {
            case 0:
                bw0 bw0Var = this.f34360b;
                int closestTab = bw0Var.getClosestTab();
                l80 H = l80.H(bw0Var.f26992x1, view);
                H.J = false;
                if (bw0Var.Y(closestTab, new jg.s0(H, 22))) {
                    if (closestTab != 13 && closestTab != 11) {
                        H.Y = true;
                    } else {
                        H.a0(0.0f, -AndroidUtilities.dp(52.0f));
                    }
                    H.f30168s = 0;
                    H.Z();
                    return;
                }
                return;
            case 1:
                bw0 bw0Var2 = this.f34360b;
                org.telegram.ui.ActionBar.y5 y5Var = bw0Var2.I;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y5Var.f23177b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (bw0Var2.Y(bw0Var2.getClosestTab(), new jg.i(bw0Var2))) {
                    y5Var.U(null, null);
                    return;
                }
                return;
            case 2:
                this.f34360b.S(true);
                return;
            case 3:
                bw0 bw0Var3 = this.f34360b;
                at0 at0Var = bw0Var3.f26928b0;
                ws0 ws0Var = bw0Var3.f26925a0;
                if (bw0Var3.f26979s0.getAlpha() >= 0.1f) {
                    if (ws0Var != null && ws0Var.g()) {
                        ws0Var.i();
                    }
                    if (at0Var != null && at0Var.f41611f) {
                        aw0 r12 = bw0Var3.r1(bw0Var3.q1(bw0Var3.getClosestTab()));
                        uu0 d02 = bw0Var3.d0(r12.f26682a);
                        if (d02 != null) {
                            at0Var.setReorderingAlbums(false);
                            et0 et0Var = d02.h;
                            for (int i10 = 0; i10 < et0Var.getChildCount(); i10++) {
                                View childAt = et0Var.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.w7) {
                                    ((org.telegram.ui.Cells.w7) childAt).l(false, true);
                                }
                            }
                            zv0 zv0Var = r12.f26684c;
                            if (zv0Var != null && zv0Var.f35175x) {
                                zv0Var.f35175x = false;
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
                org.telegram.ui.ActionBar.r2 r2Var = this.f34360b.f26992x1;
                r2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
