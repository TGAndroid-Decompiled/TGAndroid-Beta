package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class t1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f45143a;
    public final Object f45144b;

    public t1(Object obj, int i7) {
        this.f45143a = i7;
        this.f45144b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f45143a) {
            case 0:
                ((p) this.f45144b).run();
                return;
            case 1:
                s8 s8Var = (s8) this.f45144b;
                if (s8Var.f45077i1) {
                    s8Var.f0();
                    return;
                }
                return;
            default:
                eb ebVar = (eb) this.f45144b;
                PopupWindow popupWindow = ebVar.f44263s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    ebVar.c();
                    return;
                }
                return;
        }
    }
}
