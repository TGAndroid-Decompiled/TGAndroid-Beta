package org.telegram.ui;

import android.view.View;
public final class qd implements View.OnClickListener {
    public final int f36396a;
    public final org.telegram.ui.ActionBar.f3 f36397b;

    public qd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f36396a = i10;
        this.f36397b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36396a) {
            case 0:
                this.f36397b.dismiss();
                return;
            default:
                this.f36397b.dismiss();
                return;
        }
    }
}
