package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class p6 extends l6 {
    public final x6 d;

    public p6(x6 x6Var, Context context) {
        super(context);
        this.d = x6Var;
        ((ViewGroup.MarginLayoutParams) this.f49482a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.f49482a.setOnClickListener(new a(this, 5));
    }
}
