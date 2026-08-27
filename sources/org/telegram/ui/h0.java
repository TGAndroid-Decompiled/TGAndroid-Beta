package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

public final class h0 implements PopupWindow.OnDismissListener {

    public final int f38641a;

    public final Object f38642b;

    public h0(Object obj, int i10) {
        this.f38641a = i10;
        this.f38642b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f38641a) {
            case 0:
                m4 m4Var = (m4) this.f38642b;
                View view = m4Var.f37288f;
                if (view != null) {
                    m4Var.d = null;
                    view.invalidate();
                    m4Var.f37288f = null;
                }
                break;
            case 1:
                rn rnVar = (rn) this.f38642b;
                rnVar.M8 = null;
                rnVar.P8 = null;
                rnVar.O8 = null;
                rnVar.f42239v0.R = true;
                rnVar.g8(false, true, 0.0f);
                ck ckVar = rnVar.U;
                if (ckVar != null && ckVar.getEditField() != null) {
                    rnVar.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                ej ejVar = (ej) this.f38642b;
                ejVar.f37775b = null;
                rn rnVar2 = ejVar.f37782w;
                rnVar2.M8 = null;
                rnVar2.P8 = null;
                rnVar2.O8 = null;
                rnVar2.f42239v0.R = true;
                if (rnVar2.N8) {
                    rnVar2.g8(false, true, 0.0f);
                } else {
                    rnVar2.N8 = true;
                }
                ck ckVar2 = rnVar2.U;
                if (ckVar2 != null && ckVar2.getEditField() != null) {
                    rnVar2.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.f38642b).H3(0.0f);
                break;
        }
    }
}
