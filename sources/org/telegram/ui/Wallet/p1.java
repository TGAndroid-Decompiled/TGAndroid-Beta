package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34687a;
    public final Object f34688b;

    public p1(Object obj, int i10) {
        this.f34687a = i10;
        this.f34688b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34687a) {
            case 0:
                ((h) this.f34688b).run();
                return;
            default:
                ha haVar = (ha) this.f34688b;
                PopupWindow popupWindow = haVar.f34313s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
