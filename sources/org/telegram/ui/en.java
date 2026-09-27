package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class en implements MessagesController.MessagesLoadedCallback {
    public final zi f33291a;
    public final xn f33292b;
    public final jn f33293c;

    public en(jn jnVar, zi ziVar, xn xnVar) {
        this.f33293c = jnVar;
        this.f33291a = ziVar;
        this.f33292b = xnVar;
    }

    @Override
    public final void onError() {
        this.f33291a.c(false);
        this.f33293c.f34766a.presentFragment(this.f33292b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f33291a.c(false);
        this.f33293c.f34766a.presentFragment(this.f33292b);
    }
}
