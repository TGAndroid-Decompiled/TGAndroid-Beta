package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class c5 {
    public final b5 f36324a = new b5(this);
    public final NotificationCenter f36325b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36326c;
    public final int d;
    public final int f36327e;
    public ci.j5 f36328f;
    public boolean f36329g;

    public c5(int i10, TLObject tLObject, int i11) {
        this.f36326c = tLObject;
        this.d = i10;
        this.f36327e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
