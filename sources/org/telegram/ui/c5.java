package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class c5 {
    public final b5 f36322a = new b5(this);
    public final NotificationCenter f36323b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36324c;
    public final int d;
    public final int f36325e;
    public ci.j5 f36326f;
    public boolean f36327g;

    public c5(int i10, TLObject tLObject, int i11) {
        this.f36324c = tLObject;
        this.d = i10;
        this.f36325e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
