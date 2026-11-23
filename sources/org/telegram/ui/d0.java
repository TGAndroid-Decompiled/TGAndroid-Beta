package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class d0 implements PopupWindow.OnDismissListener {
    public final int f46805a;
    public final Object f46806b;

    public d0(Object obj, int i7) {
        this.f46805a = i7;
        this.f46806b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f46805a) {
            case 0:
                g4 g4Var = (g4) this.f46806b;
                View view = g4Var.f50728f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50728f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f46806b;
                bnVar.f45994g9 = null;
                bnVar.f46059l9 = null;
                bnVar.f46047k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f45903a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45903a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f46806b;
                uiVar.f52563b = null;
                bn bnVar2 = uiVar.f52571x;
                bnVar2.f45994g9 = null;
                bnVar2.f46059l9 = null;
                bnVar2.f46047k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46007h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46007h9 = true;
                }
                rj rjVar2 = bnVar2.f45903a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f45903a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
