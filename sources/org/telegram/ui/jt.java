package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

public final class jt extends LinearLayout {

    public final org.telegram.ui.Components.n9 f39496a;

    public final org.telegram.ui.ActionBar.h5 f39497b;

    public final org.telegram.ui.ActionBar.c6 f39498c;
    public TLRPC.StickerSetCovered d;

    public jt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39498c = c6Var;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f39496a = n9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f39497b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(n9Var, h7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, h7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
