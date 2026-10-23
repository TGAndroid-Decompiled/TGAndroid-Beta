package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34917a;
    public final Object f34918b;

    public o1(Object obj, int i10) {
        this.f34917a = i10;
        this.f34918b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34917a) {
            case 0:
                ((h) this.f34918b).run();
                return;
            default:
                ia iaVar = (ia) this.f34918b;
                PopupWindow popupWindow = iaVar.f34625s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    return;
                }
                return;
        }
    }
}
