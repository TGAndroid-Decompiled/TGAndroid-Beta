package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ai0 implements Runnable {
    public final int f32159a;
    public final vi0 f32160b;

    public ai0(vi0 vi0Var, int i10) {
        this.f32159a = i10;
        this.f32160b = vi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32159a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                vi0 vi0Var = this.f32160b;
                vi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = vi0Var.f38722i0;
                if (fVar != null) {
                    fVar.b(vi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ai0(vi0Var, 0));
                return;
            case 2:
                vh.f.f(false);
                vi0 vi0Var2 = this.f32160b;
                vh.f fVar2 = vi0Var2.f38722i0;
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
