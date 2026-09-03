package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f20766a = 0;
    public final MediaDataController f20767b;
    public final TLRPC.Message f20768c;
    public final MessagesStorage.TopicKey d;

    public z6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f20767b = mediaDataController;
        this.d = topicKey;
        this.f20768c = message;
    }

    @Override
    public final void run() {
        switch (this.f20766a) {
            case 0:
                this.f20767b.lambda$putBotKeyboard$200(this.d, this.f20768c);
                return;
            default:
                this.f20767b.lambda$loadBotKeyboard$195(this.f20768c, this.d);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f20767b = mediaDataController;
        this.f20768c = message;
        this.d = topicKey;
    }
}
