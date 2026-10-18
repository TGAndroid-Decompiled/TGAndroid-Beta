package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34693a;
    public final Object f34694b;

    public p1(Object obj, int i10) {
        this.f34693a = i10;
        this.f34694b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34693a) {
            case 0:
                ((h) this.f34694b).run();
                return;
            default:
                ga gaVar = (ga) this.f34694b;
                PopupWindow popupWindow = gaVar.f34247s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    gaVar.c();
                    return;
                }
                return;
        }
    }
}
