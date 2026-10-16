package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class mi0 implements Runnable {
    public final int f38017a;
    public final gj0 f38018b;
    public final EditText f38019c;

    public mi0(gj0 gj0Var, EditText editText, int i10) {
        this.f38017a = i10;
        this.f38018b = gj0Var;
        this.f38019c = editText;
    }

    @Override
    public final void run() {
        switch (this.f38017a) {
            case 0:
                gj0 gj0Var = this.f38018b;
                if (!gj0Var.f36251p0) {
                    try {
                        Window window = gj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        gj0Var.f36251p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new mi0(gj0Var, this.f38019c, 1), 100L);
                return;
            default:
                gj0 gj0Var2 = this.f38018b;
                int[] iArr = gj0Var2.f36250o0;
                AndroidUtilities.showKeyboard(this.f38019c);
                org.telegram.ui.Components.wg wgVar = gj0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = gj0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = gj0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.sk.D(6.0f, width - wgVar2.m(), i10);
                    gj0Var2.X.setScaleX(gj0Var2.W.getScaleX());
                    gj0Var2.X.setScaleY(gj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
