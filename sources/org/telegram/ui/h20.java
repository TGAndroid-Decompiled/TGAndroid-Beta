package org.telegram.ui;

import android.content.DialogInterface;

public final class h20 implements DialogInterface.OnDismissListener {

    public final int f38661a;

    public final s50 f38662b;

    public h20(s50 s50Var, int i10) {
        this.f38661a = i10;
        this.f38662b = s50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38661a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (this.f38662b.f42489t0 && (n2VarU instanceof rn)) {
                    ((rn) n2VarU).T9(true, true);
                    break;
                }
                break;
            case 1:
                this.f38662b.dismiss();
                break;
            case 2:
                this.f38662b.A1 = null;
                break;
            default:
                this.f38662b.f42463n0 = null;
                break;
        }
    }
}
