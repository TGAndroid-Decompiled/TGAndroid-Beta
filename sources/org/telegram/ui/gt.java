package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.o9 f38601a;
    public final org.telegram.ui.ActionBar.h5 f38602b;
    public final org.telegram.ui.ActionBar.b6 f38603c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f38603c = b6Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f38601a = o9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f38602b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(o9Var, g7.e6.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, g7.e6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
