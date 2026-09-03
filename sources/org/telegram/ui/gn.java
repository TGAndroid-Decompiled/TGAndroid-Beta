package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final yi f34478a;
    public final zn f34479b;
    public final ln f34480c;

    public gn(ln lnVar, yi yiVar, zn znVar) {
        this.f34480c = lnVar;
        this.f34478a = yiVar;
        this.f34479b = znVar;
    }

    @Override
    public final void onError() {
        this.f34478a.c(false);
        this.f34480c.f35808a.presentFragment(this.f34479b);
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        this.f34478a.c(false);
        this.f34480c.f35808a.presentFragment(this.f34479b);
    }
}
