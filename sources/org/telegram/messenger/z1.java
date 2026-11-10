package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f26801a;
    public final int f26802b;
    public final long f26803c;
    public final Object d;
    public final Object f26804e;
    public final Object f26805f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f26801a = i10;
        this.d = obj;
        this.f26802b = i7;
        this.f26803c = j3;
        this.f26804e = obj2;
        this.f26805f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f26801a = 0;
        this.d = f2Var;
        this.f26804e = jArr;
        this.f26803c = j3;
        this.f26802b = i7;
        this.f26805f = runnable;
    }

    public z1(ui uiVar, TLObject tLObject, int i7, c20 c20Var, long j3) {
        this.f26801a = 1;
        this.d = uiVar;
        this.f26804e = tLObject;
        this.f26802b = i7;
        this.f26805f = c20Var;
        this.f26803c = j3;
    }

    public z1(yr yrVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, mk mkVar) {
        this.f26801a = 3;
        this.d = yrVar;
        this.f26803c = j3;
        this.f26802b = i7;
        this.f26804e = tL_updates_channelDifferenceTooLong;
        this.f26805f = mkVar;
    }

    public z1(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f26801a = 4;
        this.d = yrVar;
        this.f26804e = arrayList;
        this.f26805f = arrayList2;
        this.f26802b = i7;
        this.f26803c = j3;
    }

    public z1(gz gzVar, ij ijVar, TLRPC.Message message, long j3, int i7) {
        this.f26801a = 5;
        this.d = gzVar;
        this.f26804e = ijVar;
        this.f26805f = message;
        this.f26803c = j3;
        this.f26802b = i7;
    }

    public z1(k00 k00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f26801a = i10;
        this.d = k00Var;
        this.f26804e = messages_saveddialogs;
        this.f26803c = j3;
        this.f26805f = hVar;
        this.f26802b = i7;
    }
}
