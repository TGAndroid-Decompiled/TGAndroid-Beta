package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class fn implements MessagesController.MessagesLoadedCallback {
    public final yi f36349a;
    public final yn f36350b;
    public final kn f36351c;

    public fn(kn knVar, yi yiVar, yn ynVar) {
        this.f36351c = knVar;
        this.f36349a = yiVar;
        this.f36350b = ynVar;
    }

    @Override
    public final void onError() {
        this.f36349a.c(false);
        this.f36351c.f38003a.presentFragment(this.f36350b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f36349a.c(false);
        this.f36351c.f38003a.presentFragment(this.f36350b);
    }
}
