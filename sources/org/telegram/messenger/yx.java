package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class yx implements Runnable {
    public final int f28206a;
    public final boolean f28207b;
    public final Object f28208c;
    public final Object d;
    public final Object f28209e;
    public final Object f28210f;
    public final Object h;

    public yx(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f28206a = i7;
        this.f28208c = obj;
        this.d = obj2;
        this.f28209e = obj3;
        this.f28210f = obj4;
        this.h = obj5;
        this.f28207b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yx.run():void");
    }

    public yx(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f28206a = 1;
        this.f28208c = i5Var;
        this.f28207b = z10;
        this.d = arrayList;
        this.f28209e = hashMap;
        this.f28210f = hashMap2;
        this.h = arrayList2;
    }

    public yx(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f28206a = 3;
        this.f28208c = mpVar;
        this.d = tL_messages_dialogs;
        this.f28209e = hVar;
        this.f28210f = hVar2;
        this.f28207b = z10;
        this.h = longSparseIntArray;
    }
}
