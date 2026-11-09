package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class j1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42613a;
    public final Object f42614b;

    public j1(Object obj, int i7) {
        this.f42613a = i7;
        this.f42614b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42613a) {
            case 0:
                ((g) this.f42614b).run();
                return;
            case 1:
                a8 a8Var = (a8) this.f42614b;
                if (a8Var.f42156h1) {
                    a8Var.f0();
                    return;
                }
                return;
            default:
                ma maVar = (ma) this.f42614b;
                PopupWindow popupWindow = maVar.f42836s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    maVar.c();
                    return;
                }
                return;
        }
    }
}
