package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class pf0 implements Runnable {
    public final int f50829a;
    public final fg0 f50830b;
    public final EditText f50831c;

    public pf0(fg0 fg0Var, EditText editText, int i7) {
        this.f50829a = i7;
        this.f50830b = fg0Var;
        this.f50831c = editText;
    }

    @Override
    public final void run() {
        switch (this.f50829a) {
            case 0:
                fg0 fg0Var = this.f50830b;
                if (!fg0Var.f47644t0) {
                    try {
                        Window window = fg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        fg0Var.f47644t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new pf0(fg0Var, this.f50831c, 1), 100L);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f50831c);
                fg0 fg0Var2 = this.f50830b;
                if (fg0Var2.W != null) {
                    fg0Var2.d(fg0Var2.f47641r0);
                    fg0Var2.X.setScaleX(fg0Var2.W.getScaleX());
                    fg0Var2.X.setScaleY(fg0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
