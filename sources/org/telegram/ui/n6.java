package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class n6 extends j6 {
    public final x6 d;

    public n6(x6 x6Var, Context context) {
        super(context);
        this.d = x6Var;
        ((ViewGroup.MarginLayoutParams) this.f38891a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f38891a.setOnClickListener(new a(this, 6));
    }
}
