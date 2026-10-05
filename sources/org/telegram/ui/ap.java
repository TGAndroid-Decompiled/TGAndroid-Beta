package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ap implements org.telegram.ui.Components.i90 {
    public final Context f34927a;
    public final hp f34928b;

    public ap(hp hpVar, Context context) {
        this.f34928b = hpVar;
        this.f34927a = context;
    }

    @Override
    public final void c() {
        this.f34928b.W(true);
    }

    @Override
    public final void h() {
        hp hpVar = this.f34928b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.f34927a, hpVar.m0, hpVar.Z, hpVar.f37150p0, hpVar, hpVar.f37131a0, true, ChatObject.isChannel(hpVar.Y));
        hp hpVar2 = this.f34928b;
        hpVar2.f37151q0 = f70Var;
        hpVar2.f37151q0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
