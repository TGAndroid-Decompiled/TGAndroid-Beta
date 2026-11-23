package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class ks extends c51 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final js T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int f36932a0;
    public int f36933b0;
    public boolean f36934c0;
    public boolean f36935d0;
    public boolean f36936e0;
    public int f36937f0;
    public int f36938g0;
    public String f36939h0;
    public final gs f36940i0;
    public boolean f36941j0;
    public final z2 f36942k0;

    public ks(ek0 ek0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(ek0Var, context, i7, 0, true, null, h6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f36940i0 = new gs(this, 0);
        this.f36941j0 = true;
        this.f36942k0 = new z2(this, 5);
        this.f34028w = new d(this, 9);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new js(i7, new gs(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131754174, null), new di.a(this, h6Var, context)), true);
        O(false);
        org.telegram.messenger.si.d0(i7).P0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f36939h0);
        ek0 ek0Var = this.d;
        if (!isEmpty) {
            if (this.f36936e0 && !this.f36934c0 && ek0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= ek0Var.getChildCount()) {
                        break;
                    } else if (ek0Var.getChildAt(i7) instanceof yz) {
                        if (this.f36936e0 && !this.f36934c0 && !TextUtils.isEmpty(this.f36939h0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f36941j0) {
                if (ek0Var != null) {
                    for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                        if (!(ek0Var.getChildAt(i10) instanceof yz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.f36941j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ks.X(boolean):void");
    }
}
