package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class jn implements MessagesController.MessagesLoadedCallback {
    public final aj f37843a;
    public final co f37844b;
    public final on f37845c;

    public jn(on onVar, aj ajVar, co coVar) {
        this.f37845c = onVar;
        this.f37843a = ajVar;
        this.f37844b = coVar;
    }

    @Override
    public final void onError() {
        this.f37843a.c(false);
        this.f37845c.f39311a.presentFragment(this.f37844b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37843a.c(false);
        this.f37845c.f39311a.presentFragment(this.f37844b);
    }
}
