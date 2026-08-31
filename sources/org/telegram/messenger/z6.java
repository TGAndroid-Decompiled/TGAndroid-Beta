package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f20764a = 0;
    public final MediaDataController f20765b;
    public final TLRPC.Message f20766c;
    public final MessagesStorage.TopicKey d;

    public z6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f20765b = mediaDataController;
        this.d = topicKey;
        this.f20766c = message;
    }

    @Override
    public final void run() {
        switch (this.f20764a) {
            case 0:
                this.f20765b.lambda$putBotKeyboard$200(this.d, this.f20766c);
                return;
            default:
                this.f20765b.lambda$loadBotKeyboard$195(this.f20766c, this.d);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f20765b = mediaDataController;
        this.f20766c = message;
        this.d = topicKey;
    }
}
