package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33159a;
    public final wn f33160b;
    public final in f33161c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33161c = inVar;
        this.f33159a = xiVar;
        this.f33160b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33159a.c(false);
        this.f33161c.f34556a.presentFragment(this.f33160b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33159a.c(false);
        this.f33161c.f34556a.presentFragment(this.f33160b);
    }
}
