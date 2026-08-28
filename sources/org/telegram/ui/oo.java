package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class oo implements org.telegram.ui.Components.d80 {
    public final Context f41213a;
    public final vo f41214b;

    public oo(vo voVar, Context context) {
        this.f41214b = voVar;
        this.f41213a = context;
    }

    @Override
    public final void c() {
        this.f41214b.W(true);
    }

    @Override
    public final void j() {
        vo voVar = this.f41214b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.f41213a, voVar.f43536h0, voVar.U, voVar.f43539k0, voVar, voVar.V, true, ChatObject.isChannel(voVar.T));
        vo voVar2 = this.f41214b;
        voVar2.f43540l0 = a60Var;
        voVar2.f43540l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void k() {
    }
}
