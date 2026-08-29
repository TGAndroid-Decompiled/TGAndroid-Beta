package org.telegram.ui;

import android.view.View;
public final class md implements View.OnClickListener {
    public final int f40526a;
    public final org.telegram.ui.ActionBar.f3 f40527b;

    public md(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f40526a = i10;
        this.f40527b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40526a) {
            case 0:
                this.f40527b.dismiss();
                return;
            default:
                this.f40527b.dismiss();
                return;
        }
    }
}
