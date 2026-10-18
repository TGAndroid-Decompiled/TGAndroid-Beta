package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34716a;
    public final Object f34717b;

    public p1(Object obj, int i10) {
        this.f34716a = i10;
        this.f34717b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34716a) {
            case 0:
                ((h) this.f34717b).run();
                return;
            default:
                la laVar = (la) this.f34717b;
                PopupWindow popupWindow = laVar.f34523s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    laVar.c();
                    return;
                }
                return;
        }
    }
}
