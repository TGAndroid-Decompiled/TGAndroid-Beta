package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19832a;
    public final MessagesController f19833b;
    public final TLRPC.Chat f19834c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19832a = i10;
        this.f19833b = messagesController;
        this.f19834c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19832a) {
            case 0:
                this.f19833b.lambda$addOrRemoveActiveVoiceChat$61(this.f19834c);
                return;
            case 1:
                this.f19833b.lambda$processLoadedDialogs$218(this.f19834c);
                return;
            case 2:
                this.f19833b.lambda$processUpdateArray$413(this.f19834c);
                return;
            case 3:
                this.f19833b.lambda$putChat$58(this.f19834c);
                return;
            case 4:
                this.f19833b.lambda$putChat$59(this.f19834c);
                return;
            default:
                this.f19833b.lambda$putChat$60(this.f19834c);
                return;
        }
    }
}
