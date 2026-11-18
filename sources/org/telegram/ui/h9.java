package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h9 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.h6 f48218a;
    public final org.telegram.ui.Components.ng0 f48219b;
    public TLRPC.Chat f48220c;

    public h9(Context context) {
        super(context);
        int i7;
        int L;
        String M0 = org.telegram.messenger.gd.M0(2131743205, null);
        org.telegram.ui.Components.ng0 ng0Var = new org.telegram.ui.Components.ng0(context);
        this.f48219b = ng0Var;
        int ceil = (int) Math.ceil(ng0Var.getPaint().measureText(M0));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.f48218a = h6Var;
        h6Var.N0 = true;
        h6Var.F0 = true;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = org.telegram.messenger.g0.L(44.0f) + ceil;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.gd.f24213a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(44.0f) + ceil;
        }
        h6Var.setPadding(i7, 0, L, 0);
        h6Var.f30705c0 = 0;
        h6Var.f30706d0 = -org.telegram.messenger.g0.L(4.0f);
        addView(h6Var, c8.ma.c(-1.0f, -1));
        ng0Var.setText(M0);
        ng0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(ng0Var, org.telegram.ui.ActionBar.n6.Ji, null);
        ng0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
        int i10 = org.telegram.ui.ActionBar.n6.Yl;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        ng0Var.setBackground(org.telegram.ui.ActionBar.b6.e(x02, 16.0f));
        Drawable background = ng0Var.getBackground();
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        ng0Var.setBackground(background);
        org.telegram.ui.ActionBar.u6.j(ng0Var, background, M, null, null);
        ng0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(ng0Var, c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f48219b.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
