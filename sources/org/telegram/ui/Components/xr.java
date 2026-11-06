package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xr extends l41 {
    public final int P;
    public final int Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public boolean Y;
    public boolean Z;
    public boolean f40357a0;
    public int f40358b0;
    public int f40359c0;
    public String f40360d0;
    public final gp f40361e0;

    public xr(pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, 0, false, null, null);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.X = new ArrayList();
        am0 am0Var = (am0) this;
        this.f40361e0 = new gp(am0Var, 6);
        this.f35512w = new d(am0Var, 9);
        this.P = i7;
        this.Q = i10;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xr.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.P;
        ArrayList arrayList2 = org.telegram.messenger.qp.s1(i7).f24937y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-((TLRPC.Dialog) obj).f26957id));
            if (M0 != null && org.telegram.messenger.t3.V(M0) && org.telegram.messenger.t3.t0(M0) && !org.telegram.messenger.t3.r0(M0)) {
                arrayList.add(M0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.X;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
