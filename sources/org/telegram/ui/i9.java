package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.k6 f37978a;
    public final org.telegram.ui.Components.dh0 f37979b;
    public TLRPC.Chat f37980c;

    public i9(Context context) {
        super(context);
        int i10;
        int L;
        String L0 = org.telegram.messenger.dd.L0(2131743468, null);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.f37979b = dh0Var;
        int ceil = (int) Math.ceil(dh0Var.getPaint().measureText(L0));
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f37978a = k6Var;
        k6Var.M0 = true;
        k6Var.E0 = true;
        if (org.telegram.messenger.dd.X) {
            i10 = org.telegram.messenger.i0.L(44.0f) + ceil;
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.dd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(44.0f) + ceil;
        }
        k6Var.setPadding(i10, 0, L, 0);
        k6Var.f22125b0 = 0;
        k6Var.f22126c0 = -org.telegram.messenger.i0.L(4.0f);
        addView(k6Var, w7.b6.c(-1.0f, -1));
        dh0Var.setText(L0);
        dh0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
        int i11 = org.telegram.ui.ActionBar.t6.Vl;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        dh0Var.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 16.0f));
        Drawable background = dh0Var.getBackground();
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        dh0Var.setBackground(background);
        org.telegram.ui.ActionBar.a7.k(dh0Var, background, N, null, null);
        dh0Var.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        addView(dh0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.f37979b.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
