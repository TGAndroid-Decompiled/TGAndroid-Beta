package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f37009a;
    public final Object f37010b;

    public n1(Object obj, int i10) {
        this.f37009a = i10;
        this.f37010b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f37009a) {
            case 0:
                ((h) this.f37010b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f37010b;
                if (t7Var.f37318h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f37010b;
                PopupWindow popupWindow = haVar.f36682s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
