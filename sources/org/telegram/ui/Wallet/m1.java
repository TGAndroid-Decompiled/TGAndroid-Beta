package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42765a;
    public final Object f42766b;

    public m1(Object obj, int i7) {
        this.f42765a = i7;
        this.f42766b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42765a) {
            case 0:
                ((g) this.f42766b).run();
                return;
            default:
                oa oaVar = (oa) this.f42766b;
                PopupWindow popupWindow = oaVar.f42949s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
