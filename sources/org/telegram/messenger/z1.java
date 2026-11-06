package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f26776a;
    public final int f26777b;
    public final long f26778c;
    public final Object d;
    public final Object f26779e;
    public final Object f26780f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f26776a = i10;
        this.d = obj;
        this.f26777b = i7;
        this.f26778c = j3;
        this.f26779e = obj2;
        this.f26780f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f26776a = 0;
        this.d = f2Var;
        this.f26779e = jArr;
        this.f26778c = j3;
        this.f26777b = i7;
        this.f26780f = runnable;
    }

    public z1(ui uiVar, TLObject tLObject, int i7, c20 c20Var, long j3) {
        this.f26776a = 1;
        this.d = uiVar;
        this.f26779e = tLObject;
        this.f26777b = i7;
        this.f26780f = c20Var;
        this.f26778c = j3;
    }

    public z1(yr yrVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, nk nkVar) {
        this.f26776a = 3;
        this.d = yrVar;
        this.f26778c = j3;
        this.f26777b = i7;
        this.f26779e = tL_updates_channelDifferenceTooLong;
        this.f26780f = nkVar;
    }

    public z1(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f26776a = 4;
        this.d = yrVar;
        this.f26779e = arrayList;
        this.f26780f = arrayList2;
        this.f26777b = i7;
        this.f26778c = j3;
    }

    public z1(gz gzVar, ij ijVar, TLRPC.Message message, long j3, int i7) {
        this.f26776a = 5;
        this.d = gzVar;
        this.f26779e = ijVar;
        this.f26780f = message;
        this.f26778c = j3;
        this.f26777b = i7;
    }

    public z1(k00 k00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f26776a = i10;
        this.d = k00Var;
        this.f26779e = messages_saveddialogs;
        this.f26778c = j3;
        this.f26780f = hVar;
        this.f26777b = i7;
    }
}
