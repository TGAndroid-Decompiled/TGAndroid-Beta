package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33240a;
    public final wn f33241b;
    public final in f33242c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33242c = inVar;
        this.f33240a = xiVar;
        this.f33241b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33240a.c(false);
        this.f33242c.f34642a.presentFragment(this.f33241b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33240a.c(false);
        this.f33242c.f34642a.presentFragment(this.f33241b);
    }
}
