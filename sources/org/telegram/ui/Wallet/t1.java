package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class t1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f45052a;
    public final Object f45053b;

    public t1(Object obj, int i7) {
        this.f45052a = i7;
        this.f45053b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f45052a) {
            case 0:
                ((p) this.f45053b).run();
                return;
            default:
                db dbVar = (db) this.f45053b;
                PopupWindow popupWindow = dbVar.f44091s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
