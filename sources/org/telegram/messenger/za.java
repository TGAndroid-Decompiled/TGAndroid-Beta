package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f18274a;
    public final MessagesController f18275b;
    public final TLRPC.Chat f18276c;

    public za(MessagesController messagesController, TLRPC.Chat chat, int i10) {
        this.f18274a = i10;
        this.f18275b = messagesController;
        this.f18276c = chat;
    }

    @Override
    public final void run() {
        switch (this.f18274a) {
            case 0:
                this.f18275b.lambda$addOrRemoveActiveVoiceChat$61(this.f18276c);
                return;
            case 1:
                this.f18275b.lambda$processLoadedDialogs$218(this.f18276c);
                return;
            case 2:
                this.f18275b.lambda$processUpdateArray$413(this.f18276c);
                return;
            case 3:
                this.f18275b.lambda$putChat$58(this.f18276c);
                return;
            case 4:
                this.f18275b.lambda$putChat$59(this.f18276c);
                return;
            default:
                this.f18275b.lambda$putChat$60(this.f18276c);
                return;
        }
    }
}
