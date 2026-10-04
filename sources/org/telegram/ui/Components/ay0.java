package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ay0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final qy0 f24715a;

    public ay0(qy0 qy0Var) {
        this.f24715a = qy0Var;
    }

    @Override
    public void m(int i10) {
        qy0.B(this.f24715a, i10);
    }

    @Override
    public void run(String str) {
        new a50(r1.getContext(), r1.f30210o0, null, this.f24715a.resourcesProvider).show();
    }
}
