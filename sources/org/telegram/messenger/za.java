package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18295a;
    public final MessagesController f18296b;
    public final TLRPC.Chat f18297c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18295a = i10;
        this.f18296b = messagesController;
        this.f18297c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18295a) {
            case 0:
                this.f18296b.lambda$addOrRemoveActiveVoiceChat$61(this.f18297c);
                return;
            case 1:
                this.f18296b.lambda$processLoadedDialogs$218(this.f18297c);
                return;
            case 2:
                this.f18296b.lambda$processUpdateArray$413(this.f18297c);
                return;
            case 3:
                this.f18296b.lambda$putChat$58(this.f18297c);
                return;
            case 4:
                this.f18296b.lambda$putChat$59(this.f18297c);
                return;
            default:
                this.f18296b.lambda$putChat$60(this.f18297c);
                return;
        }
    }
}
