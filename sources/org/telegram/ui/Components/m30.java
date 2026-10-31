package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class m30 extends p51 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public th.r4 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String f28265a0;
    public int f28266b0;
    public ag.o0 f28267c0;
    public final boolean[] f28268d0;

    public m30(tk0 tk0Var, Context context, int i10) {
        super(tk0Var, context, i10, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.f28268d0 = new boolean[1];
        this.f29297w = new d(this, 16);
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
        th.r4 r4Var = this.S;
        if (r4Var != null && r4Var.I != 0) {
            ConnectionsManager.getInstance(r4Var.f49633c).cancelRequest(r4Var.I, true);
            r4Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        org.telegram.messenger.i0.r(this.f28267c0);
        this.V++;
        this.U = false;
    }

    public final void X() {
        tk0 tk0Var;
        if (!TextUtils.isEmpty(this.Z) && !this.X && !this.U && (tk0Var = this.d) != null) {
            for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                if (tk0Var.getChildAt(i10) instanceof zz) {
                    Z(this.Z);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.Z = str;
        String Y = Y(str, this.f28268d0);
        if (!TextUtils.equals(this.f28265a0, Y)) {
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
        ag.o0 o0Var = new ag.o0(this, i10, Y, 27);
        this.f28267c0 = o0Var;
        org.telegram.messenger.i0.h3(o0Var, 300L);
    }
}
