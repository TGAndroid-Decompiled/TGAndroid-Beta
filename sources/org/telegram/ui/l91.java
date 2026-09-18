package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l91 implements View.OnClickListener {
    public final int f35312a;
    public final Context f35313b;
    public final org.telegram.ui.ActionBar.e6 f35314c;

    public l91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35312a = i10;
        this.f35313b = context;
        this.f35314c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35312a) {
            case 0:
                new yh.l7(this.f35313b, this.f35314c).show();
                return;
            case 1:
                new yh.l7(this.f35313b, this.f35314c).show();
                return;
            default:
                new yh.l7(this.f35313b, this.f35314c).show();
                return;
        }
    }
}
