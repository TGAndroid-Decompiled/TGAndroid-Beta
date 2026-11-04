package org.telegram.ui;

import org.telegram.tgnet.TLObject;
public abstract class a5 {
    public final z4 f43596a = new z4(this, 0);
    public final org.telegram.messenger.hs f43597b = org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0);
    public final Object f43598c;
    public final int d;
    public final int f43599e;
    public ci.i7 f43600f;
    public boolean f43601g;

    public a5(int i3, int i10, TLObject tLObject) {
        this.f43598c = tLObject;
        this.d = i3;
        this.f43599e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
