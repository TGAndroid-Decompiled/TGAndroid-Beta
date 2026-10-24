package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class cy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final sy0 f25489a;

    public cy0(sy0 sy0Var) {
        this.f25489a = sy0Var;
    }

    @Override
    public void h(int i10) {
        sy0.E(this.f25489a, i10);
    }

    @Override
    public void run(String str) {
        new e50(r1.getContext(), r1.f30651o0, null, this.f25489a.resourcesProvider).show();
    }
}
