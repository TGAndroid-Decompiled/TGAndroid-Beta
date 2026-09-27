package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class g91 implements View.OnClickListener {
    public final int f33881a;
    public final Context f33882b;
    public final org.telegram.ui.ActionBar.e6 f33883c;

    public g91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33881a = i10;
        this.f33882b = context;
        this.f33883c = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33881a) {
            case 0:
                new yh.l7(this.f33882b, this.f33883c).show();
                return;
            case 1:
                new yh.l7(this.f33882b, this.f33883c).show();
                return;
            default:
                new yh.l7(this.f33882b, this.f33883c).show();
                return;
        }
    }
}
