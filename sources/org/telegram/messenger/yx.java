package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class yx implements Runnable {
    public final int f28204a;
    public final boolean f28205b;
    public final Object f28206c;
    public final Object d;
    public final Object f28207e;
    public final Object f28208f;
    public final Object h;

    public yx(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f28204a = i7;
        this.f28206c = obj;
        this.d = obj2;
        this.f28207e = obj3;
        this.f28208f = obj4;
        this.h = obj5;
        this.f28205b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yx.run():void");
    }

    public yx(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f28204a = 1;
        this.f28206c = i5Var;
        this.f28205b = z10;
        this.d = arrayList;
        this.f28207e = hashMap;
        this.f28208f = hashMap2;
        this.h = arrayList2;
    }

    public yx(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f28204a = 3;
        this.f28206c = mpVar;
        this.d = tL_messages_dialogs;
        this.f28207e = hVar;
        this.f28208f = hVar2;
        this.f28205b = z10;
        this.h = longSparseIntArray;
    }
}
