package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qh0 implements Runnable {
    public final int f41728a;
    public final ki0 f41729b;
    public final EditText f41730c;

    public qh0(ki0 ki0Var, EditText editText, int i10) {
        this.f41728a = i10;
        this.f41729b = ki0Var;
        this.f41730c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41728a) {
            case 0:
                ki0 ki0Var = this.f41729b;
                if (!ki0Var.f39888l0) {
                    try {
                        Window window = ki0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ki0Var.f39888l0 = true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                AndroidUtilities.runOnUIThread(new qh0(ki0Var, this.f41730c, 1), 100L);
                return;
            default:
                ki0 ki0Var2 = this.f41729b;
                int[] iArr = ki0Var2.f39887k0;
                AndroidUtilities.showKeyboard(this.f41730c);
                org.telegram.ui.Components.og ogVar = ki0Var2.S;
                if (ogVar != null) {
                    ogVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ki0Var2.S.getWidth();
                    org.telegram.ui.Components.og ogVar2 = ki0Var2.S;
                    ogVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - ogVar2.m(), i10);
                    ki0Var2.T.setScaleX(ki0Var2.S.getScaleX());
                    ki0Var2.T.setScaleY(ki0Var2.S.getScaleY());
                    return;
                }
                return;
        }
    }
}
