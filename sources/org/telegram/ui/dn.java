package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33149a;
    public final wn f33150b;
    public final in f33151c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33151c = inVar;
        this.f33149a = xiVar;
        this.f33150b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33149a.c(false);
        this.f33151c.f34559a.presentFragment(this.f33150b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33149a.c(false);
        this.f33151c.f34559a.presentFragment(this.f33150b);
    }
}
