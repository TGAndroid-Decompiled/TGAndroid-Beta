package org.telegram.ui;

import android.view.View;
public final class b41 implements View.OnClickListener {
    public final int f37881a;
    public final f41 f37882b;

    public b41(f41 f41Var, int i10) {
        this.f37881a = i10;
        this.f37882b = f41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37881a) {
            case 0:
                f41 f41Var = this.f37882b;
                if (f41Var.Y == null) {
                    f41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f37882b.dismiss();
                return;
        }
    }
}
