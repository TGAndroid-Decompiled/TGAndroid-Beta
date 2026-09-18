package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18063a;
    public final MessagesController f18064b;
    public final TLRPC.Chat f18065c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18063a = i10;
        this.f18064b = messagesController;
        this.f18065c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18063a) {
            case 0:
                this.f18064b.lambda$addOrRemoveActiveVoiceChat$61(this.f18065c);
                return;
            case 1:
                this.f18064b.lambda$processLoadedDialogs$218(this.f18065c);
                return;
            case 2:
                this.f18064b.lambda$processUpdateArray$413(this.f18065c);
                return;
            case 3:
                this.f18064b.lambda$putChat$58(this.f18065c);
                return;
            case 4:
                this.f18064b.lambda$putChat$59(this.f18065c);
                return;
            default:
                this.f18064b.lambda$putChat$60(this.f18065c);
                return;
        }
    }
}
