package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class t1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f45092a;
    public final Object f45093b;

    public t1(Object obj, int i7) {
        this.f45092a = i7;
        this.f45093b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f45092a) {
            case 0:
                ((p) this.f45093b).run();
                return;
            default:
                db dbVar = (db) this.f45093b;
                PopupWindow popupWindow = dbVar.f44131s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    return;
                }
                return;
        }
    }
}
