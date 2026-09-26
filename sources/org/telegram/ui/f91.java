package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f33585a;
    public final Context f33586b;
    public final org.telegram.ui.ActionBar.d6 f33587c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33585a = i10;
        this.f33586b = context;
        this.f33587c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33585a) {
            case 0:
                new yh.m7(this.f33586b, this.f33587c).show();
                return;
            case 1:
                new yh.m7(this.f33586b, this.f33587c).show();
                return;
            default:
                new yh.m7(this.f33586b, this.f33587c).show();
                return;
        }
    }
}
