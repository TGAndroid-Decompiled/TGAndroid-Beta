package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class dt extends LinearLayout {
    public final org.telegram.ui.Components.w9 f36448a;
    public final org.telegram.ui.ActionBar.j5 f36449b;
    public final org.telegram.ui.ActionBar.d6 f36450c;
    public TLRPC.StickerSetCovered d;

    public dt(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f36450c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f36448a = w9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36449b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
