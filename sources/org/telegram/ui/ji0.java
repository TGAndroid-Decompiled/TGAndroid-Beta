package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ji0 implements Runnable {
    public final int f34896a;
    public final dj0 f34897b;
    public final EditText f34898c;

    public ji0(dj0 dj0Var, EditText editText, int i10) {
        this.f34896a = i10;
        this.f34897b = dj0Var;
        this.f34898c = editText;
    }

    @Override
    public final void run() {
        switch (this.f34896a) {
            case 0:
                dj0 dj0Var = this.f34897b;
                if (!dj0Var.f33158p0) {
                    try {
                        Window window = dj0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        dj0Var.f33158p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new ji0(dj0Var, this.f34898c, 1), 100L);
                return;
            default:
                dj0 dj0Var2 = this.f34897b;
                int[] iArr = dj0Var2.f33157o0;
                AndroidUtilities.showKeyboard(this.f34898c);
                org.telegram.ui.Components.tg tgVar = dj0Var2.W;
                if (tgVar != null) {
                    tgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = dj0Var2.W.getWidth();
                    org.telegram.ui.Components.tg tgVar2 = dj0Var2.W;
                    tgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.wl.D(6.0f, width - tgVar2.m(), i10);
                    dj0Var2.X.setScaleX(dj0Var2.W.getScaleX());
                    dj0Var2.X.setScaleY(dj0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
