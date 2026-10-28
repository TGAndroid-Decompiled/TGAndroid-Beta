package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class my0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final dz0 f30675a;

    public my0(dz0 dz0Var) {
        this.f30675a = dz0Var;
    }

    @Override
    public void g(int i10) {
        dz0.F(this.f30675a, i10);
    }

    @Override
    public void run(String str) {
        new i50(r1.getContext(), r1.f27595o0, null, this.f30675a.resourcesProvider).show();
    }
}
