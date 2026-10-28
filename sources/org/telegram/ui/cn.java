package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class cn implements MessagesController.MessagesLoadedCallback {
    public final vi f38392a;
    public final wn f38393b;
    public final hn f38394c;

    public cn(hn hnVar, vi viVar, wn wnVar) {
        this.f38394c = hnVar;
        this.f38392a = viVar;
        this.f38393b = wnVar;
    }

    @Override
    public final void onError() {
        this.f38392a.c(false);
        this.f38394c.f39938a.presentFragment(this.f38393b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38392a.c(false);
        this.f38394c.f39938a.presentFragment(this.f38393b);
    }
}
