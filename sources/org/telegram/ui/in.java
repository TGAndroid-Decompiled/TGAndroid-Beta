package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class in implements MessagesController.MessagesLoadedCallback {
    public final aj f34708a;
    public final bo f34709b;
    public final nn f34710c;

    public in(nn nnVar, aj ajVar, bo boVar) {
        this.f34710c = nnVar;
        this.f34708a = ajVar;
        this.f34709b = boVar;
    }

    @Override
    public final void onError() {
        this.f34708a.c(false);
        this.f34710c.f36012a.presentFragment(this.f34709b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f34708a.c(false);
        this.f34710c.f36012a.presentFragment(this.f34709b);
    }
}
