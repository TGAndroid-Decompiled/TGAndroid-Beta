package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42699a;
    public final Object f42700b;

    public l1(Object obj, int i7) {
        this.f42699a = i7;
        this.f42700b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42699a) {
            case 0:
                ((g) this.f42700b).run();
                return;
            case 1:
                c8 c8Var = (c8) this.f42700b;
                if (c8Var.f42246h1) {
                    c8Var.f0();
                    return;
                }
                return;
            default:
                oa oaVar = (oa) this.f42700b;
                PopupWindow popupWindow = oaVar.f42924s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
