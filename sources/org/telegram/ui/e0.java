package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f36768a;
    public final Object f36769b;

    public e0(Object obj, int i10) {
        this.f36768a = i10;
        this.f36769b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36768a) {
            case 0:
                k4 k4Var = (k4) this.f36769b;
                View view = k4Var.f37232f;
                if (view != null) {
                    k4Var.d = null;
                    view.invalidate();
                    k4Var.f37232f = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.f36769b;
                snVar.f41484c9 = null;
                snVar.f41521f9 = null;
                snVar.f41508e9 = null;
                snVar.f41762z0.R = true;
                snVar.j8(false, true, 0.0f);
                gk gkVar = snVar.Y;
                if (gkVar != null && gkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                gj gjVar = (gj) this.f36769b;
                gjVar.f37615b = null;
                sn snVar2 = gjVar.f37621w;
                snVar2.f41484c9 = null;
                snVar2.f41521f9 = null;
                snVar2.f41508e9 = null;
                snVar2.f41762z0.R = true;
                if (snVar2.f41497d9) {
                    snVar2.j8(false, true, 0.0f);
                } else {
                    snVar2.f41497d9 = true;
                }
                gk gkVar2 = snVar2.Y;
                if (gkVar2 != null && gkVar2.getEditField() != null) {
                    snVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f36769b).J3(0.0f);
                return;
        }
    }
}
