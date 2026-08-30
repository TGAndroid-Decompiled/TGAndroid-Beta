package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ot extends LinearLayout {
    public final org.telegram.ui.Components.p9 f36975a;
    public final org.telegram.ui.ActionBar.k5 f36976b;
    public final org.telegram.ui.ActionBar.f6 f36977c;
    public TLRPC.StickerSetCovered d;

    public ot(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36977c = f6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f36975a = p9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f36976b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(p9Var, k7.b6.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, k7.b6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
