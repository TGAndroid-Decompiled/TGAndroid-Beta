package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class u20 extends m41 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public di.l6 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String f38492a0;
    public int f38493b0;
    public org.telegram.ui.q8 f38494c0;
    public final boolean[] f38495d0;

    public u20(pj0 pj0Var, Context context, int i7) {
        super(pj0Var, context, i7, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.f38495d0 = new boolean[1];
        this.f35847w = new d(this, 16);
        this.P = i7;
    }

    public static String Y(String str, boolean[] zArr) {
        boolean z9;
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (trim.length() > 1) {
                if ((trim.charAt(0) == '#' || trim.charAt(0) == '$') && trim.indexOf(64) < 0) {
                    if (zArr != null) {
                        if (trim.charAt(0) == '$') {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        zArr[0] = z9;
                    }
                    return trim.substring(1);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void W() {
        di.l6 l6Var = this.S;
        if (l6Var != null && l6Var.I != 0) {
            ConnectionsManager.getInstance(l6Var.f9695c).cancelRequest(l6Var.I, true);
            l6Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        org.telegram.messenger.g0.r(this.f38494c0);
        this.V++;
        this.U = false;
    }

    public final void X() {
        pj0 pj0Var;
        if (!TextUtils.isEmpty(this.Z) && !this.X && !this.U && (pj0Var = this.d) != null) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                if (pj0Var.getChildAt(i7) instanceof lz) {
                    Z(this.Z);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.Z = str;
        String Y = Y(str, this.f38495d0);
        if (!TextUtils.equals(this.f38492a0, Y)) {
            this.Q.clear();
            this.X = false;
            this.Y = 0;
            W();
        } else if (this.U) {
            return;
        }
        int i7 = this.V + 1;
        this.V = i7;
        if (Y == null) {
            return;
        }
        this.U = true;
        O(true);
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i7, Y);
        this.f38494c0 = q8Var;
        org.telegram.messenger.g0.i3(q8Var, 300L);
    }
}
