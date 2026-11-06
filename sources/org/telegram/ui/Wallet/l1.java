package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42723a;
    public final Object f42724b;

    public l1(Object obj, int i7) {
        this.f42723a = i7;
        this.f42724b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42723a) {
            case 0:
                ((g) this.f42724b).run();
                return;
            case 1:
                c8 c8Var = (c8) this.f42724b;
                if (c8Var.f42270h1) {
                    c8Var.f0();
                    return;
                }
                return;
            default:
                oa oaVar = (oa) this.f42724b;
                PopupWindow popupWindow = oaVar.f42948s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
