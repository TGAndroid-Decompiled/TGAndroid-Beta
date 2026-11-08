package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42694a;
    public final Object f42695b;

    public k1(Object obj, int i7) {
        this.f42694a = i7;
        this.f42695b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42694a) {
            case 0:
                ((g) this.f42695b).run();
                return;
            case 1:
                b8 b8Var = (b8) this.f42695b;
                if (b8Var.f42236h1) {
                    b8Var.f0();
                    return;
                }
                return;
            default:
                na naVar = (na) this.f42695b;
                PopupWindow popupWindow = naVar.f42918s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    naVar.c();
                    return;
                }
                return;
        }
    }
}
