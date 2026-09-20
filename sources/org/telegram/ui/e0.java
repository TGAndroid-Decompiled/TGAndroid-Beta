package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f33189a;
    public final Object f33190b;

    public e0(Object obj, int i10) {
        this.f33189a = i10;
        this.f33190b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33189a) {
            case 0:
                h4 h4Var = (h4) this.f33190b;
                View view = h4Var.f37982f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f37982f = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f33190b;
                znVar.Q8 = null;
                znVar.T8 = null;
                znVar.S8 = null;
                znVar.f40555z0.R = true;
                znVar.g8(false, true, 0.0f);
                lk lkVar = znVar.Y;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                nj njVar = (nj) this.f33190b;
                njVar.f36037b = null;
                zn znVar2 = njVar.f36043w;
                znVar2.Q8 = null;
                znVar2.T8 = null;
                znVar2.S8 = null;
                znVar2.f40555z0.R = true;
                if (znVar2.R8) {
                    znVar2.g8(false, true, 0.0f);
                } else {
                    znVar2.R8 = true;
                }
                lk lkVar2 = znVar2.Y;
                if (lkVar2 != null && lkVar2.getEditField() != null) {
                    znVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33190b).H3(0.0f);
                return;
        }
    }
}
