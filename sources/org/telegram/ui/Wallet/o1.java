package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34625a;
    public final Object f34626b;

    public o1(Object obj, int i10) {
        this.f34625a = i10;
        this.f34626b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34625a) {
            case 0:
                ((h) this.f34626b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34626b;
                if (t7Var.f34924h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f34626b;
                PopupWindow popupWindow = haVar.f34302s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
