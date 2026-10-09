package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ht extends c71 {
    public final int N;
    public final int O;
    public final boolean P;
    public final gt Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f27131a0;
    public boolean f27132b0;
    public int f27133c0;
    public int f27134d0;
    public String f27135e0;
    public final ct f27136f0;
    public boolean f27137g0;
    public final a3 f27138h0;

    public ht(qm0 qm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(qm0Var, context, i10, 0, true, null, e6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27136f0 = new ct(this, 0);
        this.f27137g0 = true;
        this.f27138h0 = new a3(this, 3);
        this.f25281s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new gt(i10, new ct(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new dt(this, e6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27135e0);
        qm0 qm0Var = this.d;
        if (!isEmpty) {
            if (this.f27132b0 && !this.Z && qm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= qm0Var.getChildCount()) {
                        break;
                    } else if (qm0Var.getChildAt(i10) instanceof j10) {
                        if (this.f27132b0 && !this.Z && !TextUtils.isEmpty(this.f27135e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27137g0) {
                if (qm0Var != null) {
                    for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                        if (!(qm0Var.getChildAt(i11) instanceof j10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27137g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ht.W(boolean):void");
    }
}
