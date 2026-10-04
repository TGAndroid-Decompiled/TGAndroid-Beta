package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h91 implements View.OnClickListener {
    public final int f37008a;
    public final Context f37009b;
    public final org.telegram.ui.ActionBar.d6 f37010c;

    public h91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37008a = i10;
        this.f37009b = context;
        this.f37010c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37008a) {
            case 0:
                new yh.n7(this.f37009b, this.f37010c).show();
                return;
            case 1:
                new yh.n7(this.f37009b, this.f37010c).show();
                return;
            default:
                new yh.n7(this.f37009b, this.f37010c).show();
                return;
        }
    }
}
