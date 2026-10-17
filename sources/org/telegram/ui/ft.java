package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ft extends LinearLayout {
    public final org.telegram.ui.Components.w9 f37037a;
    public final org.telegram.ui.ActionBar.j5 f37038b;
    public final org.telegram.ui.ActionBar.d6 f37039c;
    public TLRPC.StickerSetCovered d;

    public ft(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f37039c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f37037a = w9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f37038b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
