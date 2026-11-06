package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42764a;
    public final Object f42765b;

    public m1(Object obj, int i7) {
        this.f42764a = i7;
        this.f42765b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42764a) {
            case 0:
                ((g) this.f42765b).run();
                return;
            default:
                oa oaVar = (oa) this.f42765b;
                PopupWindow popupWindow = oaVar.f42948s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
