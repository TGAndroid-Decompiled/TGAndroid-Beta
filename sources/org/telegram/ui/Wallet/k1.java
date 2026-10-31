package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34798a;
    public final Object f34799b;

    public k1(Object obj, int i10) {
        this.f34798a = i10;
        this.f34799b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34798a) {
            case 0:
                ((g) this.f34799b).run();
                return;
            case 1:
                h8 h8Var = (h8) this.f34799b;
                if (h8Var.f34645h1) {
                    h8Var.f0();
                    return;
                }
                return;
            default:
                ra raVar = (ra) this.f34799b;
                PopupWindow popupWindow = raVar.f35160s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    raVar.c();
                    return;
                }
                return;
        }
    }
}
