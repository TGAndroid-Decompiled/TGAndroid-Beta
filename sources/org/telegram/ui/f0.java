package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f36771a;
    public final Object f36772b;

    public f0(Object obj, int i10) {
        this.f36771a = i10;
        this.f36772b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36771a) {
            case 0:
                l4 l4Var = (l4) this.f36772b;
                View view = l4Var.f36108f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f36108f = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.f36772b;
                snVar.Q8 = null;
                snVar.T8 = null;
                snVar.S8 = null;
                snVar.f41479z0.R = true;
                snVar.j8(false, true, 0.0f);
                hk hkVar = snVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                ij ijVar = (ij) this.f36772b;
                ijVar.f37918b = null;
                sn snVar2 = ijVar.f37924w;
                snVar2.Q8 = null;
                snVar2.T8 = null;
                snVar2.S8 = null;
                snVar2.f41479z0.R = true;
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
                ((ProfileActivity) this.f36772b).H3(0.0f);
                return;
        }
    }
}
