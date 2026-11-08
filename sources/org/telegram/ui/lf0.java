package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class lf0 implements Runnable {
    public final int f47532a;
    public final bg0 f47533b;
    public final EditText f47534c;

    public lf0(bg0 bg0Var, EditText editText, int i7) {
        this.f47532a = i7;
        this.f47533b = bg0Var;
        this.f47534c = editText;
    }

    @Override
    public final void run() {
        switch (this.f47532a) {
            case 0:
                bg0 bg0Var = this.f47533b;
                if (!bg0Var.f44337o0) {
                    try {
                        Window window = bg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bg0Var.f44337o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new lf0(bg0Var, this.f47534c, 1), 100L);
                return;
            default:
                bg0 bg0Var2 = this.f47533b;
                int[] iArr = bg0Var2.f44336n0;
                org.telegram.messenger.g0.K3(this.f47534c);
                org.telegram.ui.Components.dg dgVar = bg0Var2.V;
                if (dgVar != null) {
                    dgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = bg0Var2.V.getWidth();
                    org.telegram.ui.Components.dg dgVar2 = bg0Var2.V;
                    dgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - dgVar2.m(), i7);
                    bg0Var2.W.setScaleX(bg0Var2.V.getScaleX());
                    bg0Var2.W.setScaleY(bg0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
