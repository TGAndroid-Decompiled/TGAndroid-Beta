package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ni0 implements Runnable {
    public final int f38724a;
    public final hj0 f38725b;
    public final EditText f38726c;

    public ni0(hj0 hj0Var, EditText editText, int i10) {
        this.f38724a = i10;
        this.f38725b = hj0Var;
        this.f38726c = editText;
    }

    @Override
    public final void run() {
        switch (this.f38724a) {
            case 0:
                hj0 hj0Var = this.f38725b;
                if (!hj0Var.f36853p0) {
                    try {
                        Window window = hj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        hj0Var.f36853p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ni0(hj0Var, this.f38726c, 1), 100L);
                return;
            default:
                hj0 hj0Var2 = this.f38725b;
                int[] iArr = hj0Var2.f36852o0;
                AndroidUtilities.showKeyboard(this.f38726c);
                org.telegram.ui.Components.wg wgVar = hj0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = hj0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = hj0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.ui.Cells.d0.b(6.0f, width - wgVar2.m(), i10);
                    hj0Var2.X.setScaleX(hj0Var2.W.getScaleX());
                    hj0Var2.X.setScaleY(hj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
