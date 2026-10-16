package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f33265a;
    public final Object f33266b;

    public o1(Object obj, int i10) {
        this.f33265a = i10;
        this.f33266b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f33265a) {
            case 0:
                ((l) this.f33266b).run();
                return;
            default:
                h9 h9Var = (h9) this.f33266b;
                PopupWindow popupWindow = h9Var.f32996s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h9Var.c();
                    return;
                }
                return;
        }
    }
}
