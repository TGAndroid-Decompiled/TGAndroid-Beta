package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h91 implements View.OnClickListener {
    public final int f37014a;
    public final Context f37015b;
    public final org.telegram.ui.ActionBar.d6 f37016c;

    public h91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37014a = i10;
        this.f37015b = context;
        this.f37016c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37014a) {
            case 0:
                new yh.n7(this.f37015b, this.f37016c).show();
                return;
            case 1:
                new yh.n7(this.f37015b, this.f37016c).show();
                return;
            default:
                new yh.n7(this.f37015b, this.f37016c).show();
                return;
        }
    }
}
