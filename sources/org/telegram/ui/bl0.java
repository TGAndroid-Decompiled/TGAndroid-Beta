package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class bl0 extends FrameLayout {

    public final org.telegram.ui.Components.ri0 f36850a;

    public bl0(Context context) {
        super(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f36850a = ri0Var;
        ri0Var.setOnClickListener(new u50(this, 14));
        int iDp = AndroidUtilities.dp(120.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp, iDp);
        layoutParams.gravity = 1;
        addView(ri0Var, layoutParams);
        setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
        setLayoutParams(new f2.y0(-1, -2));
    }
}
