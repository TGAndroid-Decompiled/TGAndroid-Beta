package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f37046a;
    public final Object f37047b;

    public o1(Object obj, int i10) {
        this.f37046a = i10;
        this.f37047b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f37046a) {
            case 0:
                ((h) this.f37047b).run();
                return;
            default:
                ha haVar = (ha) this.f37047b;
                PopupWindow popupWindow = haVar.f36657s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
