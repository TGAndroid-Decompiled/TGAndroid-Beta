package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class en implements MessagesController.MessagesLoadedCallback {
    public final wi f34047a;
    public final xn f34048b;
    public final jn f34049c;

    public en(jn jnVar, wi wiVar, xn xnVar) {
        this.f34049c = jnVar;
        this.f34047a = wiVar;
        this.f34048b = xnVar;
    }

    @Override
    public final void onError() {
        this.f34047a.c(false);
        this.f34049c.f35381a.presentFragment(this.f34048b);
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        this.f34047a.c(false);
        this.f34049c.f35381a.presentFragment(this.f34048b);
    }
}
