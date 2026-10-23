package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34636a;
    public final Object f34637b;

    public o1(Object obj, int i10) {
        this.f34636a = i10;
        this.f34637b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34636a) {
            case 0:
                ((h) this.f34637b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34637b;
                if (t7Var.f34935h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f34637b;
                PopupWindow popupWindow = haVar.f34313s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
