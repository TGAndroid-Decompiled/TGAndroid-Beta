package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ps extends w51 {
    public final int K;
    public final int L;
    public final boolean M;
    public final os N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public boolean R;
    public boolean S;
    public final CharSequence T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int f27974a0;
    public String f27975b0;
    public final ls f27976c0;
    public boolean f27977d0;
    public final v2 f27978e0;

    public ps(sl0 sl0Var, Context context, int i10, int i11, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(sl0Var, context, i10, 0, true, null, f6Var);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f27976c0 = new ls(this, 0);
        this.f27977d0 = true;
        this.f27978e0 = new v2(this, 3);
        this.f30241s = new d(this, 8);
        this.K = i10;
        this.L = i11;
        this.M = z4;
        this.N = new os(i10, new ls(this, 1));
        this.T = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new lh.a(this, f6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27975b0);
        sl0 sl0Var = this.d;
        if (!isEmpty) {
            if (this.Y && !this.W && sl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= sl0Var.getChildCount()) {
                        break;
                    } else if (sl0Var.getChildAt(i10) instanceof t00) {
                        if (this.Y && !this.W && !TextUtils.isEmpty(this.f27975b0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27977d0) {
                if (sl0Var != null) {
                    for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                        if (!(sl0Var.getChildAt(i11) instanceof t00)) {
                        }
                    }
                }
            }
            this.N.a();
            break;
        }
        this.f27977d0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.W(boolean):void");
    }
}
