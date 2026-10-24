package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34896a;
    public final Object f34897b;

    public n1(Object obj, int i10) {
        this.f34896a = i10;
        this.f34897b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34896a) {
            case 0:
                ((h) this.f34897b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34897b;
                if (t7Var.f35239h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ia iaVar = (ia) this.f34897b;
                PopupWindow popupWindow = iaVar.f34627s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    return;
                }
                return;
        }
    }
}
