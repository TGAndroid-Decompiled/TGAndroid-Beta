package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.q9 f49946a;
    public final org.telegram.ui.ActionBar.n5 f49947b;
    public final org.telegram.ui.ActionBar.i6 f49948c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f49948c = i6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f49946a = q9Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49947b = n5Var;
        n5Var.setTextSize(16);
        n5Var.setTextColor(-1);
        setOrientation(0);
        addView(q9Var, c8.ma.t(24, 24, 17, 17, 0, 17, 0));
        addView(n5Var, c8.ma.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
