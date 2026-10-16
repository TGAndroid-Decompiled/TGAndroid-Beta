package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f33231a;
    public final Object f33232b;

    public n1(Object obj, int i10) {
        this.f33231a = i10;
        this.f33232b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f33231a) {
            case 0:
                ((l) this.f33232b).run();
                return;
            default:
                h9 h9Var = (h9) this.f33232b;
                PopupWindow popupWindow = h9Var.f32996s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
