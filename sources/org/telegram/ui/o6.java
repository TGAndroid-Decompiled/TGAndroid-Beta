package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class o6 extends j6 {
    public final y6 d;

    public o6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.f39380a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f39380a.setOnClickListener(new a(this, 6));
    }
}
