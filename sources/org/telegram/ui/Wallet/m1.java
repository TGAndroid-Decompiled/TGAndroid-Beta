package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35226a;
    public final Object f35227b;

    public m1(Object obj, int i10) {
        this.f35226a = i10;
        this.f35227b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35226a) {
            case 0:
                ((k) this.f35227b).run();
                return;
            default:
                h9 h9Var = (h9) this.f35227b;
                PopupWindow popupWindow = h9Var.f35012s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
