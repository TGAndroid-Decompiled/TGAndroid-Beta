package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f47085a;
    public final Object f47086b;

    public e0(Object obj, int i7) {
        this.f47085a = i7;
        this.f47086b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f47085a) {
            case 0:
                g4 g4Var = (g4) this.f47086b;
                View view = g4Var.f50751f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50751f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f47086b;
                bnVar.f46037g9 = null;
                bnVar.f46102l9 = null;
                bnVar.f46090k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f45946a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45946a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f47086b;
                uiVar.f52574b = null;
                bn bnVar2 = uiVar.f52582x;
                bnVar2.f46037g9 = null;
                bnVar2.f46102l9 = null;
                bnVar2.f46090k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46050h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46050h9 = true;
                }
                rj rjVar2 = bnVar2.f45946a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f45946a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
