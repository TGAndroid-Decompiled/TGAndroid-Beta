package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f32657a;
    public final Object f32658b;

    public f0(Object obj, int i10) {
        this.f32657a = i10;
        this.f32658b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f32657a) {
            case 0:
                j4 j4Var = (j4) this.f32658b;
                View view = j4Var.f36857f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f36857f = null;
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.f32658b;
                eoVar.Q8 = null;
                eoVar.T8 = null;
                eoVar.S8 = null;
                eoVar.f32567z0.R = true;
                eoVar.g8(false, true, 0.0f);
                ok okVar = eoVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    eoVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                qj qjVar = (qj) this.f32658b;
                qjVar.f36074b = null;
                eo eoVar2 = qjVar.f36080w;
                eoVar2.Q8 = null;
                eoVar2.T8 = null;
                eoVar2.S8 = null;
                eoVar2.f32567z0.R = true;
                if (eoVar2.R8) {
                    eoVar2.g8(false, true, 0.0f);
                } else {
                    eoVar2.R8 = true;
                }
                ok okVar2 = eoVar2.Y;
                if (okVar2 != null && okVar2.getEditField() != null) {
                    eoVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f32658b).H3(0.0f);
                return;
        }
    }
}
