package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34674a;
    public final Object f34675b;

    public p1(Object obj, int i10) {
        this.f34674a = i10;
        this.f34675b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34674a) {
            case 0:
                ((h) this.f34675b).run();
                return;
            default:
                ha haVar = (ha) this.f34675b;
                PopupWindow popupWindow = haVar.f34300s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
