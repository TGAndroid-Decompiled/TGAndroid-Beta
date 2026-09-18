package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class in implements MessagesController.MessagesLoadedCallback {
    public final bj f34635a;
    public final bo f34636b;
    public final nn f34637c;

    public in(nn nnVar, bj bjVar, bo boVar) {
        this.f34637c = nnVar;
        this.f34635a = bjVar;
        this.f34636b = boVar;
    }

    @Override
    public final void onError() {
        this.f34635a.c(false);
        this.f34637c.f36139a.presentFragment(this.f34636b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f34635a.c(false);
        this.f34637c.f36139a.presentFragment(this.f34636b);
    }
}
