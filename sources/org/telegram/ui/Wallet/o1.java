package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34666a;
    public final Object f34667b;

    public o1(Object obj, int i10) {
        this.f34666a = i10;
        this.f34667b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34666a) {
            case 0:
                ((h) this.f34667b).run();
                return;
            case 1:
                z7 z7Var = (z7) this.f34667b;
                if (z7Var.f35186c1) {
                    z7Var.h0();
                    return;
                }
                return;
            default:
                la laVar = (la) this.f34667b;
                PopupWindow popupWindow = laVar.f34523s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    laVar.c();
                    return;
                }
                return;
        }
    }
}
