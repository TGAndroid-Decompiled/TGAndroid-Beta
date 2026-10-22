package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34635a;
    public final Object f34636b;

    public o1(Object obj, int i10) {
        this.f34635a = i10;
        this.f34636b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34635a) {
            case 0:
                ((h) this.f34636b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34636b;
                if (t7Var.f34934h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f34636b;
                PopupWindow popupWindow = haVar.f34312s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
