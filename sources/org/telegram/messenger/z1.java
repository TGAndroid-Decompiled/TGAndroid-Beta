package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f26797a;
    public final int f26798b;
    public final long f26799c;
    public final Object d;
    public final Object f26800e;
    public final Object f26801f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f26797a = i10;
        this.d = obj;
        this.f26798b = i7;
        this.f26799c = j3;
        this.f26800e = obj2;
        this.f26801f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f26797a = 0;
        this.d = f2Var;
        this.f26800e = jArr;
        this.f26799c = j3;
        this.f26798b = i7;
        this.f26801f = runnable;
    }

    public z1(ui uiVar, TLObject tLObject, int i7, c20 c20Var, long j3) {
        this.f26797a = 1;
        this.d = uiVar;
        this.f26800e = tLObject;
        this.f26798b = i7;
        this.f26801f = c20Var;
        this.f26799c = j3;
    }

    public z1(yr yrVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, mk mkVar) {
        this.f26797a = 3;
        this.d = yrVar;
        this.f26799c = j3;
        this.f26798b = i7;
        this.f26800e = tL_updates_channelDifferenceTooLong;
        this.f26801f = mkVar;
    }

    public z1(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f26797a = 4;
        this.d = yrVar;
        this.f26800e = arrayList;
        this.f26801f = arrayList2;
        this.f26798b = i7;
        this.f26799c = j3;
    }

    public z1(gz gzVar, ij ijVar, TLRPC.Message message, long j3, int i7) {
        this.f26797a = 5;
        this.d = gzVar;
        this.f26800e = ijVar;
        this.f26801f = message;
        this.f26799c = j3;
        this.f26798b = i7;
    }

    public z1(k00 k00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f26797a = i10;
        this.d = k00Var;
        this.f26800e = messages_saveddialogs;
        this.f26799c = j3;
        this.f26801f = hVar;
        this.f26798b = i7;
    }
}
