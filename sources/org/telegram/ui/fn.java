package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class fn implements MessagesController.MessagesLoadedCallback {
    public final yi f36362a;
    public final yn f36363b;
    public final kn f36364c;

    public fn(kn knVar, yi yiVar, yn ynVar) {
        this.f36364c = knVar;
        this.f36362a = yiVar;
        this.f36363b = ynVar;
    }

    @Override
    public final void onError() {
        this.f36362a.c(false);
        this.f36364c.f38076a.presentFragment(this.f36363b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f36362a.c(false);
        this.f36364c.f38076a.presentFragment(this.f36363b);
    }
}
