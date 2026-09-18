package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class rs extends l61 {
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
    public boolean f27959a0;
    public boolean f27960b0;
    public int f27961c0;
    public int f27962d0;
    public String f27963e0;
    public final ms f27964f0;
    public boolean f27965g0;
    public final y2 f27966h0;

    public rs(wl0 wl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wl0Var, context, i10, 0, true, null, e6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f27964f0 = new ms(this, 0);
        this.f27965g0 = true;
        this.f27966h0 = new y2(this, 3);
        this.f26043s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new qs(i10, new ms(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ns(this, e6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f27963e0);
        wl0 wl0Var = this.d;
        if (!isEmpty) {
            if (this.f27960b0 && !this.Z && wl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= wl0Var.getChildCount()) {
                        break;
                    } else if (wl0Var.getChildAt(i10) instanceof t00) {
                        if (this.f27960b0 && !this.Z && !TextUtils.isEmpty(this.f27963e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27965g0) {
                if (wl0Var != null) {
                    for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                        if (!(wl0Var.getChildAt(i11) instanceof t00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f27965g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.W(boolean):void");
    }
}
