package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f34535a;
    public final cj0 f34536b;
    public final EditText f34537c;

    public ii0(cj0 cj0Var, EditText editText, int i10) {
        this.f34535a = i10;
        this.f34536b = cj0Var;
        this.f34537c = editText;
    }

    @Override
    public final void run() {
        switch (this.f34535a) {
            case 0:
                cj0 cj0Var = this.f34536b;
                if (!cj0Var.f32690p0) {
                    try {
                        Window window = cj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        cj0Var.f32690p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, this.f34537c, 1), 100L);
                return;
            default:
                cj0 cj0Var2 = this.f34536b;
                int[] iArr = cj0Var2.f32689o0;
                AndroidUtilities.showKeyboard(this.f34537c);
                org.telegram.ui.Components.ug ugVar = cj0Var2.W;
                if (ugVar != null) {
                    ugVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = cj0Var2.W.getWidth();
                    org.telegram.ui.Components.ug ugVar2 = cj0Var2.W;
                    ugVar2.getHeight();
                    iArr[0] = org.telegram.messenger.wh.D(6.0f, width - ugVar2.m(), i10);
                    cj0Var2.X.setScaleX(cj0Var2.W.getScaleX());
                    cj0Var2.X.setScaleY(cj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
