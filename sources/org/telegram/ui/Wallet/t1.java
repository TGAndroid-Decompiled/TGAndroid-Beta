package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class t1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f45096a;
    public final Object f45097b;

    public t1(Object obj, int i7) {
        this.f45096a = i7;
        this.f45097b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f45096a) {
            case 0:
                ((p) this.f45097b).run();
                return;
            default:
                db dbVar = (db) this.f45097b;
                PopupWindow popupWindow = dbVar.f44135s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
