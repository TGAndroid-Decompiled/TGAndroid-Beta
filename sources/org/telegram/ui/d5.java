package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class d5 {
    public final c5 f33323a = new c5(this);
    public final NotificationCenter f33324b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f33325c;
    public final int d;
    public final int e;
    public gg.m0 f33326f;
    public boolean f33327g;

    public d5(int i10, TLObject tLObject, int i11) {
        this.f33325c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
