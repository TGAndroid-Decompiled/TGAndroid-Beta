package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f36149a;
    public final Object f36150b;

    public f0(Object obj, int i10) {
        this.f36149a = i10;
        this.f36150b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f36149a) {
            case 0:
                i4 i4Var = (i4) this.f36150b;
                View view = i4Var.f40731f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f40731f = null;
                    return;
                }
                return;
            case 1:
                yn ynVar = (yn) this.f36150b;
                ynVar.O8 = null;
                ynVar.R8 = null;
                ynVar.Q8 = null;
                ynVar.f43552x0.R = true;
                ynVar.g8(false, true, 0.0f);
                jk jkVar = ynVar.W;
                if (jkVar != null && jkVar.getEditField() != null) {
                    ynVar.W.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                mj mjVar = (mj) this.f36150b;
                mjVar.f38644b = null;
                yn ynVar2 = mjVar.f38651w;
                ynVar2.O8 = null;
                ynVar2.R8 = null;
                ynVar2.Q8 = null;
                ynVar2.f43552x0.R = true;
                if (ynVar2.P8) {
                    ynVar2.g8(false, true, 0.0f);
                } else {
                    ynVar2.P8 = true;
                }
                jk jkVar2 = ynVar2.W;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    ynVar2.W.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                ((ProfileActivity) this.f36150b).H3(0.0f);
                return;
        }
    }
}
