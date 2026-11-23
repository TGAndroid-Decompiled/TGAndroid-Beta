package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class u1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f45224a;
    public final Object f45225b;

    public u1(Object obj, int i7) {
        this.f45224a = i7;
        this.f45225b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f45224a) {
            case 0:
                ((p) this.f45225b).run();
                return;
            default:
                eb ebVar = (eb) this.f45225b;
                PopupWindow popupWindow = ebVar.f44263s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    ebVar.c();
                    return;
                }
                return;
        }
    }
}
