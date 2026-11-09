package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class k1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42653a;
    public final Object f42654b;

    public k1(Object obj, int i7) {
        this.f42653a = i7;
        this.f42654b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42653a) {
            case 0:
                ((g) this.f42654b).run();
                return;
            default:
                ma maVar = (ma) this.f42654b;
                PopupWindow popupWindow = maVar.f42836s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    maVar.c();
                    return;
                }
                return;
        }
    }
}
