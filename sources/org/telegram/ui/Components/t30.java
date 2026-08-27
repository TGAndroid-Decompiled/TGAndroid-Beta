package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

public abstract class t30 extends b51 {
    public final int J;
    public final ArrayList K;
    public boolean L;
    public jh.d6 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public String T;
    public String U;
    public int V;
    public km W;
    public final boolean[] X;

    public t30(zk0 zk0Var, Context context, int i10) {
        super(zk0Var, context, i10, 0, false, null, null);
        this.K = new ArrayList();
        this.P = 0;
        this.Q = -1;
        this.X = new boolean[1];
        this.f26943s = new d(this, 16);
        this.J = i10;
    }

    public static String X(String str, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() <= 1) {
            return null;
        }
        if ((strTrim.charAt(0) != '#' && strTrim.charAt(0) != '$') || strTrim.indexOf(64) >= 0) {
            return null;
        }
        if (zArr != null) {
            zArr[0] = strTrim.charAt(0) == '$';
        }
        return strTrim.substring(1);
    }

    public final void V() {
        jh.d6 d6Var = this.M;
        if (d6Var != null && d6Var.I != 0) {
            ConnectionsManager.getInstance(d6Var.f13536c).cancelRequest(d6Var.I, true);
            d6Var.I = 0;
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
        zk0 zk0Var;
        if (TextUtils.isEmpty(this.T) || this.R || this.O || (zk0Var = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
            if (zk0Var.getChildAt(i10) instanceof h00) {
                Y(this.T);
                return;
            }
        }
    }

    public final void Y(String str) {
        this.T = str;
        String strX = X(str, this.X);
        if (!TextUtils.equals(this.U, strX)) {
            this.K.clear();
            this.R = false;
            this.S = 0;
            V();
        } else if (this.O) {
            return;
        }
        int i10 = this.P + 1;
        this.P = i10;
        if (strX == null) {
            return;
        }
        this.O = true;
        N(true);
        km kmVar = new km(this, i10, strX, 5);
        this.W = kmVar;
        AndroidUtilities.runOnUIThread(kmVar, 300L);
    }
}
