package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f44052a;
    public final Object f44053b;

    public k1(Object obj, int i7) {
        this.f44052a = i7;
        this.f44053b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f44052a) {
            case 0:
                ((g) this.f44053b).run();
                return;
            default:
                pa paVar = (pa) this.f44053b;
                PopupWindow popupWindow = paVar.f44371s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    paVar.c();
                    return;
                }
                return;
        }
    }
}
