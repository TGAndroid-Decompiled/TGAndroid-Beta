package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class ap implements org.telegram.ui.Components.i90 {
    public final Context f34876a;
    public final hp f34877b;

    public ap(hp hpVar, Context context) {
        this.f34877b = hpVar;
        this.f34876a = context;
    }

    @Override
    public final void c() {
        this.f34877b.W(true);
    }

    @Override
    public final void h() {
        hp hpVar = this.f34877b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.f34876a, hpVar.f37146l0, hpVar.Y, hpVar.f37149o0, hpVar, hpVar.Z, true, ChatObject.isChannel(hpVar.X));
        hp hpVar2 = this.f34877b;
        hpVar2.f37150p0 = f70Var;
        hpVar2.f37150p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
