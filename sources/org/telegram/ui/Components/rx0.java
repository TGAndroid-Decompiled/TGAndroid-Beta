package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class rx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final hy0 f28066a;

    public rx0(hy0 hy0Var) {
        this.f28066a = hy0Var;
    }

    @Override
    public void m(int i10) {
        hy0.B(this.f28066a, i10);
    }

    @Override
    public void run(String str) {
        new z40(r1.getContext(), r1.f24933o0, null, this.f28066a.resourcesProvider).show();
    }
}
