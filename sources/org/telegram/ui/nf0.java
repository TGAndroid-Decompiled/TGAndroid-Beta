package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class nf0 implements Runnable {
    public final int f50310a;
    public final dg0 f50311b;
    public final EditText f50312c;

    public nf0(dg0 dg0Var, EditText editText, int i7) {
        this.f50310a = i7;
        this.f50311b = dg0Var;
        this.f50312c = editText;
    }

    @Override
    public final void run() {
        switch (this.f50310a) {
            case 0:
                dg0 dg0Var = this.f50311b;
                if (!dg0Var.f47117t0) {
                    try {
                        Window window = dg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dg0Var.f47117t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new nf0(dg0Var, this.f50312c, 1), 100L);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f50312c);
                dg0 dg0Var2 = this.f50311b;
                if (dg0Var2.W != null) {
                    dg0Var2.d(dg0Var2.f47114r0);
                    dg0Var2.X.setScaleX(dg0Var2.W.getScaleX());
                    dg0Var2.X.setScaleY(dg0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
