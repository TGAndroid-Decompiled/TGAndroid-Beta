package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.q9 f49965a;
    public final org.telegram.ui.ActionBar.m5 f49966b;
    public final org.telegram.ui.ActionBar.h6 f49967c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f49967c = h6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f49965a = q9Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f49966b = m5Var;
        m5Var.setTextSize(16);
        m5Var.setTextColor(-1);
        setOrientation(0);
        addView(q9Var, c8.ma.t(24, 24, 17, 17, 0, 17, 0));
        addView(m5Var, c8.ma.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
