package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f38138a;
    public final zn f38139b;
    public final ln f38140c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f38140c = lnVar;
        this.f38138a = ajVar;
        this.f38139b = znVar;
    }

    @Override
    public final void onError() {
        this.f38138a.c(false);
        this.f38140c.f39701a.presentFragment(this.f38139b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38138a.c(false);
        this.f38140c.f39701a.presentFragment(this.f38139b);
    }
}
