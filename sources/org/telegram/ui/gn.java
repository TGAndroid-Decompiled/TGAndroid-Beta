package org.telegram.ui;

import org.telegram.messenger.MessagesController;
public final class gn implements MessagesController.MessagesLoadedCallback {
    public final aj f38056a;
    public final zn f38057b;
    public final ln f38058c;

    public gn(ln lnVar, aj ajVar, zn znVar) {
        this.f38058c = lnVar;
        this.f38056a = ajVar;
        this.f38057b = znVar;
    }

    @Override
    public final void onError() {
        this.f38056a.c(false);
        this.f38058c.f39634a.presentFragment(this.f38057b);
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        this.f38056a.c(false);
        this.f38058c.f39634a.presentFragment(this.f38057b);
    }
}
