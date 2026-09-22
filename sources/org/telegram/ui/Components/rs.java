package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
public class rs extends m61 {
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
    public boolean f28040a0;
    public boolean f28041b0;
    public int f28042c0;
    public int f28043d0;
    public String f28044e0;
    public final ms f28045f0;
    public boolean f28046g0;
    public final x2 f28047h0;

    public rs(yl0 yl0Var, Context context, int i10, int i11, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(yl0Var, context, i10, 0, true, null, f6Var);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.f28045f0 = new ms(this, 0);
        this.f28046g0 = true;
        this.f28047h0 = new x2(this, 3);
        this.f26343s = new d(this, 8);
        this.N = i10;
        this.O = i11;
        this.P = z10;
        this.Q = new qs(i10, new ms(this, 1));
        this.W = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ns(this, f6Var, context)), true);
        N(false);
        MediaDataController.getInstance(i10).loadHints(true);
    }

    public final void V() {
        boolean isEmpty = TextUtils.isEmpty(this.f28044e0);
        yl0 yl0Var = this.d;
        if (!isEmpty) {
            if (this.f28041b0 && !this.Z && yl0Var != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= yl0Var.getChildCount()) {
                        break;
                    } else if (yl0Var.getChildAt(i10) instanceof t00) {
                        if (this.f28041b0 && !this.Z && !TextUtils.isEmpty(this.f28044e0)) {
                            W(true);
                        }
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            if (!this.f28046g0) {
                if (yl0Var != null) {
                    for (int i11 = 0; i11 < yl0Var.getChildCount(); i11++) {
                        if (!(yl0Var.getChildAt(i11) instanceof t00)) {
                        }
                    }
                }
            }
            this.Q.a();
            break;
        }
        this.f28046g0 = false;
    }

    public final void W(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.W(boolean):void");
    }
}
