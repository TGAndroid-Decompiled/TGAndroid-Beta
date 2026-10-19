package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class e5 {
    public final d5 f36539a = new d5(this);
    public final NotificationCenter f36540b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36541c;
    public final int d;
    public final int e;
    public ai.c8 f36542f;
    public boolean f36543g;

    public e5(int i10, TLObject tLObject, int i11) {
        this.f36541c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
