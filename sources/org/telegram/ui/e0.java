package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f47019a;
    public final Object f47020b;

    public e0(Object obj, int i7) {
        this.f47019a = i7;
        this.f47020b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f47019a) {
            case 0:
                g4 g4Var = (g4) this.f47020b;
                View view = g4Var.f50710f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50710f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f47020b;
                bnVar.f46014g9 = null;
                bnVar.f46079l9 = null;
                bnVar.f46067k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f45923a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45923a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f47020b;
                uiVar.f52557b = null;
                bn bnVar2 = uiVar.f52565x;
                bnVar2.f46014g9 = null;
                bnVar2.f46079l9 = null;
                bnVar2.f46067k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46027h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46027h9 = true;
                }
                rj rjVar2 = bnVar2.f45923a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f45923a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
