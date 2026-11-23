package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class s1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f44981a;
    public final Object f44982b;

    public s1(Object obj, int i7) {
        this.f44981a = i7;
        this.f44982b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f44981a) {
            case 0:
                ((p) this.f44982b).run();
                return;
            case 1:
                r8 r8Var = (r8) this.f44982b;
                if (r8Var.f44915i1) {
                    r8Var.f0();
                    return;
                }
                return;
            default:
                db dbVar = (db) this.f44982b;
                PopupWindow popupWindow = dbVar.f44101s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
