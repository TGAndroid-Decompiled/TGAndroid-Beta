package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class i1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f42637a;
    public final Object f42638b;

    public i1(Object obj, int i3) {
        this.f42637a = i3;
        this.f42638b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f42637a) {
            case 0:
                ((g) this.f42638b).run();
                return;
            case 1:
                b8 b8Var = (b8) this.f42638b;
                if (b8Var.f42310i1) {
                    b8Var.f0();
                    return;
                }
                return;
            default:
                na naVar = (na) this.f42638b;
                PopupWindow popupWindow = naVar.f42967s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    naVar.c();
                    return;
                }
                return;
        }
    }
}
