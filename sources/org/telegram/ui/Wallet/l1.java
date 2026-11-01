package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34836a;
    public final Object f34837b;

    public l1(Object obj, int i10) {
        this.f34836a = i10;
        this.f34837b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34836a) {
            case 0:
                ((g) this.f34837b).run();
                return;
            default:
                ra raVar = (ra) this.f34837b;
                PopupWindow popupWindow = raVar.f35165s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    raVar.c();
                    return;
                }
                return;
        }
    }
}
