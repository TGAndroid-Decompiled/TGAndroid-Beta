package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f45084a;
    public final Object f45085b;

    public e0(Object obj, int i7) {
        this.f45084a = i7;
        this.f45085b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45084a) {
            case 0:
                g4 g4Var = (g4) this.f45085b;
                View view = g4Var.f49253f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f49253f = null;
                    return;
                }
                return;
            case 1:
                cn cnVar = (cn) this.f45085b;
                cnVar.f44483e9 = null;
                cnVar.f44548j9 = null;
                cnVar.f44535i9 = null;
                cnVar.B0.R = true;
                cnVar.w8(false, true, 0.0f);
                sj sjVar = cnVar.Z;
                if (sjVar != null && sjVar.getEditField() != null) {
                    cnVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                vi viVar = (vi) this.f45085b;
                viVar.f50739b = null;
                cn cnVar2 = viVar.f50747x;
                cnVar2.f44483e9 = null;
                cnVar2.f44548j9 = null;
                cnVar2.f44535i9 = null;
                cnVar2.B0.R = true;
                if (cnVar2.f44497f9) {
                    cnVar2.w8(false, true, 0.0f);
                } else {
                    cnVar2.f44497f9 = true;
                }
                sj sjVar2 = cnVar2.Z;
                if (sjVar2 != null && sjVar2.getEditField() != null) {
                    cnVar2.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
