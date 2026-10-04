package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19993a;
    public final MessagesController f19994b;
    public final TLRPC.Chat f19995c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19993a = i10;
        this.f19994b = messagesController;
        this.f19995c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19993a) {
            case 0:
                this.f19994b.lambda$addOrRemoveActiveVoiceChat$61(this.f19995c);
                return;
            case 1:
                this.f19994b.lambda$processLoadedDialogs$218(this.f19995c);
                return;
            case 2:
                this.f19994b.lambda$processUpdateArray$413(this.f19995c);
                return;
            case 3:
                this.f19994b.lambda$putChat$58(this.f19995c);
                return;
            case 4:
                this.f19994b.lambda$putChat$59(this.f19995c);
                return;
            default:
                this.f19994b.lambda$putChat$60(this.f19995c);
                return;
        }
    }
}
