package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class jn implements MessagesController.MessagesLoadedCallback {
    public final aj f37816a;
    public final co f37817b;
    public final on f37818c;

    public jn(on onVar, aj ajVar, co coVar) {
        this.f37818c = onVar;
        this.f37816a = ajVar;
        this.f37817b = coVar;
    }

    @Override
    public final void onError() {
        this.f37816a.c(false);
        this.f37818c.f39284a.presentFragment(this.f37817b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37816a.c(false);
        this.f37818c.f39284a.presentFragment(this.f37817b);
    }
}
