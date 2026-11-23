package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class hs extends b51 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final gs T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int f35802a0;
    public int f35803b0;
    public boolean f35804c0;
    public boolean f35805d0;
    public boolean f35806e0;
    public int f35807f0;
    public int f35808g0;
    public String f35809h0;
    public final ds f35810i0;
    public boolean f35811j0;
    public final y2 f35812k0;

    public hs(ek0 ek0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(ek0Var, context, i7, 0, true, null, i6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f35810i0 = new ds(this, 0);
        this.f35811j0 = true;
        this.f35812k0 = new y2(this, 5);
        this.f33633w = new d(this, 9);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new gs(i7, new ds(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131754174, null), new di.a(this, i6Var, context)), true);
        O(false);
        org.telegram.messenger.ri.d0(i7).P0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f35809h0);
        ek0 ek0Var = this.d;
        if (!isEmpty) {
            if (this.f35806e0 && !this.f35804c0 && ek0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= ek0Var.getChildCount()) {
                        break;
                    } else if (ek0Var.getChildAt(i7) instanceof vz) {
                        if (this.f35806e0 && !this.f35804c0 && !TextUtils.isEmpty(this.f35809h0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f35811j0) {
                if (ek0Var != null) {
                    for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                        if (!(ek0Var.getChildAt(i10) instanceof vz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.f35811j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hs.X(boolean):void");
    }
}
