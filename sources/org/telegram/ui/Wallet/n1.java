package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35253a;
    public final Object f35254b;

    public n1(Object obj, int i10) {
        this.f35253a = i10;
        this.f35254b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35253a) {
            case 0:
                ((k) this.f35254b).run();
                return;
            default:
                g9 g9Var = (g9) this.f35254b;
                PopupWindow popupWindow = g9Var.f34952s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    g9Var.c();
                    return;
                }
                return;
        }
    }
}
