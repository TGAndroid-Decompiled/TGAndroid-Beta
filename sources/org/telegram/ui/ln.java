package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ln implements MessagesController.MessagesLoadedCallback {
    public final ej f38054a;
    public final fo f38055b;
    public final qn f38056c;

    public ln(qn qnVar, ej ejVar, fo foVar) {
        this.f38056c = qnVar;
        this.f38054a = ejVar;
        this.f38055b = foVar;
    }

    @Override
    public final void onError() {
        this.f38054a.c(false);
        this.f38056c.f39497a.presentFragment(this.f38055b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38054a.c(false);
        this.f38056c.f39497a.presentFragment(this.f38055b);
    }
}
