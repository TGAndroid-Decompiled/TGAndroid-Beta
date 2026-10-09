package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35273a;
    public final Object f35274b;

    public n1(Object obj, int i10) {
        this.f35273a = i10;
        this.f35274b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35273a) {
            case 0:
                ((k) this.f35274b).run();
                return;
            default:
                h9 h9Var = (h9) this.f35274b;
                PopupWindow popupWindow = h9Var.f35012s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
