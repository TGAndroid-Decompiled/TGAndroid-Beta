package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ji0 implements Runnable {
    public final int f38946a;
    public final dj0 f38947b;
    public final EditText f38948c;

    public ji0(dj0 dj0Var, EditText editText, int i10) {
        this.f38946a = i10;
        this.f38947b = dj0Var;
        this.f38948c = editText;
    }

    @Override
    public final void run() {
        switch (this.f38946a) {
            case 0:
                dj0 dj0Var = this.f38947b;
                if (!dj0Var.f37010p0) {
                    try {
                        Window window = dj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dj0Var.f37010p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new ji0(dj0Var, this.f38948c, 1), 100L);
                return;
            default:
                dj0 dj0Var2 = this.f38947b;
                int[] iArr = dj0Var2.f37009o0;
                AndroidUtilities.showKeyboard(this.f38948c);
                org.telegram.ui.Components.xg xgVar = dj0Var2.W;
                if (xgVar != null) {
                    xgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = dj0Var2.W.getWidth();
                    org.telegram.ui.Components.xg xgVar2 = dj0Var2.W;
                    xgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.bi.D(6.0f, width - xgVar2.m(), i10);
                    dj0Var2.X.setScaleX(dj0Var2.W.getScaleX());
                    dj0Var2.X.setScaleY(dj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
