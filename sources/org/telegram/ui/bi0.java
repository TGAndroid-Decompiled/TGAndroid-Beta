package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bi0 implements Runnable {
    public final int f32504a;
    public final vi0 f32505b;
    public final EditText f32506c;

    public bi0(vi0 vi0Var, EditText editText, int i10) {
        this.f32504a = i10;
        this.f32505b = vi0Var;
        this.f32506c = editText;
    }

    @Override
    public final void run() {
        switch (this.f32504a) {
            case 0:
                vi0 vi0Var = this.f32505b;
                if (!vi0Var.f38835p0) {
                    try {
                        Window window = vi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        vi0Var.f38835p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new bi0(vi0Var, this.f32506c, 1), 100L);
                return;
            default:
                vi0 vi0Var2 = this.f32505b;
                int[] iArr = vi0Var2.f38834o0;
                AndroidUtilities.showKeyboard(this.f32506c);
                org.telegram.ui.Components.wg wgVar = vi0Var2.W;
                if (wgVar != null) {
                    wgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = vi0Var2.W.getWidth();
                    org.telegram.ui.Components.wg wgVar2 = vi0Var2.W;
                    wgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ok.D(6.0f, width - wgVar2.m(), i10);
                    vi0Var2.X.setScaleX(vi0Var2.W.getScaleX());
                    vi0Var2.X.setScaleY(vi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
