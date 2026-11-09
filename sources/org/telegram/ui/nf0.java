package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class nf0 implements Runnable {
    public final int f48183a;
    public final dg0 f48184b;
    public final EditText f48185c;

    public nf0(dg0 dg0Var, EditText editText, int i7) {
        this.f48183a = i7;
        this.f48184b = dg0Var;
        this.f48185c = editText;
    }

    @Override
    public final void run() {
        switch (this.f48183a) {
            case 0:
                dg0 dg0Var = this.f48184b;
                if (!dg0Var.f44966o0) {
                    try {
                        Window window = dg0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dg0Var.f44966o0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new nf0(dg0Var, this.f48185c, 1), 100L);
                return;
            default:
                dg0 dg0Var2 = this.f48184b;
                int[] iArr = dg0Var2.f44965n0;
                org.telegram.messenger.g0.K3(this.f48185c);
                org.telegram.ui.Components.dg dgVar = dg0Var2.V;
                if (dgVar != null) {
                    dgVar.getLocationOnScreen(iArr);
                    int i7 = iArr[0];
                    int width = dg0Var2.V.getWidth();
                    org.telegram.ui.Components.dg dgVar2 = dg0Var2.V;
                    dgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - dgVar2.m(), i7);
                    dg0Var2.W.setScaleX(dg0Var2.V.getScaleX());
                    dg0Var2.W.setScaleY(dg0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
