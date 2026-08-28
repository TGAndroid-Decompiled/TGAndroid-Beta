package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class o30 extends z41 {
    public final int J;
    public final ArrayList K;
    public boolean L;
    public ih.h6 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public String T;
    public String U;
    public int V;
    public org.telegram.ui.rl W;
    public final boolean[] X;

    public o30(wk0 wk0Var, Context context, int i9) {
        super(wk0Var, context, i9, 0, false, null, null);
        this.K = new ArrayList();
        this.P = 0;
        this.Q = -1;
        this.X = new boolean[1];
        this.f35189s = new d(this, 16);
        this.J = i9;
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
        ih.h6 h6Var = this.M;
        if (h6Var != null && h6Var.I != 0) {
            ConnectionsManager.getInstance(h6Var.f11847c).cancelRequest(h6Var.I, true);
            h6Var.I = 0;
        }
        this.L = false;
        if (this.Q >= 0) {
            ConnectionsManager.getInstance(this.J).cancelRequest(this.Q, true);
            this.Q = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.W);
        this.P++;
        this.O = false;
    }

    public final void W() {
        wk0 wk0Var;
        if (!TextUtils.isEmpty(this.T) && !this.R && !this.O && (wk0Var = this.d) != null) {
            for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                if (wk0Var.getChildAt(i9) instanceof e00) {
                    Y(this.T);
                    return;
                }
            }
        }
    }

    public final void Y(String str) {
        this.T = str;
        String X = X(str, this.X);
        if (!TextUtils.equals(this.U, X)) {
            this.K.clear();
            this.R = false;
            this.S = 0;
            V();
        } else if (this.O) {
            return;
        }
        int i9 = this.P + 1;
        this.P = i9;
        if (X == null) {
            return;
        }
        this.O = true;
        N(true);
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, i9, X, 6);
        this.W = rlVar;
        AndroidUtilities.runOnUIThread(rlVar, 300L);
    }
}
