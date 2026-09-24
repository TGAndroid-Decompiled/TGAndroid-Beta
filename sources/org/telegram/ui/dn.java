package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class dn implements MessagesController.MessagesLoadedCallback {
    public final xi f33133a;
    public final wn f33134b;
    public final in f33135c;

    public dn(in inVar, xi xiVar, wn wnVar) {
        this.f33135c = inVar;
        this.f33133a = xiVar;
        this.f33134b = wnVar;
    }

    @Override
    public final void onError() {
        this.f33133a.c(false);
        this.f33135c.f34543a.presentFragment(this.f33134b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33133a.c(false);
        this.f33135c.f34543a.presentFragment(this.f33134b);
    }
}
