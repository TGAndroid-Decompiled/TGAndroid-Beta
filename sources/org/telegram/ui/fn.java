package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class fn implements MessagesController.MessagesLoadedCallback {
    public final yi f36348a;
    public final yn f36349b;
    public final kn f36350c;

    public fn(kn knVar, yi yiVar, yn ynVar) {
        this.f36350c = knVar;
        this.f36348a = yiVar;
        this.f36349b = ynVar;
    }

    @Override
    public final void onError() {
        this.f36348a.c(false);
        this.f36350c.f38002a.presentFragment(this.f36349b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f36348a.c(false);
        this.f36350c.f38002a.presentFragment(this.f36349b);
    }
}
