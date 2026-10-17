package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34664a;
    public final Object f34665b;

    public o1(Object obj, int i10) {
        this.f34664a = i10;
        this.f34665b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34664a) {
            case 0:
                ((h) this.f34665b).run();
                return;
            case 1:
                w7 w7Var = (w7) this.f34665b;
                if (w7Var.f35050c1) {
                    w7Var.h0();
                    return;
                }
                return;
            default:
                ia iaVar = (ia) this.f34665b;
                PopupWindow popupWindow = iaVar.f34336s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    return;
                }
                return;
        }
    }
}
