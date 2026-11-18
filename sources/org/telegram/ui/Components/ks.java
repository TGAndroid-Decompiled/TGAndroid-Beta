package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ks extends z41 {
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
    public boolean f36867a0;
    public boolean f36868b0;
    public int f36869c0;
    public int f36870d0;
    public String f36871e0;
    public final mo f36872f0;

    public ks(ck0 ck0Var, Context context, int i7, int i10) {
        super(ck0Var, context, i7, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        mm0 mm0Var = (mm0) this;
        this.f36872f0 = new mo(mm0Var, 8);
        this.f42811w = new d(mm0Var, 10);
        this.Q = i7;
        this.R = i10;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ks.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.Q;
        ArrayList arrayList2 = org.telegram.messenger.mp.u1(i7).f25811y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-((TLRPC.Dialog) obj).f28409id));
            if (O0 != null && org.telegram.messenger.v3.V(O0) && org.telegram.messenger.v3.t0(O0) && !org.telegram.messenger.v3.r0(O0)) {
                arrayList.add(O0);
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
