package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class g9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Cells.f6 f45604a;
    public final org.telegram.ui.Components.dg0 f45605b;
    public TLRPC.Chat f45606c;

    public g9(Context context) {
        super(context);
        int i3;
        int L;
        String M0 = org.telegram.messenger.bd.M0(2131743452, null);
        org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(context);
        this.f45605b = dg0Var;
        int ceil = (int) Math.ceil(dg0Var.getPaint().measureText(M0));
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.f45604a = f6Var;
        f6Var.N0 = true;
        f6Var.F0 = true;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(44.0f) + ceil;
        } else {
            i3 = 0;
        }
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(44.0f) + ceil;
        }
        f6Var.setPadding(i3, 0, L, 0);
        f6Var.f29182c0 = 0;
        f6Var.f29183d0 = -org.telegram.messenger.g0.L(4.0f);
        addView(f6Var, b8.mf.c(-1.0f, -1));
        dg0Var.setText(M0);
        dg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
        dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
        int i10 = org.telegram.ui.ActionBar.k6.Vl;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        dg0Var.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 16.0f));
        Drawable background = dg0Var.getBackground();
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        dg0Var.setBackground(background);
        org.telegram.ui.ActionBar.r6.k(dg0Var, background, N, null, null);
        dg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(dg0Var, b8.mf.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f45605b.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
