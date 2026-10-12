package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class lt extends h71 {
    public final int N;
    public final int O;
    public final boolean P;
    public final kt Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final CharSequence W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f28272a0;
    public boolean f28273b0;
    public int f28274c0;
    public int f28275d0;
    public String f28276e0;
    public final et f28277f0;
    public boolean f28278g0;
    public final a3 f28279h0;

    public lt(wm0 wm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(wm0Var, context, i10, 0, true, null, c6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f28277f0 = new et(this, 0);
        this.f28278g0 = true;
        this.f28279h0 = new a3(this, 3);
        this.f26680s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new kt(i10, new et(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ft(this, c6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f28276e0);
        wm0 wm0Var = this.d;
        if (!isEmpty) {
            if (this.f28273b0 && !this.Z && wm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= wm0Var.getChildCount()) {
                        break;
                    } else if (wm0Var.getChildAt(i10) instanceof m10) {
                        if (this.f28273b0 && !this.Z && !TextUtils.isEmpty(this.f28276e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f28278g0) {
                if (wm0Var != null) {
                    for (int i11 = 0; i11 < wm0Var.getChildCount(); i11++) {
                        if (!(wm0Var.getChildAt(i11) instanceof m10)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f28278g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lt.W(boolean):void");
    }
}
