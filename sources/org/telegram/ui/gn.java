package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f38172a;
    public final zn f38173b;
    public final ln f38174c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f38174c = lnVar;
        this.f38172a = ajVar;
        this.f38173b = znVar;
    }

    @Override
    public final void onError() {
        this.f38172a.c(false);
        this.f38174c.f39735a.presentFragment(this.f38173b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38172a.c(false);
        this.f38174c.f39735a.presentFragment(this.f38173b);
    }
}
