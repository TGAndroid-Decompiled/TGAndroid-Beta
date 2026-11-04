package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class hs extends LinearLayout {
    public final org.telegram.ui.Components.k9 f45969a;
    public final org.telegram.ui.ActionBar.k5 f45970b;
    public final org.telegram.ui.ActionBar.e6 f45971c;
    public TLRPC.StickerSetCovered d;

    public hs(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f45971c = e6Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f45969a = k9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f45970b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(k9Var, b8.mf.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, b8.mf.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
