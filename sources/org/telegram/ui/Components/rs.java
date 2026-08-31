package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class rs extends x51 {
    public final int K;
    public final int L;
    public final boolean M;
    public final qs N;
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
    public int f30835a0;
    public String f30836b0;
    public final ns f30837c0;
    public boolean f30838d0;
    public final v2 f30839e0;

    public rs(tl0 tl0Var, Context context, int i10, int i11, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(tl0Var, context, i10, 0, true, null, g6Var);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f30837c0 = new ns(this, 0);
        this.f30838d0 = true;
        this.f30839e0 = new v2(this, 3);
        this.f32958s = new d(this, 8);
        this.K = i10;
        this.L = i11;
        this.M = z4;
        this.N = new qs(i10, new ns(this, 1));
        this.T = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new mh.a(this, g6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f30836b0);
        tl0 tl0Var = this.d;
        if (!isEmpty) {
            if (this.Y && !this.W && tl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= tl0Var.getChildCount()) {
                        break;
                    } else if (tl0Var.getChildAt(i10) instanceof u00) {
                        if (this.Y && !this.W && !TextUtils.isEmpty(this.f30836b0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f30838d0) {
                if (tl0Var != null) {
                    for (int i11 = 0; i11 < tl0Var.getChildCount(); i11++) {
                        if (!(tl0Var.getChildAt(i11) instanceof u00)) {
                        }
                    }
                }
            }
            this.N.a();
            break;
        }
        this.f30838d0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.W(boolean):void");
    }
}
