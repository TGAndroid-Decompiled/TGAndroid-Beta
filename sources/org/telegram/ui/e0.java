package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f36756a;
    public final Object f36757b;

    public e0(Object obj, int i10) {
        this.f36756a = i10;
        this.f36757b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36756a) {
            case 0:
                k4 k4Var = (k4) this.f36757b;
                View view = k4Var.f37217f;
                if (view != null) {
                    k4Var.d = null;
                    view.invalidate();
                    k4Var.f37217f = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.f36757b;
                snVar.f41481c9 = null;
                snVar.f41518f9 = null;
                snVar.f41505e9 = null;
                snVar.f41759z0.R = true;
                snVar.j8(false, true, 0.0f);
                gk gkVar = snVar.Y;
                if (gkVar != null && gkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                gj gjVar = (gj) this.f36757b;
                gjVar.f37592b = null;
                sn snVar2 = gjVar.f37598w;
                snVar2.f41481c9 = null;
                snVar2.f41518f9 = null;
                snVar2.f41505e9 = null;
                snVar2.f41759z0.R = true;
                if (snVar2.f41494d9) {
                    snVar2.j8(false, true, 0.0f);
                } else {
                    snVar2.f41494d9 = true;
                }
                gk gkVar2 = snVar2.Y;
                if (gkVar2 != null && gkVar2.getEditField() != null) {
                    snVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f36757b).J3(0.0f);
                return;
        }
    }
}
