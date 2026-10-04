package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class fn implements MessagesController.MessagesLoadedCallback {
    public final yi f36354a;
    public final yn f36355b;
    public final kn f36356c;

    public fn(kn knVar, yi yiVar, yn ynVar) {
        this.f36356c = knVar;
        this.f36354a = yiVar;
        this.f36355b = ynVar;
    }

    @Override
    public final void onError() {
        this.f36354a.c(false);
        this.f36356c.f38008a.presentFragment(this.f36355b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f36354a.c(false);
        this.f36356c.f38008a.presentFragment(this.f36355b);
    }
}
