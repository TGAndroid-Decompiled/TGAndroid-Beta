package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class jn implements MessagesController.MessagesLoadedCallback {
    public final aj f37815a;
    public final co f37816b;
    public final on f37817c;

    public jn(on onVar, aj ajVar, co coVar) {
        this.f37817c = onVar;
        this.f37815a = ajVar;
        this.f37816b = coVar;
    }

    @Override
    public final void onError() {
        this.f37815a.c(false);
        this.f37817c.f39283a.presentFragment(this.f37816b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37815a.c(false);
        this.f37817c.f39283a.presentFragment(this.f37816b);
    }
}
