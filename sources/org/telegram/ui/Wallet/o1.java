package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f37071a;
    public final Object f37072b;

    public o1(Object obj, int i10) {
        this.f37071a = i10;
        this.f37072b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f37071a) {
            case 0:
                ((h) this.f37072b).run();
                return;
            default:
                ha haVar = (ha) this.f37072b;
                PopupWindow popupWindow = haVar.f36682s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
