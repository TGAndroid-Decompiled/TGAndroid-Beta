package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class kn implements MessagesController.MessagesLoadedCallback {
    public final ej f39553a;
    public final eo f39554b;
    public final pn f39555c;

    public kn(pn pnVar, ej ejVar, eo eoVar) {
        this.f39555c = pnVar;
        this.f39553a = ejVar;
        this.f39554b = eoVar;
    }

    @Override
    public final void onError() {
        this.f39553a.c(false);
        this.f39555c.f41000a.presentFragment(this.f39554b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f39553a.c(false);
        this.f39555c.f41000a.presentFragment(this.f39554b);
    }
}
