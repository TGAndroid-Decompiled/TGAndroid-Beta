package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h51 implements View.OnClickListener {
    public final int f37758a;
    public final Context f37759b;
    public final org.telegram.ui.ActionBar.p6 f37760c;

    public h51(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f37758a = i10;
        this.f37759b = context;
        this.f37760c = p6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37758a) {
            case 0:
                new rh.y7(this.f37759b, this.f37760c).show();
                return;
            case 1:
                new rh.y7(this.f37759b, this.f37760c).show();
                return;
            default:
                new rh.y7(this.f37759b, this.f37760c).show();
                return;
        }
    }
}
