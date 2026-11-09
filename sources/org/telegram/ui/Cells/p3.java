package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class p3 extends x31 {
    public static final int f29738b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q3 q3Var = (q3) view;
        q3Var.a((TLRPC.StickerSetCovered) y31Var.G, z9, y31Var.f40576t, false);
        q3Var.f30122f.a(y31Var.f40576t, false);
        q3Var.setAddOnClickListener(y31Var.D);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q3(context, g6Var);
    }
}
