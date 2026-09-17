package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f19722a;
    public final MessagesController f19723b;
    public final TLRPC.Chat f19724c;

    public ya(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f19722a = i10;
        this.f19723b = messagesController;
        this.f19724c = chat;
    }

    @Override
    public final void run() {
        switch (this.f19722a) {
            case 0:
                this.f19723b.lambda$addOrRemoveActiveVoiceChat$61(this.f19724c);
                return;
            case 1:
                this.f19723b.lambda$processLoadedDialogs$218(this.f19724c);
                return;
            case 2:
                this.f19723b.lambda$processUpdateArray$413(this.f19724c);
                return;
            case 3:
                this.f19723b.lambda$putChat$58(this.f19724c);
                return;
            case 4:
                this.f19723b.lambda$putChat$59(this.f19724c);
                return;
            default:
                this.f19723b.lambda$putChat$60(this.f19724c);
                return;
        }
    }
}
