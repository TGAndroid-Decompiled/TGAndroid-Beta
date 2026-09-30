package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18305a;
    public final MessagesController f18306b;
    public final TLRPC.Chat f18307c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18305a = i10;
        this.f18306b = messagesController;
        this.f18307c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                this.f18306b.lambda$addOrRemoveActiveVoiceChat$61(this.f18307c);
                return;
            case 1:
                this.f18306b.lambda$processLoadedDialogs$218(this.f18307c);
                return;
            case 2:
                this.f18306b.lambda$processUpdateArray$413(this.f18307c);
                return;
            case 3:
                this.f18306b.lambda$putChat$58(this.f18307c);
                return;
            case 4:
                this.f18306b.lambda$putChat$59(this.f18307c);
                return;
            default:
                this.f18306b.lambda$putChat$60(this.f18307c);
                return;
        }
    }
}
