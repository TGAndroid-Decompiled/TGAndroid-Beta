package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35197a;
    public final Object f35198b;

    public p1(Object obj, int i10) {
        this.f35197a = i10;
        this.f35198b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f35197a) {
            case 0:
                ((l) this.f35198b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35198b;
                PopupWindow popupWindow = j9Var.f34944s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
