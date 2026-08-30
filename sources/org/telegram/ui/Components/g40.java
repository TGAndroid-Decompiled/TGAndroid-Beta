package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class g40 extends w51 {
    public final int K;
    public final ArrayList L;
    public boolean M;
    public nh.f6 N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    public String U;
    public String V;
    public int W;
    public ey X;
    public final boolean[] Y;

    public g40(sl0 sl0Var, Context context, int i10) {
        super(sl0Var, context, i10, 0, false, null, null);
        this.L = new ArrayList();
        this.Q = 0;
        this.R = -1;
        this.Y = new boolean[1];
        this.f30241s = new d(this, 16);
        this.K = i10;
    }

    public static String X(String str, boolean[] zArr) {
        boolean z4;
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (trim.length() > 1) {
                if ((trim.charAt(0) == '#' || trim.charAt(0) == '$') && trim.indexOf(64) < 0) {
                    if (zArr != null) {
                        if (trim.charAt(0) == '$') {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zArr[0] = z4;
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
        nh.f6 f6Var = this.N;
        if (f6Var != null && f6Var.I != 0) {
            ConnectionsManager.getInstance(f6Var.f15577c).cancelRequest(f6Var.I, true);
            f6Var.I = 0;
        }
        this.M = false;
        if (this.R >= 0) {
            ConnectionsManager.getInstance(this.K).cancelRequest(this.R, true);
            this.R = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.X);
        this.Q++;
        this.P = false;
    }

    public final void W() {
        sl0 sl0Var;
        if (!TextUtils.isEmpty(this.U) && !this.S && !this.P && (sl0Var = this.d) != null) {
            for (int i10 = 0; i10 < sl0Var.getChildCount(); i10++) {
                if (sl0Var.getChildAt(i10) instanceof t00) {
                    Y(this.U);
                    return;
                }
            }
        }
    }

    public final void Y(String str) {
        this.U = str;
        String X = X(str, this.Y);
        if (!TextUtils.equals(this.V, X)) {
            this.L.clear();
            this.S = false;
            this.T = 0;
            V();
        } else if (this.P) {
            return;
        }
        int i10 = this.Q + 1;
        this.Q = i10;
        if (X == null) {
            return;
        }
        this.P = true;
        N(true);
        ey eyVar = new ey(this, i10, X, 3);
        this.X = eyVar;
        AndroidUtilities.runOnUIThread(eyVar, 300L);
    }
}
