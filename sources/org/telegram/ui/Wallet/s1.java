package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class s1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f44971a;
    public final Object f44972b;

    public s1(Object obj, int i7) {
        this.f44971a = i7;
        this.f44972b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f44971a) {
            case 0:
                ((p) this.f44972b).run();
                return;
            case 1:
                r8 r8Var = (r8) this.f44972b;
                if (r8Var.f44905i1) {
                    r8Var.f0();
                    return;
                }
                return;
            default:
                db dbVar = (db) this.f44972b;
                PopupWindow popupWindow = dbVar.f44091s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
