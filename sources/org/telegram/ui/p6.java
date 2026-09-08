package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p6 extends l6 {
    public final z6 d;

    public p6(z6 z6Var, Context context) {
        super(context);
        this.d = z6Var;
        ((ViewGroup.MarginLayoutParams) this.f38222a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f38222a.setOnClickListener(new a(this, 6));
    }
}
