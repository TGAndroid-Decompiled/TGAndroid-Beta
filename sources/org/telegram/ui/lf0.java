package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class lf0 implements Runnable {
    public final int f48983a;
    public final bg0 f48984b;
    public final EditText f48985c;

    public lf0(bg0 bg0Var, EditText editText, int i7) {
        this.f48983a = i7;
        this.f48984b = bg0Var;
        this.f48985c = editText;
    }

    @Override
    public final void run() {
        switch (this.f48983a) {
            case 0:
                bg0 bg0Var = this.f48984b;
                if (!bg0Var.f45732t0) {
                    try {
                        Window window = bg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bg0Var.f45732t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new lf0(bg0Var, this.f48985c, 1), 100L);
                return;
            default:
                org.telegram.messenger.g0.J3(this.f48985c);
                bg0 bg0Var2 = this.f48984b;
                if (bg0Var2.W != null) {
                    bg0Var2.d(bg0Var2.f45729r0);
                    bg0Var2.X.setScaleX(bg0Var2.W.getScaleX());
                    bg0Var2.X.setScaleY(bg0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
