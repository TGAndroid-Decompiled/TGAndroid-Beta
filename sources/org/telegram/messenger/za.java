package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18280a;
    public final MessagesController f18281b;
    public final TLRPC.Chat f18282c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18280a = i10;
        this.f18281b = messagesController;
        this.f18282c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                this.f18281b.lambda$addOrRemoveActiveVoiceChat$61(this.f18282c);
                return;
            case 1:
                this.f18281b.lambda$processLoadedDialogs$218(this.f18282c);
                return;
            case 2:
                this.f18281b.lambda$processUpdateArray$413(this.f18282c);
                return;
            case 3:
                this.f18281b.lambda$putChat$58(this.f18282c);
                return;
            case 4:
                this.f18281b.lambda$putChat$59(this.f18282c);
                return;
            default:
                this.f18281b.lambda$putChat$60(this.f18282c);
                return;
        }
    }
}
