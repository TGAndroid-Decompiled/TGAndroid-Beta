package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f33587a;
    public final Context f33588b;
    public final org.telegram.ui.ActionBar.d6 f33589c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33587a = i10;
        this.f33588b = context;
        this.f33589c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33587a) {
            case 0:
                new yh.m7(this.f33588b, this.f33589c).show();
                return;
            case 1:
                new yh.m7(this.f33588b, this.f33589c).show();
                return;
            default:
                new yh.m7(this.f33588b, this.f33589c).show();
                return;
        }
    }
}
