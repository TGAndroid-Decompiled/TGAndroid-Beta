package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.f6 f47638a;
    public final org.telegram.ui.Components.dg0 f47639b;
    public TLRPC.Chat f47640c;

    public h9(Context context) {
        super(context);
        int i7;
        int L;
        String M0 = org.telegram.messenger.hd.M0(2131743442, null);
        org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
        this.f47639b = dg0Var;
        int ceil = (int) Math.ceil(dg0Var.getPaint().measureText(M0));
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.f47638a = f6Var;
        f6Var.N0 = true;
        f6Var.F0 = true;
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = org.telegram.messenger.g0.L(44.0f) + ceil;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.hd.f24104a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(44.0f) + ceil;
        }
        f6Var.setPadding(i7, 0, L, 0);
        f6Var.f30241c0 = 0;
        f6Var.f30242d0 = -org.telegram.messenger.g0.L(4.0f);
        addView(f6Var, c8.ja.c(-1.0f, -1));
        dg0Var.setText(M0);
        dg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
        dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
        int i10 = org.telegram.ui.ActionBar.j6.Yl;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 16.0f));
        Drawable background = dg0Var.getBackground();
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        dg0Var.setBackground(background);
        org.telegram.ui.ActionBar.q6.j(dg0Var, background, M, null, null);
        dg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(dg0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f47639b.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
