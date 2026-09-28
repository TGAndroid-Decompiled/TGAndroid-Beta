package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ai0 implements Runnable {
    public final int f32174a;
    public final vi0 f32175b;

    public ai0(vi0 vi0Var, int i10) {
        this.f32174a = i10;
        this.f32175b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32174a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                vi0 vi0Var = this.f32175b;
                vi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = vi0Var.f38739i0;
                if (fVar != null) {
                    fVar.b(vi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ai0(vi0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                vi0 vi0Var2 = this.f32175b;
                vh.f fVar2 = vi0Var2.f38739i0;
                if (fVar2 != null) {
                    fVar2.b(vi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ai0(vi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
