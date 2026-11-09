package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.g6 f46261a;
    public final org.telegram.ui.Components.bg0 f46262b;
    public TLRPC.Chat f46263c;

    public h9(Context context) {
        super(context);
        int i7;
        int L;
        String M0 = org.telegram.messenger.id.M0(2131743442, null);
        org.telegram.ui.Components.bg0 bg0Var = new org.telegram.ui.Components.bg0(context);
        this.f46262b = bg0Var;
        int ceil = (int) Math.ceil(bg0Var.getPaint().measureText(M0));
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.f46261a = g6Var;
        g6Var.M0 = true;
        g6Var.E0 = true;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = org.telegram.messenger.g0.L(44.0f) + ceil;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.id.f23157a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(44.0f) + ceil;
        }
        g6Var.setPadding(i7, 0, L, 0);
        g6Var.f29152b0 = 0;
        g6Var.f29153c0 = -org.telegram.messenger.g0.L(4.0f);
        addView(g6Var, c8.ha.c(-1.0f, -1));
        bg0Var.setText(M0);
        bg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(bg0Var, org.telegram.ui.ActionBar.l6.Gi, null);
        bg0Var.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
        int i10 = org.telegram.ui.ActionBar.l6.Vl;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
        bg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(x02, 16.0f));
        Drawable background = bg0Var.getBackground();
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        bg0Var.setBackground(background);
        org.telegram.ui.ActionBar.s6.j(bg0Var, background, M, null, null);
        bg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(bg0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f46262b.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
