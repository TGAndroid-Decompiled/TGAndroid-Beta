package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class m1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f42740a;
    public final Object f42741b;

    public m1(Object obj, int i7) {
        this.f42740a = i7;
        this.f42741b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f42740a) {
            case 0:
                ((g) this.f42741b).run();
                return;
            default:
                oa oaVar = (oa) this.f42741b;
                PopupWindow popupWindow = oaVar.f42924s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    return;
                }
                return;
        }
    }
}
