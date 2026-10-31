package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34832a;
    public final Object f34833b;

    public l1(Object obj, int i10) {
        this.f34832a = i10;
        this.f34833b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34832a) {
            case 0:
                ((g) this.f34833b).run();
                return;
            default:
                ra raVar = (ra) this.f34833b;
                PopupWindow popupWindow = raVar.f35160s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    raVar.c();
                    return;
                }
                return;
        }
    }
}
