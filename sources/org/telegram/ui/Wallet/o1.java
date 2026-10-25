package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f37043a;
    public final Object f37044b;

    public o1(Object obj, int i10) {
        this.f37043a = i10;
        this.f37044b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f37043a) {
            case 0:
                ((h) this.f37044b).run();
                return;
            default:
                ha haVar = (ha) this.f37044b;
                PopupWindow popupWindow = haVar.f36654s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
