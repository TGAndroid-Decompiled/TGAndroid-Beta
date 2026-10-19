package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34676a;
    public final Object f34677b;

    public p1(Object obj, int i10) {
        this.f34676a = i10;
        this.f34677b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34676a) {
            case 0:
                ((h) this.f34677b).run();
                return;
            default:
                ha haVar = (ha) this.f34677b;
                PopupWindow popupWindow = haVar.f34302s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
