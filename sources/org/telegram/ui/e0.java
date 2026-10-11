package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f37163a;
    public final Object f37164b;

    public e0(Object obj, int i10) {
        this.f37163a = i10;
        this.f37164b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f37163a) {
            case 0:
                h4 h4Var = (h4) this.f37164b;
                View view = h4Var.f42100f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f42100f = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f37164b;
                znVar.Q8 = null;
                znVar.T8 = null;
                znVar.S8 = null;
                znVar.f45013z0.R = true;
                znVar.j8(false, true, 0.0f);
                ok okVar = znVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                pj pjVar = (pj) this.f37164b;
                pjVar.f40883b = null;
                zn znVar2 = pjVar.f40890w;
                znVar2.Q8 = null;
                znVar2.T8 = null;
                znVar2.S8 = null;
                znVar2.f45013z0.R = true;
                if (znVar2.R8) {
                    znVar2.j8(false, true, 0.0f);
                } else {
                    znVar2.R8 = true;
                }
                ok okVar2 = znVar2.Y;
                if (okVar2 != null && okVar2.getEditField() != null) {
                    znVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f37164b).H3(0.0f);
                return;
        }
    }
}
