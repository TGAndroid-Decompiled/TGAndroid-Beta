package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
public class gs extends p51 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final fs S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final SpannableStringBuilder Y;
    public int Z;
    public int f26505a0;
    public boolean f26506b0;
    public boolean f26507c0;
    public boolean f26508d0;
    public int f26509e0;
    public int f26510f0;
    public String f26511g0;
    public final bs f26512h0;
    public boolean f26513i0;
    public final r2 f26514j0;

    public gs(tk0 tk0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(tk0Var, context, i10, 0, true, null, p6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f26512h0 = new bs(this, 0);
        this.f26513i0 = true;
        this.f26514j0 = new r2(this, 3);
        this.f29297w = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new fs(i10, new bs(this, 1));
        this.Y = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131754177, null), new cs(this, p6Var, context)), true);
        O(false);
        org.telegram.messenger.ui.b0(i10).M0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f26511g0);
        tk0 tk0Var = this.d;
        if (!isEmpty) {
            if (this.f26508d0 && !this.f26506b0 && tk0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= tk0Var.getChildCount()) {
                        break;
                    } else if (tk0Var.getChildAt(i10) instanceof zz) {
                        if (this.f26508d0 && !this.f26506b0 && !TextUtils.isEmpty(this.f26511g0)) {
                            X(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f26513i0) {
                if (tk0Var != null) {
                    for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                        if (!(tk0Var.getChildAt(i11) instanceof zz)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        this.f26513i0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gs.X(boolean):void");
    }
}
