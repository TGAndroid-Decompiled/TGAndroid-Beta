package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bi0 implements Runnable {
    public final int f32416a;
    public final vi0 f32417b;
    public final EditText f32418c;

    public bi0(vi0 vi0Var, EditText editText, int i10) {
        this.f32416a = i10;
        this.f32417b = vi0Var;
        this.f32418c = editText;
    }

    @Override
    public final void run() {
        switch (this.f32416a) {
            case 0:
                vi0 vi0Var = this.f32417b;
                if (!vi0Var.f38729p0) {
                    try {
                        Window window = vi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        vi0Var.f38729p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new bi0(vi0Var, this.f32418c, 1), 100L);
                return;
            default:
                vi0 vi0Var2 = this.f32417b;
                int[] iArr = vi0Var2.f38728o0;
                AndroidUtilities.showKeyboard(this.f32418c);
                org.telegram.ui.Components.vg vgVar = vi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = vi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = vi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ok.D(6.0f, width - vgVar2.m(), i10);
                    vi0Var2.X.setScaleX(vi0Var2.W.getScaleX());
                    vi0Var2.X.setScaleY(vi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
