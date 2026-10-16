package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f35410a;
    public final Object f35411b;

    public f0(Object obj, int i10) {
        this.f35410a = i10;
        this.f35411b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f35410a) {
            case 0:
                k4 k4Var = (k4) this.f35411b;
                View view = k4Var.f42177f;
                if (view != null) {
                    k4Var.d = null;
                    view.invalidate();
                    k4Var.f42177f = null;
                    return;
                }
                return;
            case 1:
                fo foVar = (fo) this.f35411b;
                foVar.Q8 = null;
                foVar.T8 = null;
                foVar.S8 = null;
                foVar.f35886z0.R = true;
                foVar.j8(false, true, 0.0f);
                sk skVar = foVar.Y;
                if (skVar != null && skVar.getEditField() != null) {
                    foVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                tj tjVar = (tj) this.f35411b;
                tjVar.f40125b = null;
                fo foVar2 = tjVar.f40131w;
                foVar2.Q8 = null;
                foVar2.T8 = null;
                foVar2.S8 = null;
                foVar2.f35886z0.R = true;
                if (foVar2.R8) {
                    foVar2.j8(false, true, 0.0f);
                } else {
                    foVar2.R8 = true;
                }
                sk skVar2 = foVar2.Y;
                if (skVar2 != null && skVar2.getEditField() != null) {
                    foVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f35411b).H3(0.0f);
                return;
        }
    }
}
