package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class a5 {
    public final z4 f34670a = new z4(this);
    public final NotificationCenter f34671b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f34672c;
    public final int d;
    public final int f34673e;
    public ci.k5 f34674f;
    public boolean f34675g;

    public a5(int i10, TLObject tLObject, int i11) {
        this.f34672c = tLObject;
        this.d = i10;
        this.f34673e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
