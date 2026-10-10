package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f37450a;
    public final Object f37451b;

    public f0(Object obj, int i10) {
        this.f37450a = i10;
        this.f37451b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f37450a) {
            case 0:
                i4 i4Var = (i4) this.f37451b;
                View view = i4Var.f41932f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f41932f = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f37451b;
                znVar.Q8 = null;
                znVar.T8 = null;
                znVar.S8 = null;
                znVar.f45058z0.R = true;
                znVar.j8(false, true, 0.0f);
                ok okVar = znVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                pj pjVar = (pj) this.f37451b;
                pjVar.f40859b = null;
                zn znVar2 = pjVar.f40866w;
                znVar2.Q8 = null;
                znVar2.T8 = null;
                znVar2.S8 = null;
                znVar2.f45058z0.R = true;
                if (znVar2.R8) {
                    znVar2.j8(false, true, 0.0f);
                } else {
                    znVar2.R8 = true;
                }
                ok okVar2 = znVar2.Y;
                if (okVar2 != null && okVar2.getEditField() != null) {
                    znVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f37451b).H3(0.0f);
                return;
        }
    }
}
