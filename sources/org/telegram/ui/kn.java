package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class kn implements MessagesController.MessagesLoadedCallback {
    public final ej f39559a;
    public final eo f39560b;
    public final pn f39561c;

    public kn(pn pnVar, ej ejVar, eo eoVar) {
        this.f39561c = pnVar;
        this.f39559a = ejVar;
        this.f39560b = eoVar;
    }

    @Override
    public final void onError() {
        this.f39559a.c(false);
        this.f39561c.f40998a.presentFragment(this.f39560b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f39559a.c(false);
        this.f39561c.f40998a.presentFragment(this.f39560b);
    }
}
