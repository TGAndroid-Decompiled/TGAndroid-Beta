package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class jt extends d71 {
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
    public boolean f27781a0;
    public boolean f27782b0;
    public int f27783c0;
    public int f27784d0;
    public String f27785e0;
    public final dt f27786f0;
    public boolean f27787g0;
    public final a3 f27788h0;

    public jt(rm0 rm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(rm0Var, context, i10, 0, true, null, e6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27786f0 = new dt(this, 0);
        this.f27787g0 = true;
        this.f27788h0 = new a3(this, 3);
        this.f25588s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new ht(i10, new dt(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new et(this, e6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27785e0);
        rm0 rm0Var = this.d;
        if (!isEmpty) {
            if (this.f27782b0 && !this.Z && rm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= rm0Var.getChildCount()) {
                        break;
                    } else if (rm0Var.getChildAt(i10) instanceof k10) {
                        if (this.f27782b0 && !this.Z && !TextUtils.isEmpty(this.f27785e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27787g0) {
                if (rm0Var != null) {
                    for (int i11 = 0; i11 < rm0Var.getChildCount(); i11++) {
                        if (!(rm0Var.getChildAt(i11) instanceof k10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27787g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt.W(boolean):void");
    }
}
