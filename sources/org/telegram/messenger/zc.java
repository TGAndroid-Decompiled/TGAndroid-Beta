package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zc implements Utilities.Callback {
    public final int f21988a;
    public final MessagesController f21989b;

    public zc(MessagesController messagesController, int i10) {
        this.f21988a = i10;
        this.f21989b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21988a) {
            case 0:
                this.f21989b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f21989b.lambda$loadWebBrowserConfig$517((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f21989b.lambda$getAvailableEffects$502((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
