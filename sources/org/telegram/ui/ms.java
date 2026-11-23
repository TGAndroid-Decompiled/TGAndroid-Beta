package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.p9 f50103a;
    public final org.telegram.ui.ActionBar.n5 f50104b;
    public final org.telegram.ui.ActionBar.i6 f50105c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f50105c = i6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f50103a = p9Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f50104b = n5Var;
        n5Var.setTextSize(16);
        n5Var.setTextColor(-1);
        setOrientation(0);
        addView(p9Var, c8.na.t(24, 24, 17, 17, 0, 17, 0));
        addView(n5Var, c8.na.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
