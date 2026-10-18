package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34638a;
    public final Object f34639b;

    public o1(Object obj, int i10) {
        this.f34638a = i10;
        this.f34639b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34638a) {
            case 0:
                ((h) this.f34639b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34639b;
                if (t7Var.f34911h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ga gaVar = (ga) this.f34639b;
                PopupWindow popupWindow = gaVar.f34247s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    gaVar.c();
                    return;
                }
                return;
        }
    }
}
