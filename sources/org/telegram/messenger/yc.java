package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yc implements Utilities.Callback {
    public final int f20154a;
    public final MessagesController f20155b;

    public yc(MessagesController messagesController, int i10) {
        this.f20154a = i10;
        this.f20155b = messagesController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20154a) {
            case 0:
                this.f20155b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                return;
            case 1:
                this.f20155b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                return;
            default:
                this.f20155b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                return;
        }
    }
}
