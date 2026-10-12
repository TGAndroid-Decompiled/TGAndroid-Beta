package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f37582a;
    public final Object f37583b;

    public f0(Object obj, int i10) {
        this.f37582a = i10;
        this.f37583b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f37582a) {
            case 0:
                i4 i4Var = (i4) this.f37583b;
                View view = i4Var.f43070f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f43070f = null;
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.f37583b;
                eoVar.Q8 = null;
                eoVar.T8 = null;
                eoVar.S8 = null;
                eoVar.f37502z0.R = true;
                eoVar.j8(false, true, 0.0f);
                sk skVar = eoVar.Y;
                if (skVar != null && skVar.getEditField() != null) {
                    eoVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                tj tjVar = (tj) this.f37583b;
                tjVar.f42205b = null;
                eo eoVar2 = tjVar.f42212w;
                eoVar2.Q8 = null;
                eoVar2.T8 = null;
                eoVar2.S8 = null;
                eoVar2.f37502z0.R = true;
                if (eoVar2.R8) {
                    eoVar2.j8(false, true, 0.0f);
                } else {
                    eoVar2.R8 = true;
                }
                sk skVar2 = eoVar2.Y;
                if (skVar2 != null && skVar2.getEditField() != null) {
                    eoVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f37583b).H3(0.0f);
                return;
        }
    }
}
