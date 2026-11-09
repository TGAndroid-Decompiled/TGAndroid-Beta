package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ls extends LinearLayout {
    public final org.telegram.ui.Components.l9 f47671a;
    public final org.telegram.ui.ActionBar.l5 f47672b;
    public final org.telegram.ui.ActionBar.g6 f47673c;
    public TLRPC.StickerSetCovered d;

    public ls(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f47673c = g6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f47671a = l9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f47672b = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(-1);
        setOrientation(0);
        addView(l9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(l5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
