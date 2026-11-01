package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f51 implements View.OnClickListener {
    public final int f37002a;
    public final Context f37003b;
    public final org.telegram.ui.ActionBar.p6 f37004c;

    public f51(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f37002a = i10;
        this.f37003b = context;
        this.f37004c = p6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37002a) {
            case 0:
                new rh.y7(this.f37003b, this.f37004c).show();
                return;
            case 1:
                new rh.y7(this.f37003b, this.f37004c).show();
                return;
            default:
                new rh.y7(this.f37003b, this.f37004c).show();
                return;
        }
    }
}
