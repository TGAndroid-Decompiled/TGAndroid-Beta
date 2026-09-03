package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f19086a = 0;
    public final MediaDataController f19087b;
    public final TLRPC.Message f19088c;
    public final MessagesStorage.TopicKey d;

    public z6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19087b = mediaDataController;
        this.d = topicKey;
        this.f19088c = message;
    }

    @Override
    public final void run() {
        switch (this.f19086a) {
            case 0:
                this.f19087b.lambda$putBotKeyboard$200(this.d, this.f19088c);
                return;
            default:
                this.f19087b.lambda$loadBotKeyboard$195(this.f19088c, this.d);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19087b = mediaDataController;
        this.f19088c = message;
        this.d = topicKey;
    }
}
