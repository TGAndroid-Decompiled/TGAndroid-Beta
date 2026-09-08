package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class jn implements MessagesController.MessagesLoadedCallback {
    public final aj f37842a;
    public final co f37843b;
    public final on f37844c;

    public jn(on onVar, aj ajVar, co coVar) {
        this.f37844c = onVar;
        this.f37842a = ajVar;
        this.f37843b = coVar;
    }

    @Override
    public final void onError() {
        this.f37842a.c(false);
        this.f37844c.f39310a.presentFragment(this.f37843b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37842a.c(false);
        this.f37844c.f39310a.presentFragment(this.f37843b);
    }
}
