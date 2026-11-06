package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class js extends LinearLayout {
    public final org.telegram.ui.Components.l9 f47031a;
    public final org.telegram.ui.ActionBar.k5 f47032b;
    public final org.telegram.ui.ActionBar.f6 f47033c;
    public TLRPC.StickerSetCovered d;

    public js(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47033c = f6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f47031a = l9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f47032b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(l9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
