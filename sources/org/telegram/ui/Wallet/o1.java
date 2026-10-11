package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35349a;
    public final Object f35350b;

    public o1(Object obj, int i10) {
        this.f35349a = i10;
        this.f35350b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35349a) {
            case 0:
                ((m) this.f35350b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35350b;
                PopupWindow popupWindow = j9Var.f35133s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
