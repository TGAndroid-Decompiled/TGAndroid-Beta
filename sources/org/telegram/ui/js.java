package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class js extends LinearLayout {
    public final org.telegram.ui.Components.l9 f47030a;
    public final org.telegram.ui.ActionBar.k5 f47031b;
    public final org.telegram.ui.ActionBar.f6 f47032c;
    public TLRPC.StickerSetCovered d;

    public js(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47032c = f6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f47030a = l9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f47031b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(l9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
