package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f33462a;
    public final Object f33463b;

    public m1(Object obj, int i10) {
        this.f33462a = i10;
        this.f33463b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f33462a) {
            case 0:
                ((k) this.f33463b).run();
                return;
            default:
                h9 h9Var = (h9) this.f33463b;
                PopupWindow popupWindow = h9Var.f33266s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
