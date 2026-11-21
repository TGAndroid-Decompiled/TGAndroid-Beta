package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class i30 extends c51 {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public fi.b6 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String f36140a0;
    public String f36141b0;
    public int f36142c0;
    public org.telegram.ui.b0 f36143d0;
    public final boolean[] f36144e0;

    public i30(ek0 ek0Var, Context context, int i7) {
        super(ek0Var, context, i7, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.f36144e0 = new boolean[1];
        this.f34070w = new d(this, 17);
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
        fi.b6 b6Var = this.T;
        if (b6Var != null && b6Var.I != 0) {
            ConnectionsManager.getInstance(b6Var.f12082c).cancelRequest(b6Var.I, true);
            b6Var.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        org.telegram.messenger.g0.r(this.f36143d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        ek0 ek0Var;
        if (!TextUtils.isEmpty(this.f36140a0) && !this.Y && !this.V && (ek0Var = this.d) != null) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                if (ek0Var.getChildAt(i7) instanceof yz) {
                    Z(this.f36140a0);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.f36140a0 = str;
        String Y = Y(str, this.f36144e0);
        if (!TextUtils.equals(this.f36141b0, Y)) {
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
        org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, i7, Y, 14);
        this.f36143d0 = b0Var;
        org.telegram.messenger.g0.h3(b0Var, 300L);
    }
}
