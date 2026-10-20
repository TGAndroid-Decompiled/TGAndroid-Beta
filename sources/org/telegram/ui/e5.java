package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class e5 {
    public final d5 f36545a = new d5(this);
    public final NotificationCenter f36546b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36547c;
    public final int d;
    public final int e;
    public ai.c8 f36548f;
    public boolean f36549g;

    public e5(int i10, TLObject tLObject, int i11) {
        this.f36547c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
