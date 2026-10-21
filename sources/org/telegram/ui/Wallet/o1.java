package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34632a;
    public final Object f34633b;

    public o1(Object obj, int i10) {
        this.f34632a = i10;
        this.f34633b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34632a) {
            case 0:
                ((h) this.f34633b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34633b;
                if (t7Var.f34931h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f34633b;
                PopupWindow popupWindow = haVar.f34309s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
