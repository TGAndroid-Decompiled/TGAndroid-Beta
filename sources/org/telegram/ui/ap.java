package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ap implements org.telegram.ui.Components.i90 {
    public final Context f34871a;
    public final hp f34872b;

    public ap(hp hpVar, Context context) {
        this.f34872b = hpVar;
        this.f34871a = context;
    }

    @Override
    public final void c() {
        this.f34872b.W(true);
    }

    @Override
    public final void h() {
        hp hpVar = this.f34872b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.f34871a, hpVar.f37141l0, hpVar.Y, hpVar.f37144o0, hpVar, hpVar.Z, true, ChatObject.isChannel(hpVar.X));
        hp hpVar2 = this.f34872b;
        hpVar2.f37145p0 = f70Var;
        hpVar2.f37145p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
