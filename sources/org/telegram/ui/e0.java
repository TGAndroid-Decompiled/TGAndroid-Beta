package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class e0 implements PopupWindow.OnDismissListener {
    public final int f38719a;
    public final Object f38720b;

    public e0(Object obj, int i10) {
        this.f38719a = i10;
        this.f38720b = obj;
    }

    @Override
    public final void onDismiss() {
        int i10 = this.f38719a;
        Object obj = this.f38720b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                View view = j4Var.f40451f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f40451f = null;
                    return;
                }
                return;
            case 1:
                wn wnVar = (wn) obj;
                wnVar.f45134g9 = null;
                wnVar.f45171j9 = null;
                wnVar.f45159i9 = null;
                wnVar.f45364z0.R = true;
                wnVar.p8(false, true, 0.0f);
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            case 2:
                kj kjVar = (kj) obj;
                kjVar.f40810b = null;
                wn wnVar2 = kjVar.f40816w;
                wnVar2.f45134g9 = null;
                wnVar2.f45171j9 = null;
                wnVar2.f45159i9 = null;
                wnVar2.f45364z0.R = true;
                if (wnVar2.f45146h9) {
                    wnVar2.p8(false, true, 0.0f);
                } else {
                    wnVar2.f45146h9 = true;
                }
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    wnVar2.Y.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) obj).Q3(0.0f);
                return;
        }
    }
}
