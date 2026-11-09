package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class vr extends m41 {
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
    public int f39791a0;
    public boolean f39792b0;
    public boolean f39793c0;
    public boolean f39794d0;
    public int f39795e0;
    public int f39796f0;
    public String f39797g0;
    public final rr f39798h0;
    public boolean f39799i0;
    public final s2 f39800j0;

    public vr(qj0 qj0Var, Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(qj0Var, context, i7, 0, true, null, g6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f39798h0 = new rr(this, 0);
        this.f39799i0 = true;
        this.f39800j0 = new s2(this, 3);
        this.f35947w = new d(this, 8);
        this.P = i7;
        this.Q = i10;
        this.R = z9;
        this.S = new ur(i7, new rr(this, 1));
        this.Y = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131754177, null), new bi.b(this, g6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f39797g0);
        qj0 qj0Var = this.d;
        if (!isEmpty) {
            if (this.f39794d0 && !this.f39792b0 && qj0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= qj0Var.getChildCount()) {
                        break;
                    } else if (qj0Var.getChildAt(i7) instanceof mz) {
                        if (this.f39794d0 && !this.f39792b0 && !TextUtils.isEmpty(this.f39797g0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f39799i0) {
                if (qj0Var != null) {
                    for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
                        if (!(qj0Var.getChildAt(i10) instanceof mz)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        this.f39799i0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr.X(boolean):void");
    }
}
