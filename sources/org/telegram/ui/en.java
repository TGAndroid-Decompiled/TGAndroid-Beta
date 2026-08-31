package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class en implements MessagesController.MessagesLoadedCallback {
    public final wi f36618a;
    public final xn f36619b;
    public final jn f36620c;

    public en(jn jnVar, wi wiVar, xn xnVar) {
        this.f36620c = jnVar;
        this.f36618a = wiVar;
        this.f36619b = xnVar;
    }

    @Override
    public final void onError() {
        this.f36618a.c(false);
        this.f36620c.f38188a.presentFragment(this.f36619b);
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        this.f36618a.c(false);
        this.f36620c.f38188a.presentFragment(this.f36619b);
    }
}
