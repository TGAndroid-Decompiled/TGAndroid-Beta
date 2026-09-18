package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class q6 extends m6 {
    public final a7 d;

    public q6(a7 a7Var, Context context) {
        super(context);
        this.d = a7Var;
        ((ViewGroup.MarginLayoutParams) this.f35695a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f35695a.setOnClickListener(new a(this, 6));
    }
}
