package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class p1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34686a;
    public final Object f34687b;

    public p1(Object obj, int i10) {
        this.f34686a = i10;
        this.f34687b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34686a) {
            case 0:
                ((h) this.f34687b).run();
                return;
            default:
                ha haVar = (ha) this.f34687b;
                PopupWindow popupWindow = haVar.f34312s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
