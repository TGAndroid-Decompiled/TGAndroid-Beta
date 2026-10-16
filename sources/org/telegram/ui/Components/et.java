package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class et extends a71 {
    public final int N;
    public final int O;
    public final boolean P;
    public final dt Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f24480a0;
    public boolean f24481b0;
    public int f24482c0;
    public int f24483d0;
    public String f24484e0;
    public final zs f24485f0;
    public boolean f24486g0;
    public final a3 f24487h0;

    public et(mm0 mm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(mm0Var, context, i10, 0, true, null, c6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f24485f0 = new zs(this, 0);
        this.f24486g0 = true;
        this.f24487h0 = new a3(this, 3);
        this.f23146s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new dt(i10, new zs(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new at(this, c6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f24484e0);
        mm0 mm0Var = this.d;
        if (!isEmpty) {
            if (this.f24481b0 && !this.Z && mm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= mm0Var.getChildCount()) {
                        break;
                    } else if (mm0Var.getChildAt(i10) instanceof f10) {
                        if (this.f24481b0 && !this.Z && !TextUtils.isEmpty(this.f24484e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f24486g0) {
                if (mm0Var != null) {
                    for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                        if (!(mm0Var.getChildAt(i11) instanceof f10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f24486g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.et.W(boolean):void");
    }
}
