package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f26698a;
    public final int f26699b;
    public final long f26700c;
    public final Object d;
    public final Object f26701e;
    public final Object f26702f;

    public z1(Object obj, int i3, long j10, Object obj2, Serializable serializable, int i10) {
        this.f26698a = i10;
        this.d = obj;
        this.f26699b = i3;
        this.f26700c = j10;
        this.f26701e = obj2;
        this.f26702f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j10, int i3, Runnable runnable) {
        this.f26698a = 0;
        this.d = f2Var;
        this.f26701e = jArr;
        this.f26700c = j10;
        this.f26699b = i3;
        this.f26702f = runnable;
    }

    public z1(li liVar, TLObject tLObject, int i3, u10 u10Var, long j10) {
        this.f26698a = 1;
        this.d = liVar;
        this.f26701e = tLObject;
        this.f26699b = i3;
        this.f26702f = u10Var;
        this.f26700c = j10;
    }

    public z1(qr qrVar, long j10, int i3, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, dk dkVar) {
        this.f26698a = 3;
        this.d = qrVar;
        this.f26700c = j10;
        this.f26699b = i3;
        this.f26701e = tL_updates_channelDifferenceTooLong;
        this.f26702f = dkVar;
    }

    public z1(qr qrVar, ArrayList arrayList, ArrayList arrayList2, int i3, long j10) {
        this.f26698a = 4;
        this.d = qrVar;
        this.f26701e = arrayList;
        this.f26702f = arrayList2;
        this.f26699b = i3;
        this.f26700c = j10;
    }

    public z1(yy yyVar, zi ziVar, TLRPC.Message message, long j10, int i3) {
        this.f26698a = 5;
        this.d = yyVar;
        this.f26701e = ziVar;
        this.f26702f = message;
        this.f26700c = j10;
        this.f26699b = i3;
    }

    public z1(c00 c00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i3, int i10) {
        this.f26698a = i10;
        this.d = c00Var;
        this.f26701e = messages_saveddialogs;
        this.f26700c = j10;
        this.f26702f = hVar;
        this.f26699b = i3;
    }
}
