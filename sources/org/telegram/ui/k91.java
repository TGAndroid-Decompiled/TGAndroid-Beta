package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k91 implements View.OnClickListener {
    public final int f35082a;
    public final Context f35083b;
    public final org.telegram.ui.ActionBar.e6 f35084c;

    public k91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35082a = i10;
        this.f35083b = context;
        this.f35084c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35082a) {
            case 0:
                new yh.o7(this.f35083b, this.f35084c).show();
                return;
            case 1:
                new yh.o7(this.f35083b, this.f35084c).show();
                return;
            default:
                new yh.o7(this.f35083b, this.f35084c).show();
                return;
        }
    }
}
