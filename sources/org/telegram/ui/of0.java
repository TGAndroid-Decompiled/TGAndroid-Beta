package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class of0 implements Runnable {
    public final int f48520a;
    public final eg0 f48521b;
    public final EditText f48522c;

    public of0(eg0 eg0Var, EditText editText, int i7) {
        this.f48520a = i7;
        this.f48521b = eg0Var;
        this.f48522c = editText;
    }

    @Override
    public final void run() {
        switch (this.f48520a) {
            case 0:
                eg0 eg0Var = this.f48521b;
                if (!eg0Var.f45287o0) {
                    try {
                        Window window = eg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        eg0Var.f45287o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new of0(eg0Var, this.f48522c, 1), 100L);
                return;
            default:
                eg0 eg0Var2 = this.f48521b;
                int[] iArr = eg0Var2.f45286n0;
                org.telegram.messenger.g0.K3(this.f48522c);
                org.telegram.ui.Components.cg cgVar = eg0Var2.V;
                if (cgVar != null) {
                    cgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = eg0Var2.V.getWidth();
                    org.telegram.ui.Components.cg cgVar2 = eg0Var2.V;
                    cgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - cgVar2.m(), i7);
                    eg0Var2.W.setScaleX(eg0Var2.V.getScaleX());
                    eg0Var2.W.setScaleY(eg0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
