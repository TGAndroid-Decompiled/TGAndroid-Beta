package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class rs extends w51 {
    public final int N;
    public final int O;
    public final boolean P;
    public final qs Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f27671a0;
    public boolean f27672b0;
    public int f27673c0;
    public int f27674d0;
    public String f27675e0;
    public final ms f27676f0;
    public boolean f27677g0;
    public final x2 f27678h0;

    public rs(ll0 ll0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(ll0Var, context, i10, 0, true, null, e6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27676f0 = new ms(this, 0);
        this.f27677g0 = true;
        this.f27678h0 = new x2(this, 3);
        this.f29614s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new qs(i10, new ms(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ns(this, e6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27675e0);
        ll0 ll0Var = this.d;
        if (!isEmpty) {
            if (this.f27672b0 && !this.Z && ll0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= ll0Var.getChildCount()) {
                        break;
                    } else if (ll0Var.getChildAt(i10) instanceof t00) {
                        if (this.f27672b0 && !this.Z && !TextUtils.isEmpty(this.f27675e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27677g0) {
                if (ll0Var != null) {
                    for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                        if (!(ll0Var.getChildAt(i11) instanceof t00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27677g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.W(boolean):void");
    }
}
