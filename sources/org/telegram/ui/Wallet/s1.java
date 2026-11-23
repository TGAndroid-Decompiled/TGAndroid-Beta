package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class s1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f45015a;
    public final Object f45016b;

    public s1(Object obj, int i7) {
        this.f45015a = i7;
        this.f45016b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f45015a) {
            case 0:
                ((p) this.f45016b).run();
                return;
            case 1:
                r8 r8Var = (r8) this.f45016b;
                if (r8Var.f44949i1) {
                    r8Var.f0();
                    return;
                }
                return;
            default:
                db dbVar = (db) this.f45016b;
                PopupWindow popupWindow = dbVar.f44135s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
