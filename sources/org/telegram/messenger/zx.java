package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class zx implements Runnable {
    public final int f28364a;
    public final boolean f28365b;
    public final Object f28366c;
    public final Object d;
    public final Object f28367e;
    public final Object f28368f;
    public final Object h;

    public zx(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f28364a = i7;
        this.f28366c = obj;
        this.d = obj2;
        this.f28367e = obj3;
        this.f28368f = obj4;
        this.h = obj5;
        this.f28365b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zx.run():void");
    }

    public zx(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f28364a = 1;
        this.f28366c = i5Var;
        this.f28365b = z10;
        this.d = arrayList;
        this.f28367e = hashMap;
        this.f28368f = hashMap2;
        this.h = arrayList2;
    }

    public zx(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f28364a = 3;
        this.f28366c = npVar;
        this.d = tL_messages_dialogs;
        this.f28367e = hVar;
        this.f28368f = hVar2;
        this.f28365b = z10;
        this.h = longSparseIntArray;
    }
}
