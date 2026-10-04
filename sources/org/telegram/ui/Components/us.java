package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class us extends u61 {
    public final int N;
    public final int O;
    public final boolean P;
    public final ts Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f31430a0;
    public boolean f31431b0;
    public int f31432c0;
    public int f31433d0;
    public String f31434e0;
    public final ps f31435f0;
    public boolean f31436g0;
    public final y2 f31437h0;

    public us(zl0 zl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(zl0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f31435f0 = new ps(this, 0);
        this.f31436g0 = true;
        this.f31437h0 = new y2(this, 3);
        this.f31307s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new ts(i10, new ps(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new qs(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f31434e0);
        zl0 zl0Var = this.d;
        if (!isEmpty) {
            if (this.f31431b0 && !this.Z && zl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= zl0Var.getChildCount()) {
                        break;
                    } else if (zl0Var.getChildAt(i10) instanceof w00) {
                        if (this.f31431b0 && !this.Z && !TextUtils.isEmpty(this.f31434e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f31436g0) {
                if (zl0Var != null) {
                    for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                        if (!(zl0Var.getChildAt(i11) instanceof w00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f31436g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.us.W(boolean):void");
    }
}
