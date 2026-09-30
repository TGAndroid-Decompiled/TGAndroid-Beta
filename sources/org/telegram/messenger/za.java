package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18290a;
    public final MessagesController f18291b;
    public final TLRPC.Chat f18292c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18290a = i10;
        this.f18291b = messagesController;
        this.f18292c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18290a) {
            case 0:
                this.f18291b.lambda$addOrRemoveActiveVoiceChat$61(this.f18292c);
                return;
            case 1:
                this.f18291b.lambda$processLoadedDialogs$218(this.f18292c);
                return;
            case 2:
                this.f18291b.lambda$processUpdateArray$413(this.f18292c);
                return;
            case 3:
                this.f18291b.lambda$putChat$58(this.f18292c);
                return;
            case 4:
                this.f18291b.lambda$putChat$59(this.f18292c);
                return;
            default:
                this.f18291b.lambda$putChat$60(this.f18292c);
                return;
        }
    }
}
