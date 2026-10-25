package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f21894a = 1;
    public final MediaDataController f21895b;
    public final MessagesStorage.TopicKey f21896c;
    public final TLRPC.Message d;

    public y8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f21895b = mediaDataController;
        this.f21896c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f21894a) {
            case 0:
                this.f21895b.lambda$loadBotKeyboard$196(this.d, this.f21896c);
                return;
            default:
                this.f21895b.lambda$putBotKeyboard$201(this.f21896c, this.d);
                return;
        }
    }

    public y8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f21895b = mediaDataController;
        this.d = message;
        this.f21896c = topicKey;
    }
}
