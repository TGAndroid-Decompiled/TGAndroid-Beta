package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class in implements MessagesController.MessagesLoadedCallback {
    public final aj f34693a;
    public final bo f34694b;
    public final nn f34695c;

    public in(nn nnVar, aj ajVar, bo boVar) {
        this.f34695c = nnVar;
        this.f34693a = ajVar;
        this.f34694b = boVar;
    }

    @Override
    public final void onError() {
        this.f34693a.c(false);
        this.f34695c.f36017a.presentFragment(this.f34694b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f34693a.c(false);
        this.f34695c.f36017a.presentFragment(this.f34694b);
    }
}
