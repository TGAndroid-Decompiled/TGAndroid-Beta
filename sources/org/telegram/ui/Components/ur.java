package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class ur extends m41 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final tr S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final SpannableStringBuilder Y;
    public int Z;
    public int f38732a0;
    public boolean f38733b0;
    public boolean f38734c0;
    public boolean f38735d0;
    public int f38736e0;
    public int f38737f0;
    public String f38738g0;
    public final qr f38739h0;
    public boolean f38740i0;
    public final r2 f38741j0;

    public ur(pj0 pj0Var, Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(pj0Var, context, i7, 0, true, null, h6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f38739h0 = new qr(this, 0);
        this.f38740i0 = true;
        this.f38741j0 = new r2(this, 3);
        this.f35847w = new d(this, 8);
        this.P = i7;
        this.Q = i10;
        this.R = z9;
        this.S = new tr(i7, new qr(this, 1));
        this.Y = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131754177, null), new bi.b(this, h6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f38738g0);
        pj0 pj0Var = this.d;
        if (!isEmpty) {
            if (this.f38735d0 && !this.f38733b0 && pj0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= pj0Var.getChildCount()) {
                        break;
                    } else if (pj0Var.getChildAt(i7) instanceof lz) {
                        if (this.f38735d0 && !this.f38733b0 && !TextUtils.isEmpty(this.f38738g0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f38740i0) {
                if (pj0Var != null) {
                    for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                        if (!(pj0Var.getChildAt(i10) instanceof lz)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        this.f38740i0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ur.X(boolean):void");
    }
}
