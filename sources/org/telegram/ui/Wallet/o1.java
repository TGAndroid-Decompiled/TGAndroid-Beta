package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35361a;
    public final Object f35362b;

    public o1(Object obj, int i10) {
        this.f35361a = i10;
        this.f35362b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35361a) {
            case 0:
                ((l) this.f35362b).run();
                return;
            default:
                i9 i9Var = (i9) this.f35362b;
                PopupWindow popupWindow = i9Var.f35103s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    i9Var.c();
                    return;
                }
                return;
        }
    }
}
