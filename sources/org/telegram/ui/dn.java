package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33160a;
    public final wn f33161b;
    public final in f33162c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33162c = inVar;
        this.f33160a = xiVar;
        this.f33161b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33160a.c(false);
        this.f33162c.f34557a.presentFragment(this.f33161b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33160a.c(false);
        this.f33162c.f34557a.presentFragment(this.f33161b);
    }
}
