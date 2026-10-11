package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35391a;
    public final Object f35392b;

    public p1(Object obj, int i10) {
        this.f35391a = i10;
        this.f35392b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35391a) {
            case 0:
                ((m) this.f35392b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35392b;
                PopupWindow popupWindow = j9Var.f35133s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
