package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class en implements MessagesController.MessagesLoadedCallback {
    public final xi f32977a;
    public final xn f32978b;
    public final jn f32979c;

    public en(jn jnVar, xi xiVar, xn xnVar) {
        this.f32979c = jnVar;
        this.f32977a = xiVar;
        this.f32978b = xnVar;
    }

    @Override
    public final void onError() {
        this.f32977a.c(false);
        this.f32979c.f34487a.presentFragment(this.f32978b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f32977a.c(false);
        this.f32979c.f34487a.presentFragment(this.f32978b);
    }
}
