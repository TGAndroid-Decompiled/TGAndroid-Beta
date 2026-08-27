package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class za implements Runnable {

    public final int f22330a;

    public final MessagesController f22331b;

    public final TLRPC.Chat f22332c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f22330a = i10;
        this.f22331b = messagesController;
        this.f22332c = chat;
    }

    @Override
    public final void run() {
        switch (this.f22330a) {
            case 0:
                this.f22331b.lambda$addOrRemoveActiveVoiceChat$61(this.f22332c);
                break;
            case 1:
                this.f22331b.lambda$processLoadedDialogs$218(this.f22332c);
                break;
            case 2:
                this.f22331b.lambda$processUpdateArray$413(this.f22332c);
                break;
            case 3:
                this.f22331b.lambda$putChat$58(this.f22332c);
                break;
            case 4:
                this.f22331b.lambda$putChat$59(this.f22332c);
                break;
            default:
                this.f22331b.lambda$putChat$60(this.f22332c);
                break;
        }
    }
}
