package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ms extends c51 {
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
    public boolean f37624a0;
    public boolean f37625b0;
    public int f37626c0;
    public int f37627d0;
    public String f37628e0;
    public final oo f37629f0;

    public ms(ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        pm0 pm0Var = (pm0) this;
        this.f37629f0 = new oo(pm0Var, 8);
        this.f34070w = new d(pm0Var, 10);
        this.Q = i7;
        this.R = i10;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ms.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i7 = this.Q;
        ArrayList arrayList2 = org.telegram.messenger.mp.u1(i7).f25837y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-((TLRPC.Dialog) obj).f28435id));
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
