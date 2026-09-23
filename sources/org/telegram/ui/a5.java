package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class a5 {
    public final z4 f31660a = new z4(this);
    public final NotificationCenter f31661b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f31662c;
    public final int d;
    public final int e;
    public ci.k5 f31663f;
    public boolean f31664g;

    public a5(int i10, TLObject tLObject, int i11) {
        this.f31662c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
