package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ei0 implements Runnable {
    public final int f33271a;
    public final yi0 f33272b;
    public final EditText f33273c;

    public ei0(yi0 yi0Var, EditText editText, int i10) {
        this.f33271a = i10;
        this.f33272b = yi0Var;
        this.f33273c = editText;
    }

    @Override
    public final void run() {
        switch (this.f33271a) {
            case 0:
                yi0 yi0Var = this.f33272b;
                if (!yi0Var.f40240p0) {
                    try {
                        Window window = yi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        yi0Var.f40240p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ei0(yi0Var, this.f33273c, 1), 100L);
                return;
            default:
                yi0 yi0Var2 = this.f33272b;
                int[] iArr = yi0Var2.f40239o0;
                AndroidUtilities.showKeyboard(this.f33273c);
                org.telegram.ui.Components.vg vgVar = yi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = yi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = yi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.qk.D(6.0f, width - vgVar2.m(), i10);
                    yi0Var2.X.setScaleX(yi0Var2.W.getScaleX());
                    yi0Var2.X.setScaleY(yi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
