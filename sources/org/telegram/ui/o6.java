package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class o6 extends k6 {
    public final x6 d;

    public o6(x6 x6Var, Context context) {
        super(context);
        this.d = x6Var;
        ((ViewGroup.MarginLayoutParams) this.f39758a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f39758a.setOnClickListener(new a(this, 6));
    }
}
