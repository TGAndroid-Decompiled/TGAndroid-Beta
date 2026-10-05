package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19998a;
    public final MessagesController f19999b;
    public final TLRPC.Chat f20000c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19998a = i10;
        this.f19999b = messagesController;
        this.f20000c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19998a) {
            case 0:
                this.f19999b.lambda$addOrRemoveActiveVoiceChat$61(this.f20000c);
                return;
            case 1:
                this.f19999b.lambda$processLoadedDialogs$218(this.f20000c);
                return;
            case 2:
                this.f19999b.lambda$processUpdateArray$413(this.f20000c);
                return;
            case 3:
                this.f19999b.lambda$putChat$58(this.f20000c);
                return;
            case 4:
                this.f19999b.lambda$putChat$59(this.f20000c);
                return;
            default:
                this.f19999b.lambda$putChat$60(this.f20000c);
                return;
        }
    }
}
