package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.k9 f48046a;
    public final org.telegram.ui.ActionBar.m5 f48047b;
    public final org.telegram.ui.ActionBar.h6 f48048c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f48048c = h6Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f48046a = k9Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f48047b = m5Var;
        m5Var.setTextSize(16);
        m5Var.setTextColor(-1);
        setOrientation(0);
        addView(k9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(m5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
