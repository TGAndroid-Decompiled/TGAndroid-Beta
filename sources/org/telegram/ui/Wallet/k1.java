package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42707a;
    public final Object f42708b;

    public k1(Object obj, int i7) {
        this.f42707a = i7;
        this.f42708b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42707a) {
            case 0:
                ((g) this.f42708b).run();
                return;
            default:
                pa paVar = (pa) this.f42708b;
                PopupWindow popupWindow = paVar.f43031s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    paVar.c();
                    return;
                }
                return;
        }
    }
}
