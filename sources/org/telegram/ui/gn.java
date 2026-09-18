package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final zi f33902a;
    public final zn f33903b;
    public final ln f33904c;

    public gn(ln lnVar, zi ziVar, zn znVar) {
        this.f33904c = lnVar;
        this.f33902a = ziVar;
        this.f33903b = znVar;
    }

    @Override
    public final void onError() {
        this.f33902a.c(false);
        this.f33904c.f35408a.presentFragment(this.f33903b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33902a.c(false);
        this.f33904c.f35408a.presentFragment(this.f33903b);
    }
}
