package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class d5 {
    public final c5 f34875a = new c5(this);
    public final NotificationCenter f34876b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f34877c;
    public final int d;
    public final int e;
    public di.j5 f34878f;
    public boolean f34879g;

    public d5(int i10, TLObject tLObject, int i11) {
        this.f34877c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
