package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f38058a;
    public final zn f38059b;
    public final ln f38060c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f38060c = lnVar;
        this.f38058a = ajVar;
        this.f38059b = znVar;
    }

    @Override
    public final void onError() {
        this.f38058a.c(false);
        this.f38060c.f39636a.presentFragment(this.f38059b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38058a.c(false);
        this.f38060c.f39636a.presentFragment(this.f38059b);
    }
}
