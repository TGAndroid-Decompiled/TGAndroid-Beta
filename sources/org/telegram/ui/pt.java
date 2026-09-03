package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class pt extends LinearLayout {
    public final org.telegram.ui.Components.p9 f40123a;
    public final org.telegram.ui.ActionBar.l5 f40124b;
    public final org.telegram.ui.ActionBar.g6 f40125c;
    public TLRPC.StickerSetCovered d;

    public pt(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f40125c = g6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f40123a = p9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f40124b = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(-1);
        setOrientation(0);
        addView(p9Var, k7.c6.t(24, 24, 17, 17, 0, 17, 0));
        addView(l5Var, k7.c6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
