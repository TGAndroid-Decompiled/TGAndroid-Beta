package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zb implements Runnable {
    public final int f21986a;
    public final MessagesController f21987b;
    public final TLRPC.Dialog f21988c;

    public zb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f21986a = i10;
        this.f21987b = messagesController;
        this.f21988c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f21986a) {
            case 0:
                this.f21987b.lambda$checkLastDialogMessage$224(this.f21988c);
                return;
            case 1:
                this.f21987b.lambda$checkLastDialogMessage$225(this.f21988c);
                return;
            default:
                this.f21987b.lambda$checkLastDialogMessage$223(this.f21988c);
                return;
        }
    }
}
