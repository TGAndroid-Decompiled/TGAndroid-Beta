package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class fi0 implements Runnable {
    public final int f36339a;
    public final zi0 f36340b;
    public final EditText f36341c;

    public fi0(zi0 zi0Var, EditText editText, int i10) {
        this.f36339a = i10;
        this.f36340b = zi0Var;
        this.f36341c = editText;
    }

    @Override
    public final void run() {
        switch (this.f36339a) {
            case 0:
                zi0 zi0Var = this.f36340b;
                if (!zi0Var.f43819p0) {
                    try {
                        Window window = zi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        zi0Var.f43819p0 = true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new fi0(zi0Var, this.f36341c, 1), 100L);
                return;
            default:
                zi0 zi0Var2 = this.f36340b;
                int[] iArr = zi0Var2.f43818o0;
                AndroidUtilities.showKeyboard(this.f36341c);
                org.telegram.ui.Components.wg wgVar = zi0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = zi0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = zi0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.bi.D(6.0f, width - wgVar2.m(), i10);
                    zi0Var2.X.setScaleX(zi0Var2.W.getScaleX());
                    zi0Var2.X.setScaleY(zi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
