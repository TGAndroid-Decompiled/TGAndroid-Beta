package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class en implements MessagesController.MessagesLoadedCallback {
    public final wi f36525a;
    public final xn f36526b;
    public final jn f36527c;

    public en(jn jnVar, wi wiVar, xn xnVar) {
        this.f36527c = jnVar;
        this.f36525a = wiVar;
        this.f36526b = xnVar;
    }

    @Override
    public final void onError() {
        this.f36525a.c(false);
        this.f36527c.f38085a.presentFragment(this.f36526b);
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        this.f36525a.c(false);
        this.f36527c.f38085a.presentFragment(this.f36526b);
    }
}
