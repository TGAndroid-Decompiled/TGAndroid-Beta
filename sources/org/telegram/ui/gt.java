package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.t9 f38657a;
    public final org.telegram.ui.ActionBar.h5 f38658b;
    public final org.telegram.ui.ActionBar.c6 f38659c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38659c = c6Var;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f38657a = t9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f38658b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(t9Var, i7.f6.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, i7.f6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
