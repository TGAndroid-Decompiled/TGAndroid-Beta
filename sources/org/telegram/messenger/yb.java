package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class yb implements Runnable {
    public final int f21904a;
    public final MessagesController f21905b;
    public final TLObject f21906c;

    public yb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f21904a = i10;
        this.f21905b = messagesController;
        this.f21906c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21904a) {
            case 0:
                this.f21905b.lambda$loadGlobalNotificationsSettings$201(this.f21906c);
                return;
            case 1:
                this.f21905b.lambda$reloadReactionsNotifySettings$203(this.f21906c);
                return;
            case 2:
                this.f21905b.lambda$loadSuggestedFilters$24(this.f21906c);
                return;
            case 3:
                this.f21905b.lambda$loadUnreadDialogs$362(this.f21906c);
                return;
            case 4:
                this.f21905b.lambda$loadHintDialogs$194(this.f21906c);
                return;
            case 5:
                this.f21905b.lambda$loadSignUpNotificationsSettings$205(this.f21906c);
                return;
            default:
                this.f21905b.lambda$getContentSettings$506(this.f21906c);
                return;
        }
    }
}
