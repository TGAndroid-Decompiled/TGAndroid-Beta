package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class b5 {
    public final a5 f35330a = new a5(this);
    public final NotificationCenter f35331b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f35332c;
    public final int d;
    public final int f35333e;
    public hg.m0 f35334f;
    public boolean f35335g;

    public b5(int i10, TLObject tLObject, int i11) {
        this.f35332c = tLObject;
        this.d = i10;
        this.f35333e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
