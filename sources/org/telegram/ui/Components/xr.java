package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xr extends f41 {
    public final int Q;
    public final int R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public boolean Z;
    public boolean f40464a0;
    public boolean f40465b0;
    public int f40466c0;
    public int f40467d0;
    public String f40468e0;
    public final gp f40469f0;

    public xr(tj0 tj0Var, Context context, int i3, int i10) {
        super(tj0Var, context, i3, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        dm0 dm0Var = (dm0) this;
        this.f40469f0 = new gp(dm0Var, 6);
        this.f33700w = new e(dm0Var, 9);
        this.Q = i3;
        this.R = i10;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xr.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i3 = this.Q;
        ArrayList arrayList2 = org.telegram.messenger.hp.s1(i3).f23169y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-((TLRPC.Dialog) obj).f27005id));
            if (M0 != null && org.telegram.messenger.t3.V(M0) && org.telegram.messenger.t3.t0(M0) && !org.telegram.messenger.t3.r0(M0)) {
                arrayList.add(M0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
