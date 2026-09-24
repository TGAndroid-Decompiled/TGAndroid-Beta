package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ss extends j61 {
    public final int N;
    public final int O;
    public final boolean P;
    public final rs Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f28308a0;
    public boolean f28309b0;
    public int f28310c0;
    public int f28311d0;
    public String f28312e0;
    public final ns f28313f0;
    public boolean f28314g0;
    public final y2 f28315h0;

    public ss(wl0 wl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(wl0Var, context, i10, 0, true, null, d6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f28313f0 = new ns(this, 0);
        this.f28314g0 = true;
        this.f28315h0 = new y2(this, 3);
        this.f25266s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new rs(i10, new ns(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new os(this, d6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f28312e0);
        wl0 wl0Var = this.d;
        if (!isEmpty) {
            if (this.f28309b0 && !this.Z && wl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= wl0Var.getChildCount()) {
                        break;
                    } else if (wl0Var.getChildAt(i10) instanceof u00) {
                        if (this.f28309b0 && !this.Z && !TextUtils.isEmpty(this.f28312e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f28314g0) {
                if (wl0Var != null) {
                    for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                        if (!(wl0Var.getChildAt(i11) instanceof u00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f28314g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss.W(boolean):void");
    }
}
