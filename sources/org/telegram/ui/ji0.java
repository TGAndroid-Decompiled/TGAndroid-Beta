package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ji0 implements Runnable {
    public final int f34956a;
    public final dj0 f34957b;
    public final EditText f34958c;

    public ji0(dj0 dj0Var, EditText editText, int i10) {
        this.f34956a = i10;
        this.f34957b = dj0Var;
        this.f34958c = editText;
    }

    @Override
    public final void run() {
        switch (this.f34956a) {
            case 0:
                dj0 dj0Var = this.f34957b;
                if (!dj0Var.f33097p0) {
                    try {
                        Window window = dj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dj0Var.f33097p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ji0(dj0Var, this.f34958c, 1), 100L);
                return;
            default:
                dj0 dj0Var2 = this.f34957b;
                int[] iArr = dj0Var2.f33096o0;
                AndroidUtilities.showKeyboard(this.f34958c);
                org.telegram.ui.Components.ug ugVar = dj0Var2.W;
                if (ugVar != null) {
                    ugVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = dj0Var2.W.getWidth();
                    org.telegram.ui.Components.ug ugVar2 = dj0Var2.W;
                    ugVar2.getHeight();
                    iArr[0] = org.telegram.messenger.rk.D(6.0f, width - ugVar2.m(), i10);
                    dj0Var2.X.setScaleX(dj0Var2.W.getScaleX());
                    dj0Var2.X.setScaleY(dj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
