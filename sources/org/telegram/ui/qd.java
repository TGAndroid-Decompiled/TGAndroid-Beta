package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f41151a;
    public final org.telegram.ui.ActionBar.e3 f41152b;

    public qd(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f41151a = i10;
        this.f41152b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41151a) {
            case 0:
                this.f41152b.dismiss();
                return;
            default:
                this.f41152b.dismiss();
                return;
        }
    }
}
