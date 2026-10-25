package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class yd implements Runnable {
    public final int f21913a;
    public final MessagesController f21914b;
    public final TL_account.TL_webBrowserSettings f21915c;

    public yd(MessagesController messagesController, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f21913a = i10;
        this.f21914b = messagesController;
        this.f21915c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f21913a) {
            case 0:
                this.f21914b.lambda$loadWebBrowserConfig$513(this.f21915c);
                return;
            default:
                this.f21914b.lambda$loadWebBrowserConfig$515(this.f21915c);
                return;
        }
    }
}
