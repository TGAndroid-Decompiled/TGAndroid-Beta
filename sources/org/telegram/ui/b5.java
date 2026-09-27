package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
public abstract class b5 {
    public final a5 f32237a = new a5(this);
    public final NotificationCenter f32238b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object f32239c;
    public final int d;
    public final int e;
    public ci.k5 f32240f;
    public boolean f32241g;

    public b5(int i10, TLObject tLObject, int i11) {
        this.f32239c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
