package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f33247a;
    public final Object f33248b;

    public e0(Object obj, int i10) {
        this.f33247a = i10;
        this.f33248b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33247a) {
            case 0:
                h4 h4Var = (h4) this.f33248b;
                View view = h4Var.f38588f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f38588f = null;
                    return;
                }
                return;
            case 1:
                bo boVar = (bo) this.f33248b;
                boVar.Q8 = null;
                boVar.T8 = null;
                boVar.S8 = null;
                boVar.f32531z0.R = true;
                boVar.g8(false, true, 0.0f);
                nk nkVar = boVar.Y;
                if (nkVar != null && nkVar.getEditField() != null) {
                    boVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                pj pjVar = (pj) this.f33248b;
                pjVar.f36646b = null;
                bo boVar2 = pjVar.f36652w;
                boVar2.Q8 = null;
                boVar2.T8 = null;
                boVar2.S8 = null;
                boVar2.f32531z0.R = true;
                if (boVar2.R8) {
                    boVar2.g8(false, true, 0.0f);
                } else {
                    boVar2.R8 = true;
                }
                nk nkVar2 = boVar2.Y;
                if (nkVar2 != null && nkVar2.getEditField() != null) {
                    boVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33248b).H3(0.0f);
                return;
        }
    }
}
