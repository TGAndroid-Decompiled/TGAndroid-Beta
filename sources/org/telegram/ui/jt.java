package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class jt extends LinearLayout {
    public final org.telegram.ui.Components.g9 f38537a;
    public final org.telegram.ui.ActionBar.u5 f38538b;
    public final org.telegram.ui.ActionBar.p6 f38539c;
    public TLRPC.StickerSetCovered d;

    public jt(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f38539c = p6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f38537a = g9Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f38538b = u5Var;
        u5Var.setTextSize(16);
        u5Var.setTextColor(-1);
        setOrientation(0);
        addView(g9Var, w7.b6.t(24, 24, 17, 17, 0, 17, 0));
        addView(u5Var, w7.b6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
