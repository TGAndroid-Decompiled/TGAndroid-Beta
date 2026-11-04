package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class j1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42689a;
    public final Object f42690b;

    public j1(Object obj, int i3) {
        this.f42689a = i3;
        this.f42690b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42689a) {
            case 0:
                ((g) this.f42690b).run();
                return;
            default:
                na naVar = (na) this.f42690b;
                PopupWindow popupWindow = naVar.f42967s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    naVar.c();
                    return;
                }
                return;
        }
    }
}
