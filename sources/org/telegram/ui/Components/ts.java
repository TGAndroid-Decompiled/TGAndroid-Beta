package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ts extends l61 {
    public final int N;
    public final int O;
    public final boolean P;
    public final ss Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f28616a0;
    public boolean f28617b0;
    public int f28618c0;
    public int f28619d0;
    public String f28620e0;
    public final os f28621f0;
    public boolean f28622g0;
    public final y2 f28623h0;

    public ts(yl0 yl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(yl0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f28621f0 = new os(this, 0);
        this.f28622g0 = true;
        this.f28623h0 = new y2(this, 3);
        this.f25937s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new ss(i10, new os(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ps(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f28620e0);
        yl0 yl0Var = this.d;
        if (!isEmpty) {
            if (this.f28617b0 && !this.Z && yl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= yl0Var.getChildCount()) {
                        break;
                    } else if (yl0Var.getChildAt(i10) instanceof v00) {
                        if (this.f28617b0 && !this.Z && !TextUtils.isEmpty(this.f28620e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f28622g0) {
                if (yl0Var != null) {
                    for (int i11 = 0; i11 < yl0Var.getChildCount(); i11++) {
                        if (!(yl0Var.getChildAt(i11) instanceof v00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f28622g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ts.W(boolean):void");
    }
}
