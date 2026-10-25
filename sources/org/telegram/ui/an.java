package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class an implements MessagesController.MessagesLoadedCallback {
    public final si f37832a;
    public final un f37833b;
    public final fn f37834c;

    public an(fn fnVar, si siVar, un unVar) {
        this.f37834c = fnVar;
        this.f37832a = siVar;
        this.f37833b = unVar;
    }

    @Override
    public final void onError() {
        this.f37832a.c(false);
        this.f37834c.f39420a.presentFragment(this.f37833b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37832a.c(false);
        this.f37834c.f39420a.presentFragment(this.f37833b);
    }
}
