package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19984a;
    public final MessagesController f19985b;
    public final TLRPC.Chat f19986c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19984a = i10;
        this.f19985b = messagesController;
        this.f19986c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                this.f19985b.lambda$addOrRemoveActiveVoiceChat$61(this.f19986c);
                return;
            case 1:
                this.f19985b.lambda$processLoadedDialogs$218(this.f19986c);
                return;
            case 2:
                this.f19985b.lambda$processUpdateArray$413(this.f19986c);
                return;
            case 3:
                this.f19985b.lambda$putChat$58(this.f19986c);
                return;
            case 4:
                this.f19985b.lambda$putChat$59(this.f19986c);
                return;
            default:
                this.f19985b.lambda$putChat$60(this.f19986c);
                return;
        }
    }
}
