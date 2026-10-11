package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35425a;
    public final Object f35426b;

    public p1(Object obj, int i10) {
        this.f35425a = i10;
        this.f35426b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35425a) {
            case 0:
                ((m) this.f35426b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35426b;
                PopupWindow popupWindow = j9Var.f35167s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
