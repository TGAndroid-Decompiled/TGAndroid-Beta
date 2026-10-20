package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34682a;
    public final Object f34683b;

    public p1(Object obj, int i10) {
        this.f34682a = i10;
        this.f34683b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34682a) {
            case 0:
                ((h) this.f34683b).run();
                return;
            default:
                ha haVar = (ha) this.f34683b;
                PopupWindow popupWindow = haVar.f34308s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
