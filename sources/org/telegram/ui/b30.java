package org.telegram.ui;

import android.content.DialogInterface;
public final class b30 implements DialogInterface.OnDismissListener {
    public final int f32044a;
    public final k60 f32045b;

    public b30(k60 k60Var, int i10) {
        this.f32044a = i10;
        this.f32045b = k60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32044a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f32045b.f35112x0 && (U instanceof bo)) {
                    ((bo) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f32045b.dismiss();
                return;
            case 2:
                this.f32045b.E1 = null;
                return;
            default:
                this.f32045b.f35085r0 = null;
                return;
        }
    }
}
