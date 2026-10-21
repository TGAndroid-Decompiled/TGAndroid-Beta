package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34683a;
    public final Object f34684b;

    public p1(Object obj, int i10) {
        this.f34683a = i10;
        this.f34684b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34683a) {
            case 0:
                ((h) this.f34684b).run();
                return;
            default:
                ha haVar = (ha) this.f34684b;
                PopupWindow popupWindow = haVar.f34309s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
