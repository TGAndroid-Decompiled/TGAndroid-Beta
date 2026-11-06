package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class vr extends k41 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final ur S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final SpannableStringBuilder Y;
    public int Z;
    public int f39649a0;
    public boolean f39650b0;
    public boolean f39651c0;
    public boolean f39652d0;
    public int f39653e0;
    public int f39654f0;
    public String f39655g0;
    public final rr f39656h0;
    public boolean f39657i0;
    public final s2 f39658j0;

    public vr(pj0 pj0Var, Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(pj0Var, context, i7, 0, true, null, f6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f39656h0 = new rr(this, 0);
        this.f39657i0 = true;
        this.f39658j0 = new s2(this, 3);
        this.f35134w = new d(this, 8);
        this.P = i7;
        this.Q = i10;
        this.R = z9;
        this.S = new ur(i7, new rr(this, 1));
        this.Y = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754177, null), new bi.b(this, f6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f39655g0);
        pj0 pj0Var = this.d;
        if (!isEmpty) {
            if (this.f39652d0 && !this.f39650b0 && pj0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= pj0Var.getChildCount()) {
                        break;
                    } else if (pj0Var.getChildAt(i7) instanceof lz) {
                        if (this.f39652d0 && !this.f39650b0 && !TextUtils.isEmpty(this.f39655g0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f39657i0) {
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
        this.f39657i0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr.X(boolean):void");
    }
}
