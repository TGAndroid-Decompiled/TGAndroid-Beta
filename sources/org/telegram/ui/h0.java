package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class h0 implements PopupWindow.OnDismissListener {
    public final int f38707a;
    public final Object f38708b;

    public h0(Object obj, int i10) {
        this.f38707a = i10;
        this.f38708b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f38707a) {
            case 0:
                m4 m4Var = (m4) this.f38708b;
                View view = m4Var.f37383f;
                if (view != null) {
                    m4Var.d = null;
                    view.invalidate();
                    m4Var.f37383f = null;
                    return;
                }
                return;
            case 1:
                tn tnVar = (tn) this.f38708b;
                tnVar.M8 = null;
                tnVar.P8 = null;
                tnVar.O8 = null;
                tnVar.f42999v0.R = true;
                tnVar.g8(false, true, 0.0f);
                dk dkVar = tnVar.U;
                if (dkVar != null && dkVar.getEditField() != null) {
                    tnVar.U.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                fj fjVar = (fj) this.f38708b;
                fjVar.f38193b = null;
                tn tnVar2 = fjVar.f38200w;
                tnVar2.M8 = null;
                tnVar2.P8 = null;
                tnVar2.O8 = null;
                tnVar2.f42999v0.R = true;
                if (tnVar2.N8) {
                    tnVar2.g8(false, true, 0.0f);
                } else {
                    tnVar2.N8 = true;
                }
                dk dkVar2 = tnVar2.U;
                if (dkVar2 != null && dkVar2.getEditField() != null) {
                    tnVar2.U.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f38708b).H3(0.0f);
                return;
        }
    }
}
