package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final int f36985a;
    public final Object f36986b;

    public n1(Object obj, int i10) {
        this.f36985a = i10;
        this.f36986b = obj;
    }

    @Override
    public final void onScrollChanged() {
        switch (this.f36985a) {
            case 0:
                ((h) this.f36986b).run();
                return;
            case 1:
                t7 t7Var = (t7) this.f36986b;
                if (t7Var.f37294h1) {
                    t7Var.f0();
                    return;
                }
                return;
            default:
                ha haVar = (ha) this.f36986b;
                PopupWindow popupWindow = haVar.f36657s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    return;
                }
                return;
        }
    }
}
