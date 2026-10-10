package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35319a;
    public final Object f35320b;

    public n1(Object obj, int i10) {
        this.f35319a = i10;
        this.f35320b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35319a) {
            case 0:
                ((l) this.f35320b).run();
                return;
            default:
                i9 i9Var = (i9) this.f35320b;
                PopupWindow popupWindow = i9Var.f35103s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    i9Var.c();
                    return;
                }
                return;
        }
    }
}
