package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42724a;
    public final Object f42725b;

    public l1(Object obj, int i7) {
        this.f42724a = i7;
        this.f42725b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42724a) {
            case 0:
                ((g) this.f42725b).run();
                return;
            case 1:
                c8 c8Var = (c8) this.f42725b;
                if (c8Var.f42271h1) {
                    c8Var.f0();
                    return;
                }
                return;
            default:
                oa oaVar = (oa) this.f42725b;
                PopupWindow popupWindow = oaVar.f42949s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
