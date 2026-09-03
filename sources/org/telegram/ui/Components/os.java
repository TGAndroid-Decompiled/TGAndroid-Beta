package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class os extends w51 {
    public final int K;
    public final int L;
    public final boolean M;
    public final ns N;
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
    public int f27638a0;
    public String f27639b0;
    public final ks f27640c0;
    public boolean f27641d0;
    public final v2 f27642e0;

    public os(rl0 rl0Var, Context context, int i10, int i11, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(rl0Var, context, i10, 0, true, null, f6Var);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f27640c0 = new ks(this, 0);
        this.f27641d0 = true;
        this.f27642e0 = new v2(this, 3);
        this.f30149s = new d(this, 8);
        this.K = i10;
        this.L = i11;
        this.M = z4;
        this.N = new ns(i10, new ks(this, 1));
        this.T = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new lh.a(this, f6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27639b0);
        rl0 rl0Var = this.d;
        if (!isEmpty) {
            if (this.Y && !this.W && rl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= rl0Var.getChildCount()) {
                        break;
                    } else if (rl0Var.getChildAt(i10) instanceof u00) {
                        if (this.Y && !this.W && !TextUtils.isEmpty(this.f27639b0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27641d0) {
                if (rl0Var != null) {
                    for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                        if (!(rl0Var.getChildAt(i11) instanceof u00)) {
                        }
                    }
                }
            }
            this.N.a();
            break;
        }
        this.f27641d0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.os.W(boolean):void");
    }
}
