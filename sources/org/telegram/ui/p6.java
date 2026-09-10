package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p6 extends l6 {
    public final y6 d;

    public p6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.f34543a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f34543a.setOnClickListener(new a(this, 6));
    }
}
