package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f38960a;
    public final Object f38961b;

    public e0(Object obj, int i10) {
        this.f38960a = i10;
        this.f38961b = obj;
    }

    @Override
    public final void onDismiss() {
        int i10 = this.f38960a;
        Object obj = this.f38961b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                View view = j4Var.f39922f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f39922f = null;
                    return;
                }
                return;
            case 1:
                un unVar = (un) obj;
                unVar.f44216c9 = null;
                unVar.f44254f9 = null;
                unVar.f44242e9 = null;
                unVar.f44496z0.R = true;
                unVar.n8(false, true, 0.0f);
                hk hkVar = unVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    unVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                hj hjVar = (hj) obj;
                hjVar.f40019b = null;
                un unVar2 = hjVar.f40025w;
                unVar2.f44216c9 = null;
                unVar2.f44254f9 = null;
                unVar2.f44242e9 = null;
                unVar2.f44496z0.R = true;
                if (unVar2.f44229d9) {
                    unVar2.n8(false, true, 0.0f);
                } else {
                    unVar2.f44229d9 = true;
                }
                hk hkVar2 = unVar2.Y;
                if (hkVar2 != null && hkVar2.getEditField() != null) {
                    unVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) obj).Q3(0.0f);
                return;
        }
    }
}
