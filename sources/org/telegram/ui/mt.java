package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class mt extends LinearLayout {
    public final org.telegram.ui.Components.w9 f35650a;
    public final org.telegram.ui.ActionBar.h5 f35651b;
    public final org.telegram.ui.ActionBar.d6 f35652c;
    public TLRPC.StickerSetCovered d;

    public mt(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35652c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f35650a = w9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f35651b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.y5.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, w7.y5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
