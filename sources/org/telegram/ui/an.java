package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class an implements MessagesController.MessagesLoadedCallback {
    public final si f37835a;
    public final un f37836b;
    public final fn f37837c;

    public an(fn fnVar, si siVar, un unVar) {
        this.f37837c = fnVar;
        this.f37835a = siVar;
        this.f37836b = unVar;
    }

    @Override
    public final void onError() {
        this.f37835a.c(false);
        this.f37837c.f39423a.presentFragment(this.f37836b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37835a.c(false);
        this.f37837c.f39423a.presentFragment(this.f37836b);
    }
}
