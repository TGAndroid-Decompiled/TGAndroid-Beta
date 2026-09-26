package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class o6 extends k6 {
    public final z6 d;

    public o6(z6 z6Var, Context context) {
        super(context);
        this.d = z6Var;
        ((ViewGroup.MarginLayoutParams) this.f34944a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f34944a.setOnClickListener(new a(this, 6));
    }
}
