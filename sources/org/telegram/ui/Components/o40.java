package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class o40 extends j61 {
    public final int N;
    public final ArrayList O;
    public boolean P;
    public zh.u4 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public String X;
    public String Y;
    public int Z;
    public my f25663a0;
    public final boolean[] f25664b0;

    public o40(vl0 vl0Var, Context context, int i10) {
        super(vl0Var, context, i10, 0, false, null, null);
        this.O = new ArrayList();
        this.T = 0;
        this.U = -1;
        this.f25664b0 = new boolean[1];
        this.f24251s = new e(this, 16);
        this.N = i10;
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
        zh.u4 u4Var = this.Q;
        if (u4Var != null && u4Var.I != 0) {
            ConnectionsManager.getInstance(u4Var.f48237c).cancelRequest(u4Var.I, true);
            u4Var.I = 0;
        }
        this.P = false;
        if (this.U >= 0) {
            ConnectionsManager.getInstance(this.N).cancelRequest(this.U, true);
            this.U = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f25663a0);
        this.T++;
        this.S = false;
    }

    public final void W() {
        vl0 vl0Var;
        if (!TextUtils.isEmpty(this.X) && !this.V && !this.S && (vl0Var = this.d) != null) {
            for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
                if (vl0Var.getChildAt(i10) instanceof a10) {
                    Y(this.X);
                    return;
                }
            }
        }
    }

    public final void Y(String str) {
        this.X = str;
        String X = X(str, this.f25664b0);
        if (!TextUtils.equals(this.Y, X)) {
            this.O.clear();
            this.V = false;
            this.W = 0;
            V();
        } else if (this.S) {
            return;
        }
        int i10 = this.T + 1;
        this.T = i10;
        if (X == null) {
            return;
        }
        this.S = true;
        N(true);
        my myVar = new my(this, i10, X, 3);
        this.f25663a0 = myVar;
        AndroidUtilities.runOnUIThread(myVar, 300L);
    }
}
