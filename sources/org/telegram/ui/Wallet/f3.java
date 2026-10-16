package org.telegram.ui.Wallet;

import android.view.View;
public final class f3 implements View.OnClickListener {
    public final int f32894a;
    public final org.telegram.ui.ActionBar.e3 f32895b;

    public f3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f32894a = i10;
        this.f32895b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32894a) {
            case 0:
                this.f32895b.dismiss();
                return;
            default:
                this.f32895b.dismiss();
                return;
        }
    }
}
