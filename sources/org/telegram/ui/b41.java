package org.telegram.ui;

import android.view.View;
public final class b41 implements View.OnClickListener {
    public final int f36682a;
    public final f41 f36683b;

    public b41(f41 f41Var, int i10) {
        this.f36682a = i10;
        this.f36683b = f41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36682a) {
            case 0:
                f41 f41Var = this.f36683b;
                if (f41Var.U == null) {
                    f41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f36683b.dismiss();
                return;
        }
    }
}
