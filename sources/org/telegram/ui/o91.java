package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o91 implements View.OnClickListener {
    public final int f40445a;
    public final Context f40446b;
    public final org.telegram.ui.ActionBar.e6 f40447c;

    public o91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f40445a = i10;
        this.f40446b = context;
        this.f40447c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40445a) {
            case 0:
                new yh.f7(this.f40446b, this.f40447c).show();
                return;
            case 1:
                new yh.f7(this.f40446b, this.f40447c).show();
                return;
            default:
                new yh.f7(this.f40446b, this.f40447c).show();
                return;
        }
    }
}
