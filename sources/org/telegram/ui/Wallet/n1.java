package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f33491a;
    public final Object f33492b;

    public n1(Object obj, int i10) {
        this.f33491a = i10;
        this.f33492b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f33491a) {
            case 0:
                ((k) this.f33492b).run();
                return;
            default:
                h9 h9Var = (h9) this.f33492b;
                PopupWindow popupWindow = h9Var.f33266s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
