package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f33954a;
    public final zn f33955b;
    public final ln f33956c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f33956c = lnVar;
        this.f33954a = ajVar;
        this.f33955b = znVar;
    }

    @Override
    public final void onError() {
        this.f33954a.c(false);
        this.f33956c.f35505a.presentFragment(this.f33955b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33954a.c(false);
        this.f33956c.f35505a.presentFragment(this.f33955b);
    }
}
