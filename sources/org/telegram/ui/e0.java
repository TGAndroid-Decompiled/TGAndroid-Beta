package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f35928a;
    public final Object f35929b;

    public e0(Object obj, int i10) {
        this.f35928a = i10;
        this.f35929b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f35928a) {
            case 0:
                i4 i4Var = (i4) this.f35929b;
                View view = i4Var.f41464f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f41464f = null;
                    return;
                }
                return;
            case 1:
                co coVar = (co) this.f35929b;
                coVar.Q8 = null;
                coVar.T8 = null;
                coVar.S8 = null;
                coVar.f35525z0.R = true;
                coVar.g8(false, true, 0.0f);
                mk mkVar = coVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    coVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                oj ojVar = (oj) this.f35929b;
                ojVar.f39287b = null;
                co coVar2 = ojVar.f39294w;
                coVar2.Q8 = null;
                coVar2.T8 = null;
                coVar2.S8 = null;
                coVar2.f35525z0.R = true;
                if (coVar2.R8) {
                    coVar2.g8(false, true, 0.0f);
                } else {
                    coVar2.R8 = true;
                }
                mk mkVar2 = coVar2.Y;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    coVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f35929b).H3(0.0f);
                return;
        }
    }
}
