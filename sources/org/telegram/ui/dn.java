package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33161a;
    public final wn f33162b;
    public final in f33163c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33163c = inVar;
        this.f33161a = xiVar;
        this.f33162b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33161a.c(false);
        this.f33163c.f34558a.presentFragment(this.f33162b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33161a.c(false);
        this.f33163c.f34558a.presentFragment(this.f33162b);
    }
}
