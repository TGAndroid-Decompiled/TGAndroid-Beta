package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f33494a;
    public final Object f33495b;

    public f0(Object obj, int i10) {
        this.f33494a = i10;
        this.f33495b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f33494a) {
            case 0:
                i4 i4Var = (i4) this.f33495b;
                View view = i4Var.f36423f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f36423f = null;
                    return;
                }
                return;
            case 1:
                wn wnVar = (wn) this.f33495b;
                wnVar.Q8 = null;
                wnVar.T8 = null;
                wnVar.S8 = null;
                wnVar.f39721z0.R = true;
                wnVar.g8(false, true, 0.0f);
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                lj ljVar = (lj) this.f33495b;
                ljVar.f35373b = null;
                wn wnVar2 = ljVar.f35379w;
                wnVar2.Q8 = null;
                wnVar2.T8 = null;
                wnVar2.S8 = null;
                wnVar2.f39721z0.R = true;
                if (wnVar2.R8) {
                    wnVar2.g8(false, true, 0.0f);
                } else {
                    wnVar2.R8 = true;
                }
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    wnVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f33495b).H3(0.0f);
                return;
        }
    }
}
