package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18051a;
    public final MessagesController f18052b;
    public final TLRPC.Chat f18053c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18051a = i10;
        this.f18052b = messagesController;
        this.f18053c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18051a) {
            case 0:
                this.f18052b.lambda$addOrRemoveActiveVoiceChat$61(this.f18053c);
                return;
            case 1:
                this.f18052b.lambda$processLoadedDialogs$218(this.f18053c);
                return;
            case 2:
                this.f18052b.lambda$processUpdateArray$413(this.f18053c);
                return;
            case 3:
                this.f18052b.lambda$putChat$58(this.f18053c);
                return;
            case 4:
                this.f18052b.lambda$putChat$59(this.f18053c);
                return;
            default:
                this.f18052b.lambda$putChat$60(this.f18053c);
                return;
        }
    }
}
