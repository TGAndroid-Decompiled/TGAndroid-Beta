package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class a5 {
    public final z4 f34663a = new z4(this);
    public final NotificationCenter f34664b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f34665c;
    public final int d;
    public final int f34666e;
    public ci.k5 f34667f;
    public boolean f34668g;

    public a5(int i10, TLObject tLObject, int i11) {
        this.f34665c = tLObject;
        this.d = i10;
        this.f34666e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
