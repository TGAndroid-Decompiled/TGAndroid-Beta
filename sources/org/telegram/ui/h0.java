package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class h0 implements PopupWindow.OnDismissListener {
    public final int f34533a;
    public final Object f34534b;

    public h0(Object obj, int i10) {
        this.f34533a = i10;
        this.f34534b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f34533a) {
            case 0:
                n4 n4Var = (n4) this.f34534b;
                View view = n4Var.f36983f;
                if (view != null) {
                    n4Var.d = null;
                    view.invalidate();
                    n4Var.f36983f = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f34534b;
                znVar.N8 = null;
                znVar.Q8 = null;
                znVar.P8 = null;
                znVar.f40786w0.R = true;
                znVar.g8(false, true, 0.0f);
                lk lkVar = znVar.V;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.V.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                mj mjVar = (mj) this.f34534b;
                mjVar.f36108b = null;
                zn znVar2 = mjVar.f36114w;
                znVar2.N8 = null;
                znVar2.Q8 = null;
                znVar2.P8 = null;
                znVar2.f40786w0.R = true;
                if (znVar2.O8) {
                    znVar2.g8(false, true, 0.0f);
                } else {
                    znVar2.O8 = true;
                }
                lk lkVar2 = znVar2.V;
                if (lkVar2 != null && lkVar2.getEditField() != null) {
                    znVar2.V.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f34534b).H3(0.0f);
                return;
        }
    }
}
