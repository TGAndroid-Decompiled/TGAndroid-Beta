package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class d5 {
    public final c5 f36467a = new c5(this);
    public final NotificationCenter f36468b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f36469c;
    public final int d;
    public final int e;
    public ai.c8 f36470f;
    public boolean f36471g;

    public d5(int i10, TLObject tLObject, int i11) {
        this.f36469c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
