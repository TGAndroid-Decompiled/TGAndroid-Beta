package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final zi f33938a;
    public final zn f33939b;
    public final ln f33940c;

    public gn(ln lnVar, zi ziVar, zn znVar) {
        this.f33940c = lnVar;
        this.f33938a = ziVar;
        this.f33939b = znVar;
    }

    @Override
    public final void onError() {
        this.f33938a.c(false);
        this.f33940c.f35482a.presentFragment(this.f33939b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33938a.c(false);
        this.f33940c.f35482a.presentFragment(this.f33939b);
    }
}
