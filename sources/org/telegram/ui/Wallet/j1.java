package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class j1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f44003a;
    public final Object f44004b;

    public j1(Object obj, int i7) {
        this.f44003a = i7;
        this.f44004b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f44003a) {
            case 0:
                ((g) this.f44004b).run();
                return;
            case 1:
                c8 c8Var = (c8) this.f44004b;
                if (c8Var.f43667i1) {
                    c8Var.f0();
                    return;
                }
                return;
            default:
                pa paVar = (pa) this.f44004b;
                PopupWindow popupWindow = paVar.f44371s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    paVar.c();
                    return;
                }
                return;
        }
    }
}
