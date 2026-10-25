package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f38957a;
    public final Object f38958b;

    public e0(Object obj, int i10) {
        this.f38957a = i10;
        this.f38958b = obj;
    }

    @Override
    public final void onDismiss() {
        int i10 = this.f38957a;
        Object obj = this.f38958b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                View view = j4Var.f39919f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f39919f = null;
                    return;
                }
                return;
            case 1:
                un unVar = (un) obj;
                unVar.f44213c9 = null;
                unVar.f44251f9 = null;
                unVar.f44239e9 = null;
                unVar.f44493z0.R = true;
                unVar.n8(false, true, 0.0f);
                hk hkVar = unVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    unVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                hj hjVar = (hj) obj;
                hjVar.f40016b = null;
                un unVar2 = hjVar.f40022w;
                unVar2.f44213c9 = null;
                unVar2.f44251f9 = null;
                unVar2.f44239e9 = null;
                unVar2.f44493z0.R = true;
                if (unVar2.f44226d9) {
                    unVar2.n8(false, true, 0.0f);
                } else {
                    unVar2.f44226d9 = true;
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
