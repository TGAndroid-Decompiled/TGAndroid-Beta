package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class g0 implements PopupWindow.OnDismissListener {
    public final int f37042a;
    public final Object f37043b;

    public g0(Object obj, int i10) {
        this.f37042a = i10;
        this.f37043b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f37042a) {
            case 0:
                l4 l4Var = (l4) this.f37043b;
                View view = l4Var.f39612f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f39612f = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.f37043b;
                xnVar.N8 = null;
                xnVar.Q8 = null;
                xnVar.P8 = null;
                xnVar.f43389w0.R = true;
                xnVar.g8(false, true, 0.0f);
                jk jkVar = xnVar.V;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.V.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                kj kjVar = (kj) this.f37043b;
                kjVar.f38424b = null;
                xn xnVar2 = kjVar.f38431w;
                xnVar2.N8 = null;
                xnVar2.Q8 = null;
                xnVar2.P8 = null;
                xnVar2.f43389w0.R = true;
                if (xnVar2.O8) {
                    xnVar2.g8(false, true, 0.0f);
                } else {
                    xnVar2.O8 = true;
                }
                jk jkVar2 = xnVar2.V;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    xnVar2.V.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f37043b).H3(0.0f);
                return;
        }
    }
}
