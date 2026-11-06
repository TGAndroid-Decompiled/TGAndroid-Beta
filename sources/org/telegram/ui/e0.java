package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f45139a;
    public final Object f45140b;

    public e0(Object obj, int i7) {
        this.f45139a = i7;
        this.f45140b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45139a) {
            case 0:
                g4 g4Var = (g4) this.f45140b;
                View view = g4Var.f48242f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f48242f = null;
                    return;
                }
                return;
            case 1:
                an anVar = (an) this.f45140b;
                anVar.f43757e9 = null;
                anVar.f43796h9 = null;
                anVar.f43783g9 = null;
                anVar.B0.R = true;
                anVar.v8(false, true, 0.0f);
                qj qjVar = anVar.Z;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f45140b;
                tiVar.f50047b = null;
                an anVar2 = tiVar.f50055x;
                anVar2.f43757e9 = null;
                anVar2.f43796h9 = null;
                anVar2.f43783g9 = null;
                anVar2.B0.R = true;
                if (anVar2.f43771f9) {
                    anVar2.v8(false, true, 0.0f);
                } else {
                    anVar2.f43771f9 = true;
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
