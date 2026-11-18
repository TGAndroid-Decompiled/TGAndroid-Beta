package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class of0 implements Runnable {
    public final int f50603a;
    public final eg0 f50604b;
    public final EditText f50605c;

    public of0(eg0 eg0Var, EditText editText, int i7) {
        this.f50603a = i7;
        this.f50604b = eg0Var;
        this.f50605c = editText;
    }

    @Override
    public final void run() {
        switch (this.f50603a) {
            case 0:
                eg0 eg0Var = this.f50604b;
                if (!eg0Var.f47249t0) {
                    try {
                        Window window = eg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        eg0Var.f47249t0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new of0(eg0Var, this.f50605c, 1), 100L);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f50605c);
                eg0 eg0Var2 = this.f50604b;
                if (eg0Var2.W != null) {
                    eg0Var2.d(eg0Var2.f47246r0);
                    eg0Var2.X.setScaleX(eg0Var2.W.getScaleX());
                    eg0Var2.X.setScaleY(eg0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
