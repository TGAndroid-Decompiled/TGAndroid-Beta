package org.telegram.ui;

import android.view.View;
public final class nd implements View.OnClickListener {
    public final int f40699a;
    public final org.telegram.ui.ActionBar.f3 f40700b;

    public nd(org.telegram.ui.ActionBar.f3 f3Var, int i9) {
        this.f40699a = i9;
        this.f40700b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40699a) {
            case 0:
                this.f40700b.dismiss();
                return;
            default:
                this.f40700b.dismiss();
                return;
        }
    }
}
