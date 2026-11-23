package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.g6 f48750a;
    public final org.telegram.ui.Components.og0 f48751b;
    public TLRPC.Chat f48752c;

    public i9(Context context) {
        super(context);
        int i7;
        int L;
        String N0 = org.telegram.messenger.gd.N0(2131743192, null);
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(context);
        this.f48751b = og0Var;
        int ceil = (int) Math.ceil(og0Var.getPaint().measureText(N0));
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.f48750a = g6Var;
        g6Var.N0 = true;
        g6Var.F0 = true;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = org.telegram.messenger.g0.L(44.0f) + ceil;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.gd.f24314a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(44.0f) + ceil;
        }
        g6Var.setPadding(i7, 0, L, 0);
        g6Var.f30762c0 = 0;
        g6Var.f30763d0 = -org.telegram.messenger.g0.L(4.0f);
        addView(g6Var, c8.na.c(-1.0f, -1));
        og0Var.setText(N0);
        og0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, null);
        og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
        int i10 = org.telegram.ui.ActionBar.n6.Yl;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        og0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 16.0f));
        Drawable background = og0Var.getBackground();
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        og0Var.setBackground(background);
        org.telegram.ui.ActionBar.u6.j(og0Var, background, M, null, null);
        og0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(og0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f48751b.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
