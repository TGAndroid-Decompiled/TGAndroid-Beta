package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class d0 implements PopupWindow.OnDismissListener {
    public final int f46844a;
    public final Object f46845b;

    public d0(Object obj, int i7) {
        this.f46844a = i7;
        this.f46845b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f46844a) {
            case 0:
                g4 g4Var = (g4) this.f46845b;
                View view = g4Var.f50755f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50755f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f46845b;
                bnVar.f46041g9 = null;
                bnVar.f46106l9 = null;
                bnVar.f46094k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f45950a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45950a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f46845b;
                uiVar.f52578b = null;
                bn bnVar2 = uiVar.f52586x;
                bnVar2.f46041g9 = null;
                bnVar2.f46106l9 = null;
                bnVar2.f46094k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46054h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46054h9 = true;
                }
                rj rjVar2 = bnVar2.f45950a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f45950a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
