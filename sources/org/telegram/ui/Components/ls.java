package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ls extends k51 {
    public final int J;
    public final int K;
    public final boolean L;
    public final ks M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public final CharSequence S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public int Z;
    public String f30420a0;
    public final hs f30421b0;
    public boolean f30422c0;
    public final y2 f30423d0;

    public ls(jl0 jl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(jl0Var, context, i10, 0, true, null, c6Var);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.f30421b0 = new hs(this, 0);
        this.f30422c0 = true;
        this.f30423d0 = new y2(this, 3);
        this.f29940s = new d(this, 8);
        this.J = i10;
        this.K = i11;
        this.L = z10;
        this.M = new ks(i10, new hs(this, 1));
        this.S = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new jh.a(this, c6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f30420a0);
        jl0 jl0Var = this.d;
        if (!isEmpty) {
            if (this.X && !this.V && jl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jl0Var.getChildCount()) {
                        break;
                    } else if (jl0Var.getChildAt(i10) instanceof p00) {
                        if (this.X && !this.V && !TextUtils.isEmpty(this.f30420a0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f30422c0) {
                if (jl0Var != null) {
                    for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                        if (!(jl0Var.getChildAt(i11) instanceof p00)) {
                        }
                    }
                }
            }
            this.M.a();
            break;
        }
        this.f30422c0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ls.W(boolean):void");
    }
}
