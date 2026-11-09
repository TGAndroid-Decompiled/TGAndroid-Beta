package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f45137a;
    public final Object f45138b;

    public e0(Object obj, int i7) {
        this.f45137a = i7;
        this.f45138b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45137a) {
            case 0:
                g4 g4Var = (g4) this.f45138b;
                View view = g4Var.f48921f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f48921f = null;
                    return;
                }
                return;
            case 1:
                cn cnVar = (cn) this.f45138b;
                cnVar.f44442e9 = null;
                cnVar.f44507j9 = null;
                cnVar.f44494i9 = null;
                cnVar.B0.R = true;
                cnVar.w8(false, true, 0.0f);
                sj sjVar = cnVar.Z;
                if (sjVar != null && sjVar.getEditField() != null) {
                    cnVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                vi viVar = (vi) this.f45138b;
                viVar.f50699b = null;
                cn cnVar2 = viVar.f50707x;
                cnVar2.f44442e9 = null;
                cnVar2.f44507j9 = null;
                cnVar2.f44494i9 = null;
                cnVar2.B0.R = true;
                if (cnVar2.f44456f9) {
                    cnVar2.w8(false, true, 0.0f);
                } else {
                    cnVar2.f44456f9 = true;
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
