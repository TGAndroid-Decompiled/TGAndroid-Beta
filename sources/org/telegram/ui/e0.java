package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f36878a;
    public final Object f36879b;

    public e0(Object obj, int i10) {
        this.f36878a = i10;
        this.f36879b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36878a) {
            case 0:
                h4 h4Var = (h4) this.f36879b;
                View view = h4Var.f39483f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f39483f = null;
                    return;
                }
                return;
            case 1:
                un unVar = (un) this.f36879b;
                unVar.f42240e9 = null;
                unVar.f42276h9 = null;
                unVar.f42265g9 = null;
                unVar.B0.R = true;
                unVar.o8(false, true, 0.0f);
                mk mkVar = unVar.Z;
                if (mkVar != null && mkVar.getEditField() != null) {
                    unVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                oj ojVar = (oj) this.f36879b;
                ojVar.f40271b = null;
                un unVar2 = ojVar.f40278x;
                unVar2.f42240e9 = null;
                unVar2.f42276h9 = null;
                unVar2.f42265g9 = null;
                unVar2.B0.R = true;
                if (unVar2.f42252f9) {
                    unVar2.o8(false, true, 0.0f);
                } else {
                    unVar2.f42252f9 = true;
                }
                mk mkVar2 = unVar2.Z;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    unVar2.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
