package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class is extends p51 {
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
    public boolean f27072a0;
    public int f27073b0;
    public int f27074c0;
    public String f27075d0;
    public final ho f27076e0;

    public is(tk0 tk0Var, Context context, int i10, int i11) {
        super(tk0Var, context, i10, 0, false, null, null);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.X = new ArrayList();
        bn0 bn0Var = (bn0) this;
        this.f27076e0 = new ho(bn0Var, 8);
        this.f29297w = new d(bn0Var, 9);
        this.P = i10;
        this.Q = i11;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.is.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.P;
        ArrayList arrayList2 = org.telegram.messenger.vp.r1(i10).f18950y;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-((TLRPC.Dialog) obj).f19797id));
            if (L0 != null && org.telegram.messenger.w3.V(L0) && org.telegram.messenger.w3.t0(L0) && !org.telegram.messenger.w3.r0(L0)) {
                arrayList.add(L0);
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
