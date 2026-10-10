package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f38102a;
    public final zn f38103b;
    public final ln f38104c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f38104c = lnVar;
        this.f38102a = ajVar;
        this.f38103b = znVar;
    }

    @Override
    public final void onError() {
        this.f38102a.c(false);
        this.f38104c.f39680a.presentFragment(this.f38103b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38102a.c(false);
        this.f38104c.f39680a.presentFragment(this.f38103b);
    }
}
