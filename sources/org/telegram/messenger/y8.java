package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class y8 implements Runnable {
    public final int f19562a;
    public final long f19563b;
    public final long f19564c;
    public final Object d;
    public final Object e;

    public y8(Object obj, long j10, long j11, Object obj2, int i10) {
        this.f19562a = i10;
        this.d = obj;
        this.f19563b = j10;
        this.f19564c = j11;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y8.run():void");
    }

    public y8(f1 f1Var, long j10, TLObject tLObject, long j11, int i10) {
        this.f19562a = i10;
        this.d = f1Var;
        this.f19563b = j10;
        this.e = tLObject;
        this.f19564c = j11;
    }

    public y8(d9 d9Var, Float f7, long j10, long j11) {
        this.f19562a = 0;
        this.d = d9Var;
        this.e = f7;
        this.f19563b = j10;
        this.f19564c = j11;
    }
}
