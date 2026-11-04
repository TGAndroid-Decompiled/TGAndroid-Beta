package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class ff0 implements Runnable {
    public final int f45270a;
    public final vf0 f45271b;
    public final EditText f45272c;

    public ff0(vf0 vf0Var, EditText editText, int i3) {
        this.f45270a = i3;
        this.f45271b = vf0Var;
        this.f45272c = editText;
    }

    @Override
    public final void run() {
        switch (this.f45270a) {
            case 0:
                vf0 vf0Var = this.f45271b;
                if (!vf0Var.f50492p0) {
                    try {
                        Window window = vf0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        vf0Var.f50492p0 = true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.i3(new ff0(vf0Var, this.f45272c, 1), 100L);
                return;
            default:
                vf0 vf0Var2 = this.f45271b;
                int[] iArr = vf0Var2.f50491o0;
                org.telegram.messenger.g0.K3(this.f45272c);
                org.telegram.ui.Components.bg bgVar = vf0Var2.W;
                if (bgVar != null) {
                    bgVar.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int width = vf0Var2.W.getWidth();
                    org.telegram.ui.Components.bg bgVar2 = vf0Var2.W;
                    bgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - bgVar2.m(), i3);
                    vf0Var2.X.setScaleX(vf0Var2.W.getScaleX());
                    vf0Var2.X.setScaleY(vf0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
