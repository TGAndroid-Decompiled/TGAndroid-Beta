package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f33209a;
    public final Object f33210b;

    public e0(Object obj, int i10) {
        this.f33209a = i10;
        this.f33210b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33209a) {
            case 0:
                h4 h4Var = (h4) this.f33210b;
                View view = h4Var.f37983f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f37983f = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f33210b;
                znVar.Q8 = null;
                znVar.T8 = null;
                znVar.S8 = null;
                znVar.f40576z0.R = true;
                znVar.g8(false, true, 0.0f);
                mk mkVar = znVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                oj ojVar = (oj) this.f33210b;
                ojVar.f36343b = null;
                zn znVar2 = ojVar.f36349w;
                znVar2.Q8 = null;
                znVar2.T8 = null;
                znVar2.S8 = null;
                znVar2.f40576z0.R = true;
                if (znVar2.R8) {
                    znVar2.g8(false, true, 0.0f);
                } else {
                    znVar2.R8 = true;
                }
                mk mkVar2 = znVar2.Y;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    znVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33210b).H3(0.0f);
                return;
        }
    }
}
