package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18040a;
    public final MessagesController f18041b;
    public final TLRPC.Chat f18042c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18040a = i10;
        this.f18041b = messagesController;
        this.f18042c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                this.f18041b.lambda$addOrRemoveActiveVoiceChat$61(this.f18042c);
                return;
            case 1:
                this.f18041b.lambda$processLoadedDialogs$218(this.f18042c);
                return;
            case 2:
                this.f18041b.lambda$processUpdateArray$413(this.f18042c);
                return;
            case 3:
                this.f18041b.lambda$putChat$58(this.f18042c);
                return;
            case 4:
                this.f18041b.lambda$putChat$59(this.f18042c);
                return;
            default:
                this.f18041b.lambda$putChat$60(this.f18042c);
                return;
        }
    }
}
