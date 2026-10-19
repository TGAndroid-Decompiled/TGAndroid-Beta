package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f34623a;
    public final Object f34624b;

    public o1(Object obj, int i10) {
        this.f34623a = i10;
        this.f34624b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f34623a) {
            case 0:
                ((h) this.f34624b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f34624b;
                if (t7Var.f34925h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f34624b;
                PopupWindow popupWindow = haVar.f34300s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
