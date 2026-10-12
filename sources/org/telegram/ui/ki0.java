package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ki0 implements Runnable {
    public final int f39512a;
    public final ej0 f39513b;
    public final EditText f39514c;

    public ki0(ej0 ej0Var, EditText editText, int i10) {
        this.f39512a = i10;
        this.f39513b = ej0Var;
        this.f39514c = editText;
    }

    @Override
    public final void run() {
        switch (this.f39512a) {
            case 0:
                ej0 ej0Var = this.f39513b;
                if (!ej0Var.f37150p0) {
                    try {
                        Window window = ej0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ej0Var.f37150p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new ki0(ej0Var, this.f39514c, 1), 100L);
                return;
            default:
                ej0 ej0Var2 = this.f39513b;
                int[] iArr = ej0Var2.f37149o0;
                AndroidUtilities.showKeyboard(this.f39514c);
                org.telegram.ui.Components.zg zgVar = ej0Var2.W;
                if (zgVar != null) {
                    zgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ej0Var2.W.getWidth();
                    org.telegram.ui.Components.zg zgVar2 = ej0Var2.W;
                    zgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.am.D(6.0f, width - zgVar2.m(), i10);
                    ej0Var2.X.setScaleX(ej0Var2.W.getScaleX());
                    ej0Var2.X.setScaleY(ej0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
