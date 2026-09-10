package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class kn implements MessagesController.MessagesLoadedCallback {
    public final cj f34417a;
    public final eo f34418b;
    public final pn f34419c;

    public kn(pn pnVar, cj cjVar, eo eoVar) {
        this.f34419c = pnVar;
        this.f34417a = cjVar;
        this.f34418b = eoVar;
    }

    @Override
    public final void onError() {
        this.f34417a.c(false);
        this.f34419c.f35881a.presentFragment(this.f34418b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f34417a.c(false);
        this.f34419c.f35881a.presentFragment(this.f34418b);
    }
}
