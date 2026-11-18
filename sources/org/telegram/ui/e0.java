package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f47096a;
    public final Object f47097b;

    public e0(Object obj, int i7) {
        this.f47096a = i7;
        this.f47097b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f47096a) {
            case 0:
                g4 g4Var = (g4) this.f47097b;
                View view = g4Var.f50754f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50754f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f47097b;
                bnVar.f46023g9 = null;
                bnVar.f46088l9 = null;
                bnVar.f46076k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f45932a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45932a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f47097b;
                uiVar.f52572b = null;
                bn bnVar2 = uiVar.f52580x;
                bnVar2.f46023g9 = null;
                bnVar2.f46088l9 = null;
                bnVar2.f46076k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46036h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46036h9 = true;
                }
                rj rjVar2 = bnVar2.f45932a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f45932a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
