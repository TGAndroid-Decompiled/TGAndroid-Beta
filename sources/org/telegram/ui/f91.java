package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f91 implements View.OnClickListener {
    public final int f33671a;
    public final Context f33672b;
    public final org.telegram.ui.ActionBar.d6 f33673c;

    public f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33671a = i10;
        this.f33672b = context;
        this.f33673c = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33671a) {
            case 0:
                new yh.m7(this.f33672b, this.f33673c).show();
                return;
            case 1:
                new yh.m7(this.f33672b, this.f33673c).show();
                return;
            default:
                new yh.m7(this.f33672b, this.f33673c).show();
                return;
        }
    }
}
