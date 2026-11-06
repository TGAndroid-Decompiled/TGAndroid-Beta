package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f45168a;
    public final Object f45169b;

    public e0(Object obj, int i7) {
        this.f45168a = i7;
        this.f45169b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45168a) {
            case 0:
                g4 g4Var = (g4) this.f45169b;
                View view = g4Var.f48270f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f48270f = null;
                    return;
                }
                return;
            case 1:
                an anVar = (an) this.f45169b;
                anVar.f43781e9 = null;
                anVar.f43820h9 = null;
                anVar.f43807g9 = null;
                anVar.B0.R = true;
                anVar.v8(false, true, 0.0f);
                qj qjVar = anVar.Z;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.Z.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f45169b;
                tiVar.f50074b = null;
                an anVar2 = tiVar.f50082x;
                anVar2.f43781e9 = null;
                anVar2.f43820h9 = null;
                anVar2.f43807g9 = null;
                anVar2.B0.R = true;
                if (anVar2.f43795f9) {
                    anVar2.v8(false, true, 0.0f);
                } else {
                    anVar2.f43795f9 = true;
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
