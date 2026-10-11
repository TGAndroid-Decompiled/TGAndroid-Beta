package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class jt extends e71 {
    public final int N;
    public final int O;
    public final boolean P;
    public final ht Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f27744a0;
    public boolean f27745b0;
    public int f27746c0;
    public int f27747d0;
    public String f27748e0;
    public final dt f27749f0;
    public boolean f27750g0;
    public final a3 f27751h0;

    public jt(sm0 sm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(sm0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27749f0 = new dt(this, 0);
        this.f27750g0 = true;
        this.f27751h0 = new a3(this, 3);
        this.f25891s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new ht(i10, new dt(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new et(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27748e0);
        sm0 sm0Var = this.d;
        if (!isEmpty) {
            if (this.f27745b0 && !this.Z && sm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= sm0Var.getChildCount()) {
                        break;
                    } else if (sm0Var.getChildAt(i10) instanceof k10) {
                        if (this.f27745b0 && !this.Z && !TextUtils.isEmpty(this.f27748e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27750g0) {
                if (sm0Var != null) {
                    for (int i11 = 0; i11 < sm0Var.getChildCount(); i11++) {
                        if (!(sm0Var.getChildAt(i11) instanceof k10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27750g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt.W(boolean):void");
    }
}
