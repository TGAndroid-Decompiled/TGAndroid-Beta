package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class d0 implements PopupWindow.OnDismissListener {
    public final int f46278a;
    public final Object f46279b;

    public d0(Object obj, int i7) {
        this.f46278a = i7;
        this.f46279b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f46278a) {
            case 0:
                g4 g4Var = (g4) this.f46279b;
                View view = g4Var.f49452f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f49452f = null;
                    return;
                }
                return;
            case 1:
                an anVar = (an) this.f46279b;
                anVar.f45197f9 = null;
                anVar.f45262k9 = null;
                anVar.f45248j9 = null;
                anVar.C0.R = true;
                anVar.x8(false, true, 0.0f);
                qj qjVar = anVar.f45118a0;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.f45118a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ti tiVar = (ti) this.f46279b;
                tiVar.f51592b = null;
                an anVar2 = tiVar.f51600x;
                anVar2.f45197f9 = null;
                anVar2.f45262k9 = null;
                anVar2.f45248j9 = null;
                anVar2.C0.R = true;
                if (anVar2.f45209g9) {
                    anVar2.x8(false, true, 0.0f);
                } else {
                    anVar2.f45209g9 = true;
                }
                qj qjVar2 = anVar2.f45118a0;
                if (qjVar2 != null && qjVar2.getEditField() != null) {
                    anVar2.f45118a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
