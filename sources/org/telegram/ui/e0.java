package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f36704a;
    public final Object f36705b;

    public e0(Object obj, int i10) {
        this.f36704a = i10;
        this.f36705b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36704a) {
            case 0:
                h4 h4Var = (h4) this.f36705b;
                View view = h4Var.f39098f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f39098f = null;
                    return;
                }
                return;
            case 1:
                un unVar = (un) this.f36705b;
                unVar.f42051e9 = null;
                unVar.f42087h9 = null;
                unVar.f42076g9 = null;
                unVar.B0.R = true;
                unVar.s8(false, true, 0.0f);
                mk mkVar = unVar.Z;
                if (mkVar != null && mkVar.getEditField() != null) {
                    unVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                oj ojVar = (oj) this.f36705b;
                ojVar.f40172b = null;
                un unVar2 = ojVar.f40179x;
                unVar2.f42051e9 = null;
                unVar2.f42087h9 = null;
                unVar2.f42076g9 = null;
                unVar2.B0.R = true;
                if (unVar2.f42063f9) {
                    unVar2.s8(false, true, 0.0f);
                } else {
                    unVar2.f42063f9 = true;
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
