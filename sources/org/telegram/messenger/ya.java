package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f19749a;
    public final MessagesController f19750b;
    public final TLRPC.Chat f19751c;

    public ya(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19749a = i10;
        this.f19750b = messagesController;
        this.f19751c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19749a) {
            case 0:
                this.f19750b.lambda$addOrRemoveActiveVoiceChat$61(this.f19751c);
                return;
            case 1:
                this.f19750b.lambda$processLoadedDialogs$218(this.f19751c);
                return;
            case 2:
                this.f19750b.lambda$processUpdateArray$413(this.f19751c);
                return;
            case 3:
                this.f19750b.lambda$putChat$58(this.f19751c);
                return;
            case 4:
                this.f19750b.lambda$putChat$59(this.f19751c);
                return;
            default:
                this.f19750b.lambda$putChat$60(this.f19751c);
                return;
        }
    }
}
