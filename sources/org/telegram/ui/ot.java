package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ot extends LinearLayout {
    public final org.telegram.ui.Components.w9 f35953a;
    public final org.telegram.ui.ActionBar.i5 f35954b;
    public final org.telegram.ui.ActionBar.d6 f35955c;
    public TLRPC.StickerSetCovered d;

    public ot(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35955c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f35953a = w9Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f35954b = i5Var;
        i5Var.setTextSize(16);
        i5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(i5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
