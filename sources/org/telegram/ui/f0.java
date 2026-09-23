package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f33050a;
    public final Object f33051b;

    public f0(Object obj, int i10) {
        this.f33050a = i10;
        this.f33051b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33050a) {
            case 0:
                i4 i4Var = (i4) this.f33051b;
                View view = i4Var.f36712f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f36712f = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.f33051b;
                xnVar.Q8 = null;
                xnVar.T8 = null;
                xnVar.S8 = null;
                xnVar.f39621z0.R = true;
                xnVar.g8(false, true, 0.0f);
                jk jkVar = xnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                lj ljVar = (lj) this.f33051b;
                ljVar.f34993b = null;
                xn xnVar2 = ljVar.f34999w;
                xnVar2.Q8 = null;
                xnVar2.T8 = null;
                xnVar2.S8 = null;
                xnVar2.f39621z0.R = true;
                if (xnVar2.R8) {
                    xnVar2.g8(false, true, 0.0f);
                } else {
                    xnVar2.R8 = true;
                }
                jk jkVar2 = xnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    xnVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33051b).H3(0.0f);
                return;
        }
    }
}
