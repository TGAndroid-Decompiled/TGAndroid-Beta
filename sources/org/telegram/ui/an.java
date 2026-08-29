package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class an implements MessagesController.MessagesLoadedCallback {
    public final ri f36571a;
    public final tn f36572b;
    public final fn f36573c;

    public an(fn fnVar, ri riVar, tn tnVar) {
        this.f36573c = fnVar;
        this.f36571a = riVar;
        this.f36572b = tnVar;
    }

    @Override
    public final void onError() {
        this.f36571a.c(false);
        this.f36573c.f38212a.presentFragment(this.f36572b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f36571a.c(false);
        this.f36573c.f38212a.presentFragment(this.f36572b);
    }
}
