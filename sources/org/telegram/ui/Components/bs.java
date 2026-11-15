package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class bs extends p41 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final as T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int f33355a0;
    public int f33356b0;
    public boolean f33357c0;
    public boolean f33358d0;
    public boolean f33359e0;
    public int f33360f0;
    public int f33361g0;
    public String f33362h0;
    public final xr f33363i0;
    public boolean f33364j0;
    public final q2 f33365k0;

    public bs(uj0 uj0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(uj0Var, context, i7, 0, true, null, e6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f33363i0 = new xr(this, 0);
        this.f33364j0 = true;
        this.f33365k0 = new q2(this, 5);
        this.f38203w = new d(this, 8);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new as(i7, new xr(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754177, null), new di.a(this, e6Var, context)), true);
        O(false);
        org.telegram.messenger.si.b0(i7).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f33362h0);
        uj0 uj0Var = this.d;
        if (!isEmpty) {
            if (this.f33359e0 && !this.f33357c0 && uj0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= uj0Var.getChildCount()) {
                        break;
                    } else if (uj0Var.getChildAt(i7) instanceof pz) {
                        if (this.f33359e0 && !this.f33357c0 && !TextUtils.isEmpty(this.f33362h0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f33364j0) {
                if (uj0Var != null) {
                    for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                        if (!(uj0Var.getChildAt(i10) instanceof pz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.f33364j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bs.X(boolean):void");
    }
}
