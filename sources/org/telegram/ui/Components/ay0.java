package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class ay0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final qy0 f24745a;

    public ay0(qy0 qy0Var) {
        this.f24745a = qy0Var;
    }

    @Override
    public void j(int i10) {
        qy0.D(this.f24745a, i10);
    }

    @Override
    public void run(String str) {
        new g50(r1.getContext(), r1.f29761o0, null, this.f24745a.resourcesProvider).show();
    }
}
