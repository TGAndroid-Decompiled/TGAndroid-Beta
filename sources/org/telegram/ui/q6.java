package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class q6 extends l6 {
    public final y6 d;

    public q6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.f47420a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.f47420a.setOnClickListener(new a(this, 5));
    }
}
