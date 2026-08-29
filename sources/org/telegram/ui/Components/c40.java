package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class c40 extends k51 {
    public final int J;
    public final ArrayList K;
    public boolean L;
    public lh.e6 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public String T;
    public String U;
    public int V;
    public rm W;
    public final boolean[] X;

    public c40(jl0 jl0Var, Context context, int i10) {
        super(jl0Var, context, i10, 0, false, null, null);
        this.K = new ArrayList();
        this.P = 0;
        this.Q = -1;
        this.X = new boolean[1];
        this.f29940s = new d(this, 16);
        this.J = i10;
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
        lh.e6 e6Var = this.M;
        if (e6Var != null && e6Var.I != 0) {
            ConnectionsManager.getInstance(e6Var.f15834c).cancelRequest(e6Var.I, true);
            e6Var.I = 0;
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
        jl0 jl0Var;
        if (!TextUtils.isEmpty(this.T) && !this.R && !this.O && (jl0Var = this.d) != null) {
            for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
                if (jl0Var.getChildAt(i10) instanceof p00) {
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
        int i10 = this.P + 1;
        this.P = i10;
        if (X == null) {
            return;
        }
        this.O = true;
        N(true);
        rm rmVar = new rm(this, i10, X, 5);
        this.W = rmVar;
        AndroidUtilities.runOnUIThread(rmVar, 300L);
    }
}
