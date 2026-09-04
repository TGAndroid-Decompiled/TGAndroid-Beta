package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19805a;
    public final MessagesController f19806b;
    public final TLRPC.Chat f19807c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19805a = i10;
        this.f19806b = messagesController;
        this.f19807c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19805a) {
            case 0:
                this.f19806b.lambda$addOrRemoveActiveVoiceChat$61(this.f19807c);
                return;
            case 1:
                this.f19806b.lambda$processLoadedDialogs$218(this.f19807c);
                return;
            case 2:
                this.f19806b.lambda$processUpdateArray$413(this.f19807c);
                return;
            case 3:
                this.f19806b.lambda$putChat$58(this.f19807c);
                return;
            case 4:
                this.f19806b.lambda$putChat$59(this.f19807c);
                return;
            default:
                this.f19806b.lambda$putChat$60(this.f19807c);
                return;
        }
    }
}
