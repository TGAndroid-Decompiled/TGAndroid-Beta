package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

public final class pw0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {

    public final ex0 f31673a;

    public pw0(ex0 ex0Var) {
        this.f31673a = ex0Var;
    }

    @Override
    public void h(int i10) {
        ex0.D(this.f31673a, i10);
    }

    @Override
    public void run(String str) {
        ex0 ex0Var = this.f31673a;
        new l40(ex0Var.getContext(), ex0Var.f28184k0, null, ex0Var.resourcesProvider).show();
    }
}
