package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zc implements Utilities.Callback {
    public final int f20033a;
    public final MessagesController f20034b;

    public zc(MessagesController messagesController, int i10) {
        this.f20033a = i10;
        this.f20034b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20033a) {
            case 0:
                this.f20034b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f20034b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f20034b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
