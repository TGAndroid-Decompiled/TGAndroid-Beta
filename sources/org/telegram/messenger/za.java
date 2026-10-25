package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f21983a;
    public final MessagesController f21984b;
    public final TLRPC.Chat f21985c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f21983a = i10;
        this.f21984b = messagesController;
        this.f21985c = chat;
    }

    @Override
    public final void run() {
        switch (this.f21983a) {
            case 0:
                this.f21984b.lambda$processLoadedDialogs$217(this.f21985c);
                return;
            case 1:
                this.f21984b.lambda$addOrRemoveActiveVoiceChat$60(this.f21985c);
                return;
            case 2:
                this.f21984b.lambda$processUpdateArray$418(this.f21985c);
                return;
            case 3:
                this.f21984b.lambda$putChat$57(this.f21985c);
                return;
            case 4:
                this.f21984b.lambda$putChat$58(this.f21985c);
                return;
            default:
                this.f21984b.lambda$putChat$59(this.f21985c);
                return;
        }
    }
}
