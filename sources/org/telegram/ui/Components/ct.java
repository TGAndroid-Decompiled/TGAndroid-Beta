package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class ct extends k71 {
    public final int P;
    public final int Q;
    public final boolean R;
    public final bt S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final CharSequence Y;
    public int Z;
    public int f27245a0;
    public boolean f27246b0;
    public boolean f27247c0;
    public boolean f27248d0;
    public int f27249e0;
    public int f27250f0;
    public String f27251g0;
    public final ys f27252h0;
    public boolean f27253i0;
    public final b3 f27254j0;

    public ct(nm0 nm0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(nm0Var, context, i10, 0, true, null, u6Var);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f27252h0 = new ys(this, 0);
        this.f27253i0 = true;
        this.f27254j0 = new b3(this, 3);
        this.v = new d(this, 8);
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = new bt(i10, new ys(this, 1));
        this.Y = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new bi.b(this, u6Var, context)), true);
        O(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.f27251g0);
        nm0 nm0Var = this.d;
        if (!isEmpty) {
            if (this.f27248d0 && !this.f27246b0 && nm0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= nm0Var.getChildCount()) {
                        break;
                    } else if (nm0Var.getChildAt(i10) instanceof c10) {
                        if (this.f27248d0 && !this.f27246b0 && !TextUtils.isEmpty(this.f27251g0)) {
                            X(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f27253i0) {
                if (nm0Var != null) {
                    for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
                        if (!(nm0Var.getChildAt(i11) instanceof c10)) {
                        }
                    }
                }
            }
            this.S.a();
            break;
        }
        this.f27253i0 = false;
    }

    public final void X(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ct.X(boolean):void");
    }
}
