package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class g0 implements PopupWindow.OnDismissListener {
    public final int f33671a;
    public final Object f33672b;

    public g0(Object obj, int i10) {
        this.f33671a = i10;
        this.f33672b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33671a) {
            case 0:
                j4 j4Var = (j4) this.f33672b;
                View view = j4Var.f37322f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f37322f = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.f33672b;
                xnVar.Q8 = null;
                xnVar.T8 = null;
                xnVar.S8 = null;
                xnVar.f40002z0.R = true;
                xnVar.g8(false, true, 0.0f);
                lk lkVar = xnVar.Y;
                if (lkVar != null && lkVar.getEditField() != null) {
                    xnVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                nj njVar = (nj) this.f33672b;
                njVar.f36015b = null;
                xn xnVar2 = njVar.f36021w;
                xnVar2.Q8 = null;
                xnVar2.T8 = null;
                xnVar2.S8 = null;
                xnVar2.f40002z0.R = true;
                if (xnVar2.R8) {
                    xnVar2.g8(false, true, 0.0f);
                } else {
                    xnVar2.R8 = true;
                }
                lk lkVar2 = xnVar2.Y;
                if (lkVar2 != null && lkVar2.getEditField() != null) {
                    xnVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33672b).H3(0.0f);
                return;
        }
    }
}
