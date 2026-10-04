package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h91 implements View.OnClickListener {
    public final int f37009a;
    public final Context f37010b;
    public final org.telegram.ui.ActionBar.d6 f37011c;

    public h91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37009a = i10;
        this.f37010b = context;
        this.f37011c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37009a) {
            case 0:
                new yh.n7(this.f37010b, this.f37011c).show();
                return;
            case 1:
                new yh.n7(this.f37010b, this.f37011c).show();
                return;
            default:
                new yh.n7(this.f37010b, this.f37011c).show();
                return;
        }
    }
}
