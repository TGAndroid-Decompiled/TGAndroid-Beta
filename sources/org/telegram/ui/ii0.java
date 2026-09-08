package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f37410a;
    public final cj0 f37411b;
    public final EditText f37412c;

    public ii0(cj0 cj0Var, EditText editText, int i10) {
        this.f37410a = i10;
        this.f37411b = cj0Var;
        this.f37412c = editText;
    }

    @Override
    public final void run() {
        switch (this.f37410a) {
            case 0:
                cj0 cj0Var = this.f37411b;
                if (!cj0Var.f35174p0) {
                    try {
                        Window window = cj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        cj0Var.f35174p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, this.f37412c, 1), 100L);
                return;
            default:
                cj0 cj0Var2 = this.f37411b;
                int[] iArr = cj0Var2.f35173o0;
                AndroidUtilities.showKeyboard(this.f37412c);
                org.telegram.ui.Components.vg vgVar = cj0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = cj0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = cj0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.wl.D(6.0f, width - vgVar2.m(), i10);
                    cj0Var2.X.setScaleX(cj0Var2.W.getScaleX());
                    cj0Var2.X.setScaleY(cj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
