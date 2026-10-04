package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ap implements org.telegram.ui.Components.i90 {
    public final Context f34870a;
    public final hp f34871b;

    public ap(hp hpVar, Context context) {
        this.f34871b = hpVar;
        this.f34870a = context;
    }

    @Override
    public final void c() {
        this.f34871b.W(true);
    }

    @Override
    public final void h() {
        hp hpVar = this.f34871b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.f34870a, hpVar.f37140l0, hpVar.Y, hpVar.f37143o0, hpVar, hpVar.Z, true, ChatObject.isChannel(hpVar.X));
        hp hpVar2 = this.f34871b;
        hpVar2.f37144p0 = f70Var;
        hpVar2.f37144p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
