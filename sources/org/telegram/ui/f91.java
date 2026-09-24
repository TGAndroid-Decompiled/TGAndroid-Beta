package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f33571a;
    public final Context f33572b;
    public final org.telegram.ui.ActionBar.d6 f33573c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33571a = i10;
        this.f33572b = context;
        this.f33573c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33571a) {
            case 0:
                new yh.m7(this.f33572b, this.f33573c).show();
                return;
            case 1:
                new yh.m7(this.f33572b, this.f33573c).show();
                return;
            default:
                new yh.m7(this.f33572b, this.f33573c).show();
                return;
        }
    }
}
