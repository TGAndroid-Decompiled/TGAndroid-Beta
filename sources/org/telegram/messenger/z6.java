package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f19111a = 0;
    public final MediaDataController f19112b;
    public final TLRPC.Message f19113c;
    public final MessagesStorage.TopicKey d;

    public z6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19112b = mediaDataController;
        this.d = topicKey;
        this.f19113c = message;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                this.f19112b.lambda$putBotKeyboard$200(this.d, this.f19113c);
                return;
            default:
                this.f19112b.lambda$loadBotKeyboard$195(this.f19113c, this.d);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19112b = mediaDataController;
        this.f19113c = message;
        this.d = topicKey;
    }
}
