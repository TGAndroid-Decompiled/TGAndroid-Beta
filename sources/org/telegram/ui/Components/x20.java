package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class x20 extends p41 {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public fi.d6 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String f41539a0;
    public String f41540b0;
    public int f41541c0;
    public org.telegram.ui.f0 f41542d0;
    public final boolean[] f41543e0;

    public x20(uj0 uj0Var, Context context, int i7) {
        super(uj0Var, context, i7, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.f41543e0 = new boolean[1];
        this.f38203w = new d(this, 16);
        this.Q = i7;
    }

    public static String Y(String str, boolean[] zArr) {
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

    public final void W() {
        fi.d6 d6Var = this.T;
        if (d6Var != null && d6Var.I != 0) {
            ConnectionsManager.getInstance(d6Var.f11940c).cancelRequest(d6Var.I, true);
            d6Var.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        org.telegram.messenger.g0.r(this.f41542d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        uj0 uj0Var;
        if (!TextUtils.isEmpty(this.f41539a0) && !this.Y && !this.V && (uj0Var = this.d) != null) {
            for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                if (uj0Var.getChildAt(i7) instanceof pz) {
                    Z(this.f41539a0);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.f41539a0 = str;
        String Y = Y(str, this.f41543e0);
        if (!TextUtils.equals(this.f41540b0, Y)) {
            this.R.clear();
            this.Y = false;
            this.Z = 0;
            W();
        } else if (this.V) {
            return;
        }
        int i7 = this.W + 1;
        this.W = i7;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(this, i7, Y, 13);
        this.f41542d0 = f0Var;
        org.telegram.messenger.g0.i3(f0Var, 300L);
    }
}
