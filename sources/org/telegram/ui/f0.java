package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f36848a;
    public final Object f36849b;

    public f0(Object obj, int i10) {
        this.f36848a = i10;
        this.f36849b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36848a) {
            case 0:
                l4 l4Var = (l4) this.f36849b;
                View view = l4Var.f35528f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f35528f = null;
                    return;
                }
                return;
            case 1:
                qn qnVar = (qn) this.f36849b;
                qnVar.Q8 = null;
                qnVar.T8 = null;
                qnVar.S8 = null;
                qnVar.f40929z0.R = true;
                qnVar.j8(false, true, 0.0f);
                fk fkVar = qnVar.Y;
                if (fkVar != null && fkVar.getEditField() != null) {
                    qnVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                gj gjVar = (gj) this.f36849b;
                gjVar.f37342b = null;
                qn qnVar2 = gjVar.f37348w;
                qnVar2.Q8 = null;
                qnVar2.T8 = null;
                qnVar2.S8 = null;
                qnVar2.f40929z0.R = true;
                if (qnVar2.R8) {
                    qnVar2.j8(false, true, 0.0f);
                } else {
                    qnVar2.R8 = true;
                }
                fk fkVar2 = qnVar2.Y;
                if (fkVar2 != null && fkVar2.getEditField() != null) {
                    qnVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f36849b).H3(0.0f);
                return;
        }
    }
}
