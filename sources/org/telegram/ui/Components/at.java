package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class at extends b71 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final zs S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final CharSequence Y;
    public int Z;
    public int f24838a0;
    public boolean f24839b0;
    public boolean f24840c0;
    public boolean f24841d0;
    public int f24842e0;
    public int f24843f0;
    public String f24844g0;
    public final ws f24845h0;
    public boolean f24846i0;
    public final y2 f24847j0;

    public at(mm0 mm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(mm0Var, context, i10, 0, true, null, g6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f24845h0 = new ws(this, 0);
        this.f24846i0 = true;
        this.f24847j0 = new y2(this, 3);
        this.v = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new zs(i10, new ws(this, 1));
        this.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ai.b(this, g6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f24844g0);
        mm0 mm0Var = this.d;
        if (!isEmpty) {
            if (this.f24841d0 && !this.f24839b0 && mm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= mm0Var.getChildCount()) {
                        break;
                    } else if (mm0Var.getChildAt(i10) instanceof b10) {
                        if (this.f24841d0 && !this.f24839b0 && !TextUtils.isEmpty(this.f24844g0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f24846i0) {
                if (mm0Var != null) {
                    for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                        if (!(mm0Var.getChildAt(i11) instanceof b10)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        this.f24846i0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.at.W(boolean):void");
    }
}
