package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class o1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f34919a;
    public final Object f34920b;

    public o1(Object obj, int i10) {
        this.f34919a = i10;
        this.f34920b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f34919a) {
            case 0:
                ((h) this.f34920b).run();
                return;
            default:
                ia iaVar = (ia) this.f34920b;
                PopupWindow popupWindow = iaVar.f34627s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    return;
                }
                return;
        }
    }
}
