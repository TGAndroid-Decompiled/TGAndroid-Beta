package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35210a;
    public final Object f35211b;

    public m1(Object obj, int i10) {
        this.f35210a = i10;
        this.f35211b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35210a) {
            case 0:
                ((k) this.f35211b).run();
                return;
            default:
                g9 g9Var = (g9) this.f35211b;
                PopupWindow popupWindow = g9Var.f34952s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    g9Var.c();
                    return;
                }
                return;
        }
    }
}
