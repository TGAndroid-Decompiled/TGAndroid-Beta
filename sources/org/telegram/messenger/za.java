package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19983a;
    public final MessagesController f19984b;
    public final TLRPC.Chat f19985c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19983a = i10;
        this.f19984b = messagesController;
        this.f19985c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19983a) {
            case 0:
                this.f19984b.lambda$addOrRemoveActiveVoiceChat$61(this.f19985c);
                return;
            case 1:
                this.f19984b.lambda$processLoadedDialogs$218(this.f19985c);
                return;
            case 2:
                this.f19984b.lambda$processUpdateArray$413(this.f19985c);
                return;
            case 3:
                this.f19984b.lambda$putChat$58(this.f19985c);
                return;
            case 4:
                this.f19984b.lambda$putChat$59(this.f19985c);
                return;
            default:
                this.f19984b.lambda$putChat$60(this.f19985c);
                return;
        }
    }
}
