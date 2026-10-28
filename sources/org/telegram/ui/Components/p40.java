package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public abstract class p40 extends k71 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public di.t6 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String f31458a0;
    public int f31459b0;
    public org.telegram.ui.g4 f31460c0;
    public final boolean[] f31461d0;

    public p40(nm0 nm0Var, Context context, int i10) {
        super(nm0Var, context, i10, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.f31461d0 = new boolean[1];
        this.v = new d(this, 16);
        this.P = i10;
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
        di.t6 t6Var = this.S;
        if (t6Var != null && t6Var.I != 0) {
            ConnectionsManager.getInstance(t6Var.f9489c).cancelRequest(t6Var.I, true);
            t6Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f31460c0);
        this.V++;
        this.U = false;
    }

    public final void X() {
        nm0 nm0Var;
        if (!TextUtils.isEmpty(this.Z) && !this.X && !this.U && (nm0Var = this.d) != null) {
            for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                if (nm0Var.getChildAt(i10) instanceof c10) {
                    Z(this.Z);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.Z = str;
        String Y = Y(str, this.f31461d0);
        if (!TextUtils.equals(this.f31458a0, Y)) {
            this.Q.clear();
            this.X = false;
            this.Y = 0;
            W();
        } else if (this.U) {
            return;
        }
        int i10 = this.V + 1;
        this.V = i10;
        if (Y == null) {
            return;
        }
        this.U = true;
        O(true);
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this, i10, Y, 11);
        this.f31460c0 = g4Var;
        AndroidUtilities.runOnUIThread(g4Var, 300L);
    }
}
