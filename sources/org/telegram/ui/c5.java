package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class c5 {
    public final b5 f38171a = new b5(this);
    public final NotificationCenter f38172b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f38173c;
    public final int d;
    public final int e;
    public bi.y7 f38174f;
    public boolean f38175g;

    public c5(int i10, TLObject tLObject, int i11) {
        this.f38173c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
