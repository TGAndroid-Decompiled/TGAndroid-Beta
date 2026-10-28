package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f21975a = 1;
    public final MediaDataController f21976b;
    public final MessagesStorage.TopicKey f21977c;
    public final TLRPC.Message d;

    public z8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f21976b = mediaDataController;
        this.f21977c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f21975a) {
            case 0:
                this.f21976b.lambda$loadBotKeyboard$196(this.d, this.f21977c);
                return;
            default:
                this.f21976b.lambda$putBotKeyboard$201(this.f21977c, this.d);
                return;
        }
    }

    public z8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f21976b = mediaDataController;
        this.d = message;
        this.f21977c = topicKey;
    }
}
