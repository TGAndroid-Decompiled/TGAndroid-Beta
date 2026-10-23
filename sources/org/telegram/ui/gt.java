package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.w9 f37659a;
    public final org.telegram.ui.ActionBar.n5 f37660b;
    public final org.telegram.ui.ActionBar.g6 f37661c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37661c = g6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f37659a = w9Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f37660b = n5Var;
        n5Var.setTextSize(16);
        n5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(n5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
