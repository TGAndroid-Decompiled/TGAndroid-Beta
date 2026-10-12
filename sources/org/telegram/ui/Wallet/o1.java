package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35153a;
    public final Object f35154b;

    public o1(Object obj, int i10) {
        this.f35153a = i10;
        this.f35154b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35153a) {
            case 0:
                ((l) this.f35154b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35154b;
                PopupWindow popupWindow = j9Var.f34944s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
