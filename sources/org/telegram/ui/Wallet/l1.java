package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class l1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42734a;
    public final Object f42735b;

    public l1(Object obj, int i7) {
        this.f42734a = i7;
        this.f42735b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42734a) {
            case 0:
                ((g) this.f42735b).run();
                return;
            default:
                na naVar = (na) this.f42735b;
                PopupWindow popupWindow = naVar.f42918s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    naVar.c();
                    return;
                }
                return;
        }
    }
}
