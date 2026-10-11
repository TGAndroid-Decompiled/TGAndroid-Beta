package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class pt extends LinearLayout {
    public final org.telegram.ui.Components.y9 f40954a;
    public final org.telegram.ui.ActionBar.h5 f40955b;
    public final org.telegram.ui.ActionBar.d6 f40956c;
    public TLRPC.StickerSetCovered d;

    public pt(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f40956c = d6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f40954a = y9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f40955b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(y9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
