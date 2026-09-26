package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f33586a;
    public final Context f33587b;
    public final org.telegram.ui.ActionBar.d6 f33588c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33586a = i10;
        this.f33587b = context;
        this.f33588c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33586a) {
            case 0:
                new yh.m7(this.f33587b, this.f33588c).show();
                return;
            case 1:
                new yh.m7(this.f33587b, this.f33588c).show();
                return;
            default:
                new yh.m7(this.f33587b, this.f33588c).show();
                return;
        }
    }
}
