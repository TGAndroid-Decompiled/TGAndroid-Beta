package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35383a;
    public final Object f35384b;

    public o1(Object obj, int i10) {
        this.f35383a = i10;
        this.f35384b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35383a) {
            case 0:
                ((m) this.f35384b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35384b;
                PopupWindow popupWindow = j9Var.f35167s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
