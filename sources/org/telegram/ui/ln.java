package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class ln implements MessagesController.MessagesLoadedCallback {
    public final ej f37793a;
    public final fo f37794b;
    public final qn f37795c;

    public ln(qn qnVar, ej ejVar, fo foVar) {
        this.f37795c = qnVar;
        this.f37793a = ejVar;
        this.f37794b = foVar;
    }

    @Override
    public final void onError() {
        this.f37793a.c(false);
        this.f37795c.f39190a.presentFragment(this.f37794b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f37793a.c(false);
        this.f37795c.f39190a.presentFragment(this.f37794b);
    }
}
