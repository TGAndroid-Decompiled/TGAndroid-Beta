package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ly0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final cz0 f30327a;

    public ly0(cz0 cz0Var) {
        this.f30327a = cz0Var;
    }

    @Override
    public void g(int i10) {
        cz0.F(this.f30327a, i10);
    }

    @Override
    public void run(String str) {
        new i50(r1.getContext(), r1.f27305o0, null, this.f30327a.resourcesProvider).show();
    }
}
