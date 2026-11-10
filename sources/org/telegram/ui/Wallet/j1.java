package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class j1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42664a;
    public final Object f42665b;

    public j1(Object obj, int i7) {
        this.f42664a = i7;
        this.f42665b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42664a) {
            case 0:
                ((g) this.f42665b).run();
                return;
            case 1:
                d8 d8Var = (d8) this.f42665b;
                if (d8Var.f42395h1) {
                    d8Var.f0();
                    return;
                }
                return;
            default:
                pa paVar = (pa) this.f42665b;
                PopupWindow popupWindow = paVar.f43031s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    paVar.c();
                    return;
                }
                return;
        }
    }
}
