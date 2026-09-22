package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f33138a;
    public final Object f33139b;

    public e0(Object obj, int i10) {
        this.f33138a = i10;
        this.f33139b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33138a) {
            case 0:
                h4 h4Var = (h4) this.f33139b;
                View view = h4Var.f37828f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f37828f = null;
                    return;
                }
                return;
            case 1:
                bo boVar = (bo) this.f33139b;
                boVar.Q8 = null;
                boVar.T8 = null;
                boVar.S8 = null;
                boVar.f32544z0.R = true;
                boVar.g8(false, true, 0.0f);
                mk mkVar = boVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    boVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                oj ojVar = (oj) this.f33139b;
                ojVar.f36237b = null;
                bo boVar2 = ojVar.f36243w;
                boVar2.Q8 = null;
                boVar2.T8 = null;
                boVar2.S8 = null;
                boVar2.f32544z0.R = true;
                if (boVar2.R8) {
                    boVar2.g8(false, true, 0.0f);
                } else {
                    boVar2.R8 = true;
                }
                mk mkVar2 = boVar2.Y;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    boVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33139b).H3(0.0f);
                return;
        }
    }
}
