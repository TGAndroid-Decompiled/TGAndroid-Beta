package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f36982a;
    public final Object f36983b;

    public n1(Object obj, int i10) {
        this.f36982a = i10;
        this.f36983b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f36982a) {
            case 0:
                ((h) this.f36983b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f36983b;
                if (t7Var.f37291h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f36983b;
                PopupWindow popupWindow = haVar.f36654s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
