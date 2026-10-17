package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f36748a;
    public final Object f36749b;

    public f0(Object obj, int i10) {
        this.f36748a = i10;
        this.f36749b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36748a) {
            case 0:
                l4 l4Var = (l4) this.f36749b;
                View view = l4Var.f36087f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f36087f = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.f36749b;
                snVar.Q8 = null;
                snVar.T8 = null;
                snVar.S8 = null;
                snVar.f41458z0.R = true;
                snVar.j8(false, true, 0.0f);
                hk hkVar = snVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                ij ijVar = (ij) this.f36749b;
                ijVar.f37904b = null;
                sn snVar2 = ijVar.f37910w;
                snVar2.Q8 = null;
                snVar2.T8 = null;
                snVar2.S8 = null;
                snVar2.f41458z0.R = true;
                if (snVar2.R8) {
                    snVar2.j8(false, true, 0.0f);
                } else {
                    snVar2.R8 = true;
                }
                hk hkVar2 = snVar2.Y;
                if (hkVar2 != null && hkVar2.getEditField() != null) {
                    snVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f36749b).H3(0.0f);
                return;
        }
    }
}
