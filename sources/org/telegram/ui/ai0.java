package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ai0 implements Runnable {
    public final int f32593a;
    public final ui0 f32594b;
    public final EditText f32595c;

    public ai0(ui0 ui0Var, EditText editText, int i10) {
        this.f32593a = i10;
        this.f32594b = ui0Var;
        this.f32595c = editText;
    }

    @Override
    public final void run() {
        switch (this.f32593a) {
            case 0:
                ui0 ui0Var = this.f32594b;
                if (!ui0Var.m0) {
                    try {
                        Window window = ui0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ui0Var.m0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ai0(ui0Var, this.f32595c, 1), 100L);
                return;
            default:
                ui0 ui0Var2 = this.f32594b;
                int[] iArr = ui0Var2.f38840l0;
                AndroidUtilities.showKeyboard(this.f32595c);
                org.telegram.ui.Components.lg lgVar = ui0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ui0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = ui0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    ui0Var2.U.setScaleX(ui0Var2.T.getScaleX());
                    ui0Var2.U.setScaleY(ui0Var2.T.getScaleY());
                    return;
                }
                return;
        }
    }
}
