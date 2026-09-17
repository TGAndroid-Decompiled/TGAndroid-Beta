package org.telegram.ui;

import android.content.DialogInterface;
public final class b30 implements DialogInterface.OnDismissListener {
    public final int f32040a;
    public final k60 f32041b;

    public b30(k60 k60Var, int i10) {
        this.f32040a = i10;
        this.f32041b = k60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32040a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f32041b.f35107x0 && (U instanceof bo)) {
                    ((bo) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f32041b.dismiss();
                return;
            case 2:
                this.f32041b.E1 = null;
                return;
            default:
                this.f32041b.f35080r0 = null;
                return;
        }
    }
}
