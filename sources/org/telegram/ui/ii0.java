package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f38692a;
    public final cj0 f38693b;
    public final EditText f38694c;

    public ii0(cj0 cj0Var, EditText editText, int i10) {
        this.f38692a = i10;
        this.f38693b = cj0Var;
        this.f38694c = editText;
    }

    @Override
    public final void run() {
        switch (this.f38692a) {
            case 0:
                cj0 cj0Var = this.f38693b;
                if (!cj0Var.f36743p0) {
                    try {
                        Window window = cj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        cj0Var.f36743p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, this.f38694c, 1), 100L);
                return;
            default:
                cj0 cj0Var2 = this.f38693b;
                int[] iArr = cj0Var2.f36742o0;
                AndroidUtilities.showKeyboard(this.f38694c);
                org.telegram.ui.Components.xg xgVar = cj0Var2.W;
                if (xgVar != null) {
                    xgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = cj0Var2.W.getWidth();
                    org.telegram.ui.Components.xg xgVar2 = cj0Var2.W;
                    xgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ai.D(6.0f, width - xgVar2.m(), i10);
                    cj0Var2.X.setScaleX(cj0Var2.W.getScaleX());
                    cj0Var2.X.setScaleY(cj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
