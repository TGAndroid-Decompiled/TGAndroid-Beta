package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class g0 implements PopupWindow.OnDismissListener {
    public final int f38389a;
    public final Object f38390b;

    public g0(Object obj, int i9) {
        this.f38389a = i9;
        this.f38390b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f38389a) {
            case 0:
                l4 l4Var = (l4) this.f38390b;
                View view = l4Var.f36377f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f36377f = null;
                    return;
                }
                return;
            case 1:
                qn qnVar = (qn) this.f38390b;
                qnVar.M8 = null;
                qnVar.P8 = null;
                qnVar.O8 = null;
                qnVar.f42103v0.R = true;
                qnVar.g8(false, true, 0.0f);
                ak akVar = qnVar.U;
                if (akVar != null && akVar.getEditField() != null) {
                    qnVar.U.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                cj cjVar = (cj) this.f38390b;
                cjVar.f37223b = null;
                qn qnVar2 = cjVar.f37230w;
                qnVar2.M8 = null;
                qnVar2.P8 = null;
                qnVar2.O8 = null;
                qnVar2.f42103v0.R = true;
                if (qnVar2.N8) {
                    qnVar2.g8(false, true, 0.0f);
                } else {
                    qnVar2.N8 = true;
                }
                ak akVar2 = qnVar2.U;
                if (akVar2 != null && akVar2.getEditField() != null) {
                    qnVar2.U.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f38390b).H3(0.0f);
                return;
        }
    }
}
