package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class e5 {
    public final d5 f36360a = new d5(this);
    public final NotificationCenter f36361b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36362c;
    public final int d;
    public final int e;
    public ai.b8 f36363f;
    public boolean f36364g;

    public e5(int i10, TLObject tLObject, int i11) {
        this.f36362c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
