package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18289a;
    public final MessagesController f18290b;
    public final TLRPC.Chat f18291c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18289a = i10;
        this.f18290b = messagesController;
        this.f18291c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18289a) {
            case 0:
                this.f18290b.lambda$addOrRemoveActiveVoiceChat$61(this.f18291c);
                return;
            case 1:
                this.f18290b.lambda$processLoadedDialogs$218(this.f18291c);
                return;
            case 2:
                this.f18290b.lambda$processUpdateArray$413(this.f18291c);
                return;
            case 3:
                this.f18290b.lambda$putChat$58(this.f18291c);
                return;
            case 4:
                this.f18290b.lambda$putChat$59(this.f18291c);
                return;
            default:
                this.f18290b.lambda$putChat$60(this.f18291c);
                return;
        }
    }
}
