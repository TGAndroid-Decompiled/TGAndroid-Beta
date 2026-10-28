package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yb implements Runnable {
    public final int f21904a;
    public final MessagesController f21905b;
    public final TLRPC.Dialog f21906c;

    public yb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f21904a = i10;
        this.f21905b = messagesController;
        this.f21906c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f21904a) {
            case 0:
                this.f21905b.lambda$checkLastDialogMessage$224(this.f21906c);
                return;
            case 1:
                this.f21905b.lambda$checkLastDialogMessage$225(this.f21906c);
                return;
            default:
                this.f21905b.lambda$checkLastDialogMessage$223(this.f21906c);
                return;
        }
    }
}
