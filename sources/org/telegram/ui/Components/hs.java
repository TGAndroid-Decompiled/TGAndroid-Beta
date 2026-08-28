package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class hs extends z41 {
    public final int J;
    public final int K;
    public final boolean L;
    public final gs M;
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
    public String f29179a0;
    public final ds f29180b0;
    public boolean f29181c0;
    public final v2 f29182d0;

    public hs(wk0 wk0Var, Context context, int i9, int i10, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, context, i9, 0, true, null, b6Var);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.f29180b0 = new ds(this, 0);
        this.f29181c0 = true;
        this.f29182d0 = new v2(this, 3);
        this.f35189s = new d(this, 8);
        this.J = i9;
        this.K = i10;
        this.L = z10;
        this.M = new gs(i9, new ds(this, 1));
        this.S = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new gh.a(this, b6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i9).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f29179a0);
        wk0 wk0Var = this.d;
        if (!isEmpty) {
            if (this.X && !this.V && wk0Var != null) {
                int i9 = 0;
                while (true) {
                    if (i9 >= wk0Var.getChildCount()) {
                        break;
                    } else if (wk0Var.getChildAt(i9) instanceof e00) {
                        if (this.X && !this.V && !TextUtils.isEmpty(this.f29179a0)) {
                            W(true);
                        }
                    } else {
                        i9++;
                    }
                }
            }
        } else {
            if (!this.f29181c0) {
                if (wk0Var != null) {
                    for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                        if (!(wk0Var.getChildAt(i10) instanceof e00)) {
                        }
                    }
                }
            }
            this.M.a();
            break;
        }
        this.f29181c0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hs.W(boolean):void");
    }
}
