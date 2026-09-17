package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class in implements MessagesController.MessagesLoadedCallback {
    public final bj f34630a;
    public final bo f34631b;
    public final nn f34632c;

    public in(nn nnVar, bj bjVar, bo boVar) {
        this.f34632c = nnVar;
        this.f34630a = bjVar;
        this.f34631b = boVar;
    }

    @Override
    public final void onError() {
        this.f34630a.c(false);
        this.f34632c.f36134a.presentFragment(this.f34631b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f34630a.c(false);
        this.f34632c.f36134a.presentFragment(this.f34631b);
    }
}
