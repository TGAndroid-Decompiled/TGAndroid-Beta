package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18282a;
    public final MessagesController f18283b;
    public final TLRPC.Chat f18284c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18282a = i10;
        this.f18283b = messagesController;
        this.f18284c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18282a) {
            case 0:
                this.f18283b.lambda$addOrRemoveActiveVoiceChat$61(this.f18284c);
                return;
            case 1:
                this.f18283b.lambda$processLoadedDialogs$218(this.f18284c);
                return;
            case 2:
                this.f18283b.lambda$processUpdateArray$413(this.f18284c);
                return;
            case 3:
                this.f18283b.lambda$putChat$58(this.f18284c);
                return;
            case 4:
                this.f18283b.lambda$putChat$59(this.f18284c);
                return;
            default:
                this.f18283b.lambda$putChat$60(this.f18284c);
                return;
        }
    }
}
