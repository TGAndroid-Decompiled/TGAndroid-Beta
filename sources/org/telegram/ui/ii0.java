package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ii0 implements Runnable {
    public final int f33739a;
    public final cj0 f33740b;
    public final EditText f33741c;

    public ii0(cj0 cj0Var, EditText editText, int i10) {
        this.f33739a = i10;
        this.f33740b = cj0Var;
        this.f33741c = editText;
    }

    @Override
    public final void run() {
        switch (this.f33739a) {
            case 0:
                cj0 cj0Var = this.f33740b;
                if (!cj0Var.f31701p0) {
                    try {
                        Window window = cj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        cj0Var.f31701p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, this.f33741c, 1), 100L);
                return;
            default:
                cj0 cj0Var2 = this.f33740b;
                int[] iArr = cj0Var2.f31700o0;
                AndroidUtilities.showKeyboard(this.f33741c);
                org.telegram.ui.Components.xg xgVar = cj0Var2.W;
                if (xgVar != null) {
                    xgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = cj0Var2.W.getWidth();
                    org.telegram.ui.Components.xg xgVar2 = cj0Var2.W;
                    xgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.em.D(6.0f, width - xgVar2.m(), i10);
                    cj0Var2.X.setScaleX(cj0Var2.W.getScaleX());
                    cj0Var2.X.setScaleY(cj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
