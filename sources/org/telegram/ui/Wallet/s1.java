package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class s1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f45011a;
    public final Object f45012b;

    public s1(Object obj, int i7) {
        this.f45011a = i7;
        this.f45012b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f45011a) {
            case 0:
                ((p) this.f45012b).run();
                return;
            case 1:
                r8 r8Var = (r8) this.f45012b;
                if (r8Var.f44945i1) {
                    r8Var.f0();
                    return;
                }
                return;
            default:
                db dbVar = (db) this.f45012b;
                PopupWindow popupWindow = dbVar.f44131s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
