package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
public final class f0 implements PopupWindow.OnDismissListener {
    public final int f45116a;
    public final Object f45117b;

    public f0(Object obj, int i3) {
        this.f45116a = i3;
        this.f45117b = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.f45116a) {
            case 0:
                i4 i4Var = (i4) this.f45117b;
                View view = i4Var.f46114f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f46114f = null;
                    return;
                }
                return;
            case 1:
                wm wmVar = (wm) this.f45117b;
                wmVar.f51316f9 = null;
                wmVar.f51354i9 = null;
                wmVar.f51342h9 = null;
                wmVar.C0.R = true;
                wmVar.v8(false, true, 0.0f);
                mj mjVar = wmVar.f51237a0;
                if (mjVar != null && mjVar.getEditField() != null) {
                    wmVar.f51237a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
            default:
                pi piVar = (pi) this.f45117b;
                piVar.f48590b = null;
                wm wmVar2 = piVar.f48598x;
                wmVar2.f51316f9 = null;
                wmVar2.f51354i9 = null;
                wmVar2.f51342h9 = null;
                wmVar2.C0.R = true;
                if (wmVar2.f51329g9) {
                    wmVar2.v8(false, true, 0.0f);
                } else {
                    wmVar2.f51329g9 = true;
                }
                mj mjVar2 = wmVar2.f51237a0;
                if (mjVar2 != null && mjVar2.getEditField() != null) {
                    wmVar2.f51237a0.getEditField().setAllowDrawCursor(true);
                    return;
                }
                return;
        }
    }
}
