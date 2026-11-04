package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class q20 extends f41 {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public ei.l6 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String f37323a0;
    public String f37324b0;
    public int f37325c0;
    public org.telegram.ui.f4 f37326d0;
    public final boolean[] f37327e0;

    public q20(tj0 tj0Var, Context context, int i3) {
        super(tj0Var, context, i3, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.f37327e0 = new boolean[1];
        this.f33700w = new e(this, 16);
        this.Q = i3;
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
        ei.l6 l6Var = this.T;
        if (l6Var != null && l6Var.I != 0) {
            ConnectionsManager.getInstance(l6Var.f10872c).cancelRequest(l6Var.I, true);
            l6Var.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        org.telegram.messenger.g0.r(this.f37326d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        tj0 tj0Var;
        if (!TextUtils.isEmpty(this.f37323a0) && !this.Y && !this.V && (tj0Var = this.d) != null) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                if (tj0Var.getChildAt(i3) instanceof iz) {
                    Z(this.f37323a0);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.f37323a0 = str;
        String Y = Y(str, this.f37327e0);
        if (!TextUtils.equals(this.f37324b0, Y)) {
            this.R.clear();
            this.Y = false;
            this.Z = 0;
            W();
        } else if (this.V) {
            return;
        }
        int i3 = this.W + 1;
        this.W = i3;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(this, i3, Y, 11);
        this.f37326d0 = f4Var;
        org.telegram.messenger.g0.i3(f4Var, 300L);
    }
}
