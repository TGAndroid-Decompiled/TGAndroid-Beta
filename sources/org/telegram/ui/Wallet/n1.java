package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34894a;
    public final Object f34895b;

    public n1(Object obj, int i10) {
        this.f34894a = i10;
        this.f34895b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34894a) {
            case 0:
                ((h) this.f34895b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34895b;
                if (t7Var.f35237h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ia iaVar = (ia) this.f34895b;
                PopupWindow popupWindow = iaVar.f34625s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    return;
                }
                return;
        }
    }
}
