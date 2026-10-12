package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class q91 implements View.OnClickListener {
    public final int f41232a;
    public final Context f41233b;
    public final org.telegram.ui.ActionBar.c6 f41234c;

    public q91(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41232a = i10;
        this.f41233b = context;
        this.f41234c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41232a) {
            case 0:
                new yh.f7(this.f41233b, this.f41234c).show();
                return;
            case 1:
                new yh.f7(this.f41233b, this.f41234c).show();
                return;
            default:
                new yh.f7(this.f41233b, this.f41234c).show();
                return;
        }
    }
}
