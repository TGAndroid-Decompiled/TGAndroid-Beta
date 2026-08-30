package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class b5 {
    public final a5 f32790a = new a5(this);
    public final NotificationCenter f32791b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f32792c;
    public final int d;
    public final int e;
    public gg.m0 f32793f;
    public boolean f32794g;

    public b5(int i10, TLObject tLObject, int i11) {
        this.f32792c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
