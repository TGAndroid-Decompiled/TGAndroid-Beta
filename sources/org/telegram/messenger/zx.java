package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class zx implements Runnable {
    public final int f26988a;
    public final boolean f26989b;
    public final Object f26990c;
    public final Object d;
    public final Object f26991e;
    public final Object f26992f;
    public final Object h;

    public zx(int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f26988a = i3;
        this.f26990c = obj;
        this.d = obj2;
        this.f26991e = obj3;
        this.f26992f = obj4;
        this.h = obj5;
        this.f26989b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zx.run():void");
    }

    public zx(g5 g5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f26988a = 1;
        this.f26990c = g5Var;
        this.f26989b = z10;
        this.d = arrayList;
        this.f26991e = hashMap;
        this.f26992f = hashMap2;
        this.h = arrayList2;
    }

    public zx(hp hpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f26988a = 3;
        this.f26990c = hpVar;
        this.d = tL_messages_dialogs;
        this.f26991e = hVar;
        this.f26992f = hVar2;
        this.f26989b = z10;
        this.h = longSparseIntArray;
    }
}
