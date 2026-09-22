package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l91 implements View.OnClickListener {
    public final int f35361a;
    public final Context f35362b;
    public final org.telegram.ui.ActionBar.e6 f35363c;

    public l91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35361a = i10;
        this.f35362b = context;
        this.f35363c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35361a) {
            case 0:
                new yh.n7(this.f35362b, this.f35363c).show();
                return;
            case 1:
                new yh.n7(this.f35362b, this.f35363c).show();
                return;
            default:
                new yh.n7(this.f35362b, this.f35363c).show();
                return;
        }
    }
}
