package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f35151a;
    public final Object f35152b;

    public o1(Object obj, int i10) {
        this.f35151a = i10;
        this.f35152b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f35151a) {
            case 0:
                ((l) this.f35152b).run();
                return;
            default:
                j9 j9Var = (j9) this.f35152b;
                PopupWindow popupWindow = j9Var.f34942s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    j9Var.c();
                    return;
                }
                return;
        }
    }
}
