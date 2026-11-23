package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class t1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f45062a;
    public final Object f45063b;

    public t1(Object obj, int i7) {
        this.f45062a = i7;
        this.f45063b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f45062a) {
            case 0:
                ((p) this.f45063b).run();
                return;
            default:
                db dbVar = (db) this.f45063b;
                PopupWindow popupWindow = dbVar.f44101s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
