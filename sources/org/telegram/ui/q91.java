package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class q91 implements View.OnClickListener {
    public final int f41228a;
    public final Context f41229b;
    public final org.telegram.ui.ActionBar.c6 f41230c;

    public q91(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41228a = i10;
        this.f41229b = context;
        this.f41230c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41228a) {
            case 0:
                new yh.f7(this.f41229b, this.f41230c).show();
                return;
            case 1:
                new yh.f7(this.f41229b, this.f41230c).show();
                return;
            default:
                new yh.f7(this.f41229b, this.f41230c).show();
                return;
        }
    }
}
