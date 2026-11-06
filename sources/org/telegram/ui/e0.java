package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f45169a;
    public final Object f45170b;

    public e0(Object obj, int i7) {
        this.f45169a = i7;
        this.f45170b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45169a) {
            case 0:
                g4 g4Var = (g4) this.f45170b;
                View view = g4Var.f48271f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f48271f = null;
                    return;
                }
                return;
            case 1:
                an anVar = (an) this.f45170b;
                anVar.f43782e9 = null;
                anVar.f43821h9 = null;
                anVar.f43808g9 = null;
                anVar.B0.R = true;
                anVar.v8(false, true, 0.0f);
                qj qjVar = anVar.Z;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f45170b;
                tiVar.f50075b = null;
                an anVar2 = tiVar.f50083x;
                anVar2.f43782e9 = null;
                anVar2.f43821h9 = null;
                anVar2.f43808g9 = null;
                anVar2.B0.R = true;
                if (anVar2.f43796f9) {
                    anVar2.v8(false, true, 0.0f);
                } else {
                    anVar2.f43796f9 = true;
                }
                qj qjVar2 = anVar2.Z;
                if (qjVar2 != null && qjVar2.getEditField() != null) {
                    anVar2.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
