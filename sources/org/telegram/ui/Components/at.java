package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class at extends u61 {
    public final int N;
    public final int O;
    public final boolean P;
    public final zs Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f24714a0;
    public boolean f24715b0;
    public int f24716c0;
    public int f24717d0;
    public String f24718e0;
    public final ws f24719f0;
    public boolean f24720g0;
    public final z2 f24721h0;

    public at(jm0 jm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(jm0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f24719f0 = new ws(this, 0);
        this.f24720g0 = true;
        this.f24721h0 = new z2(this, 3);
        this.f30865s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new zs(i10, new ws(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ai.b(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f24718e0);
        jm0 jm0Var = this.d;
        if (!isEmpty) {
            if (this.f24715b0 && !this.Z && jm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jm0Var.getChildCount()) {
                        break;
                    } else if (jm0Var.getChildAt(i10) instanceof b10) {
                        if (this.f24715b0 && !this.Z && !TextUtils.isEmpty(this.f24718e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f24720g0) {
                if (jm0Var != null) {
                    for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
                        if (!(jm0Var.getChildAt(i11) instanceof b10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f24720g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.at.W(boolean):void");
    }
}
