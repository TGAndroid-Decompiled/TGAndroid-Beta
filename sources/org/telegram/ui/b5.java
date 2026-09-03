package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class b5 {
    public final a5 f35351a = new a5(this);
    public final NotificationCenter f35352b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f35353c;
    public final int d;
    public final int f35354e;
    public hg.m0 f35355f;
    public boolean f35356g;

    public b5(int i10, TLObject tLObject, int i11) {
        this.f35353c = tLObject;
        this.d = i10;
        this.f35354e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
