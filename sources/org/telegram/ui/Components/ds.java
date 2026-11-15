package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ds extends p41 {
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
    public boolean f34056a0;
    public boolean f34057b0;
    public int f34058c0;
    public int f34059d0;
    public String f34060e0;
    public final fo f34061f0;

    public ds(uj0 uj0Var, Context context, int i7, int i10) {
        super(uj0Var, context, i7, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        em0 em0Var = (em0) this;
        this.f34061f0 = new fo(em0Var, 8);
        this.f38203w = new d(em0Var, 9);
        this.Q = i7;
        this.R = i10;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ds.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.Q;
        ArrayList arrayList2 = org.telegram.messenger.np.s1(i7).f25440y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-((TLRPC.Dialog) obj).f28055id));
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
