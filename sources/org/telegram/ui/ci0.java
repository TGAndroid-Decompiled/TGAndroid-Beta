package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ci0 implements Runnable {
    public final int f32357a;
    public final wi0 f32358b;
    public final EditText f32359c;

    public ci0(wi0 wi0Var, EditText editText, int i10) {
        this.f32357a = i10;
        this.f32358b = wi0Var;
        this.f32359c = editText;
    }

    @Override
    public final void run() {
        switch (this.f32357a) {
            case 0:
                wi0 wi0Var = this.f32358b;
                if (!wi0Var.f39015p0) {
                    try {
                        Window window = wi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        wi0Var.f39015p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ci0(wi0Var, this.f32359c, 1), 100L);
                return;
            default:
                wi0 wi0Var2 = this.f32358b;
                int[] iArr = wi0Var2.f39014o0;
                AndroidUtilities.showKeyboard(this.f32359c);
                org.telegram.ui.Components.ug ugVar = wi0Var2.W;
                if (ugVar != null) {
                    ugVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = wi0Var2.W.getWidth();
                    org.telegram.ui.Components.ug ugVar2 = wi0Var2.W;
                    ugVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ul.D(6.0f, width - ugVar2.m(), i10);
                    wi0Var2.X.setScaleX(wi0Var2.W.getScaleX());
                    wi0Var2.X.setScaleY(wi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
