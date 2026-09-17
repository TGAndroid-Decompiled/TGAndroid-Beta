package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y9 implements Utilities.Callback2 {
    public final int f19720a;
    public final MessagesController f19721b;

    public y9(MessagesController messagesController, int i10) {
        this.f19720a = i10;
        this.f19721b = messagesController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19720a) {
            case 0:
                this.f19721b.lambda$updateWebBrowserSettings$517((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19721b.lambda$removeWebBrowserException$515((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19721b.lambda$addWebBrowserException$513((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                this.f19721b.lambda$loadStakeDiceInfo$507((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                this.f19721b.lambda$deleteReactionsFromMessage$132((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                this.f19721b.lambda$loadWebBrowserConfig$509((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                return;
            default:
                this.f19721b.lambda$clearAllWebBrowserExceptions$516((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
