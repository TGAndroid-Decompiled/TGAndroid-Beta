package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class e8 implements MessagesStorage.BooleanCallback {
    public final sn f36423a;
    public final f8 f36424b;

    public e8(f8 f8Var, sn snVar) {
        this.f36424b = f8Var;
        this.f36423a = snVar;
    }

    @Override
    public final void run(boolean z10) {
        h8 h8Var = this.f36424b.f36847b;
        h8Var.f37476x.finishFragment();
        k8 k8Var = h8Var.f37476x;
        this.f36423a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
