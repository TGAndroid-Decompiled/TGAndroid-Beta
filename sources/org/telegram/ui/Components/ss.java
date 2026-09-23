package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ss extends v51 {
    public final int N;
    public final int O;
    public final boolean P;
    public final rs Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f27977a0;
    public boolean f27978b0;
    public int f27979c0;
    public int f27980d0;
    public String f27981e0;
    public final ns f27982f0;
    public boolean f27983g0;
    public final x2 f27984h0;

    public ss(ml0 ml0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(ml0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27982f0 = new ns(this, 0);
        this.f27983g0 = true;
        this.f27984h0 = new x2(this, 3);
        this.f28663s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new rs(i10, new ns(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new os(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27981e0);
        ml0 ml0Var = this.d;
        if (!isEmpty) {
            if (this.f27978b0 && !this.Z && ml0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= ml0Var.getChildCount()) {
                        break;
                    } else if (ml0Var.getChildAt(i10) instanceof u00) {
                        if (this.f27978b0 && !this.Z && !TextUtils.isEmpty(this.f27981e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27983g0) {
                if (ml0Var != null) {
                    for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                        if (!(ml0Var.getChildAt(i11) instanceof u00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27983g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss.W(boolean):void");
    }
}
