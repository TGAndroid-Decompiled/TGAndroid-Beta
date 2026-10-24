package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class l40 extends a71 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public ci.t6 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String f28162a0;
    public int f28163b0;
    public org.telegram.ui.h4 f28164c0;
    public final boolean[] f28165d0;

    public l40(lm0 lm0Var, Context context, int i10) {
        super(lm0Var, context, i10, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.f28165d0 = new boolean[1];
        this.v = new d(this, 16);
        this.P = i10;
    }

    public static String X(String str, boolean[] zArr) {
        boolean z10;
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (trim.length() > 1) {
                if ((trim.charAt(0) == '#' || trim.charAt(0) == '$') && trim.indexOf(64) < 0) {
                    if (zArr != null) {
                        if (trim.charAt(0) == '$') {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr[0] = z10;
                    }
                    return trim.substring(1);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void V() {
        ci.t6 t6Var = this.S;
        if (t6Var != null && t6Var.I != 0) {
            ConnectionsManager.getInstance(t6Var.f6190c).cancelRequest(t6Var.I, true);
            t6Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f28164c0);
        this.V++;
        this.U = false;
    }

    public final void W() {
        lm0 lm0Var;
        if (!TextUtils.isEmpty(this.Z) && !this.X && !this.U && (lm0Var = this.d) != null) {
            for (int i10 = 0; i10 < lm0Var.getChildCount(); i10++) {
                if (lm0Var.getChildAt(i10) instanceof z00) {
                    Y(this.Z);
                    return;
                }
            }
        }
    }

    public final void Y(String str) {
        this.Z = str;
        String X = X(str, this.f28165d0);
        if (!TextUtils.equals(this.f28162a0, X)) {
            this.Q.clear();
            this.X = false;
            this.Y = 0;
            V();
        } else if (this.U) {
            return;
        }
        int i10 = this.V + 1;
        this.V = i10;
        if (X == null) {
            return;
        }
        this.U = true;
        N(true);
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this, i10, X, 11);
        this.f28164c0 = h4Var;
        AndroidUtilities.runOnUIThread(h4Var, 300L);
    }
}
