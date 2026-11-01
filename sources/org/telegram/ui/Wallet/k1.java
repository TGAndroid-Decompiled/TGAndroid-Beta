package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34803a;
    public final Object f34804b;

    public k1(Object obj, int i10) {
        this.f34803a = i10;
        this.f34804b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34803a) {
            case 0:
                ((g) this.f34804b).run();
                return;
            case 1:
                h8 h8Var = (h8) this.f34804b;
                if (h8Var.f34652h1) {
                    h8Var.f0();
                    return;
                }
                return;
            default:
                ra raVar = (ra) this.f34804b;
                PopupWindow popupWindow = raVar.f35165s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    raVar.c();
                    return;
                }
                return;
        }
    }
}
