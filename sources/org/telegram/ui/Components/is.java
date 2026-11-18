package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class is extends z41 {
    public final int Q;
    public final int R;
    public final boolean S;
    public final hs T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int f36181a0;
    public int f36182b0;
    public boolean f36183c0;
    public boolean f36184d0;
    public boolean f36185e0;
    public int f36186f0;
    public int f36187g0;
    public String f36188h0;
    public final es f36189i0;
    public boolean f36190j0;
    public final y2 f36191k0;

    public is(ck0 ck0Var, Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(ck0Var, context, i7, 0, true, null, i6Var);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f36189i0 = new es(this, 0);
        this.f36190j0 = true;
        this.f36191k0 = new y2(this, 5);
        this.f42811w = new d(this, 9);
        this.Q = i7;
        this.R = i10;
        this.S = z10;
        this.T = new hs(i7, new es(this, 1));
        this.Z = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131754175, null), new di.a(this, i6Var, context)), true);
        O(false);
        org.telegram.messenger.ri.d0(i7).P0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f36188h0);
        ck0 ck0Var = this.d;
        if (!isEmpty) {
            if (this.f36185e0 && !this.f36183c0 && ck0Var != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= ck0Var.getChildCount()) {
                        break;
                    } else if (ck0Var.getChildAt(i7) instanceof wz) {
                        if (this.f36185e0 && !this.f36183c0 && !TextUtils.isEmpty(this.f36188h0)) {
                            X(true);
                        }
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            if (!this.f36190j0) {
                if (ck0Var != null) {
                    for (int i10 = 0; i10 < ck0Var.getChildCount(); i10++) {
                        if (!(ck0Var.getChildAt(i10) instanceof wz)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        this.f36190j0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.is.X(boolean):void");
    }
}
