package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18054a;
    public final MessagesController f18055b;
    public final TLRPC.Chat f18056c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18054a = i10;
        this.f18055b = messagesController;
        this.f18056c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18054a) {
            case 0:
                this.f18055b.lambda$addOrRemoveActiveVoiceChat$61(this.f18056c);
                return;
            case 1:
                this.f18055b.lambda$processLoadedDialogs$218(this.f18056c);
                return;
            case 2:
                this.f18055b.lambda$processUpdateArray$413(this.f18056c);
                return;
            case 3:
                this.f18055b.lambda$putChat$58(this.f18056c);
                return;
            case 4:
                this.f18055b.lambda$putChat$59(this.f18056c);
                return;
            default:
                this.f18055b.lambda$putChat$60(this.f18056c);
                return;
        }
    }
}
