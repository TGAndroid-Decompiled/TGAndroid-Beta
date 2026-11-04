package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class vr extends f41 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final ur T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int f39769a0;
    public int f39770b0;
    public boolean f39771c0;
    public boolean f39772d0;
    public boolean f39773e0;
    public int f39774f0;
    public int f39775g0;
    public String f39776h0;
    public final rr f39777i0;
    public boolean f39778j0;
    public final p2 f39779k0;

    public vr(tj0 tj0Var, Context context, int i3, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(tj0Var, context, i3, 0, true, null, e6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f39777i0 = new rr(this, 0);
        this.f39778j0 = true;
        this.f39779k0 = new p2(this, 3);
        this.f33700w = new e(this, 8);
        this.Q = i3;
        this.R = i10;
        this.S = z10;
        this.T = new ur(i3, new rr(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131754177, null), new ci.b(this, e6Var, context)), true);
        O(false);
        org.telegram.messenger.li.b0(i3).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f39776h0);
        tj0 tj0Var = this.d;
        if (!isEmpty) {
            if (this.f39773e0 && !this.f39771c0 && tj0Var != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= tj0Var.getChildCount()) {
                        break;
                    } else if (tj0Var.getChildAt(i3) instanceof iz) {
                        if (this.f39773e0 && !this.f39771c0 && !TextUtils.isEmpty(this.f39776h0)) {
                            X(true);
                        }
                    } else {
                        i3++;
                    }
                }
            }
        } else {
            if (!this.f39778j0) {
                if (tj0Var != null) {
                    for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                        if (!(tj0Var.getChildAt(i10) instanceof iz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.f39778j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr.X(boolean):void");
    }
}
