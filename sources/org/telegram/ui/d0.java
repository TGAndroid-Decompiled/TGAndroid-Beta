package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class d0 implements PopupWindow.OnDismissListener {
    public final int f46920a;
    public final Object f46921b;

    public d0(Object obj, int i7) {
        this.f46920a = i7;
        this.f46921b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f46920a) {
            case 0:
                g4 g4Var = (g4) this.f46921b;
                View view = g4Var.f50842f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f50842f = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f46921b;
                bnVar.f46209g9 = null;
                bnVar.f46274l9 = null;
                bnVar.f46262k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.f46118a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f46118a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ui uiVar = (ui) this.f46921b;
                uiVar.f52668b = null;
                bn bnVar2 = uiVar.f52676x;
                bnVar2.f46209g9 = null;
                bnVar2.f46274l9 = null;
                bnVar2.f46262k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.f46222h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.f46222h9 = true;
                }
                rj rjVar2 = bnVar2.f46118a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.f46118a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
