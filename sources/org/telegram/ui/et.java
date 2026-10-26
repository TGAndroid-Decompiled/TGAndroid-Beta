package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class et extends LinearLayout {
    public final org.telegram.ui.Components.y9 f39177a;
    public final org.telegram.ui.ActionBar.b6 f39178b;
    public final org.telegram.ui.ActionBar.u6 f39179c;
    public TLRPC.StickerSetCovered d;

    public et(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f39179c = u6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f39177a = y9Var;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f39178b = b6Var;
        b6Var.setTextSize(16);
        b6Var.setTextColor(-1);
        setOrientation(0);
        addView(y9Var, org.telegram.ui.Components.gb1.x(24, 24, 17, 17, 0, 17, 0));
        addView(b6Var, org.telegram.ui.Components.gb1.x(-2, -2, 17, 0, 0, 12, 0));
    }
}
