package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class c5 {
    public final b5 f38264a = new b5(this);
    public final NotificationCenter f38265b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f38266c;
    public final int d;
    public final int e;
    public bi.y7 f38267f;
    public boolean f38268g;

    public c5(int i10, TLObject tLObject, int i11) {
        this.f38266c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
