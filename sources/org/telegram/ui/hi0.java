package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class hi0 implements Runnable {
    public final int f34299a;
    public final bj0 f34300b;
    public final EditText f34301c;

    public hi0(bj0 bj0Var, EditText editText, int i10) {
        this.f34299a = i10;
        this.f34300b = bj0Var;
        this.f34301c = editText;
    }

    @Override
    public final void run() {
        switch (this.f34299a) {
            case 0:
                bj0 bj0Var = this.f34300b;
                if (!bj0Var.f32192p0) {
                    try {
                        Window window = bj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        bj0Var.f32192p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new hi0(bj0Var, this.f34301c, 1), 100L);
                return;
            default:
                bj0 bj0Var2 = this.f34300b;
                int[] iArr = bj0Var2.f32191o0;
                AndroidUtilities.showKeyboard(this.f34301c);
                org.telegram.ui.Components.tg tgVar = bj0Var2.W;
                if (tgVar != null) {
                    tgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = bj0Var2.W.getWidth();
                    org.telegram.ui.Components.tg tgVar2 = bj0Var2.W;
                    tgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.vl.D(6.0f, width - tgVar2.m(), i10);
                    bj0Var2.X.setScaleX(bj0Var2.W.getScaleX());
                    bj0Var2.X.setScaleY(bj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
