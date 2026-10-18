package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20256a;
    public final SecretChatHelper f20257b;
    public final TLRPC.EncryptedChat f20258c;

    public zh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20256a = i10;
        this.f20257b = secretChatHelper;
        this.f20258c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20256a) {
            case 0:
                this.f20257b.lambda$processAcceptedSecretChat$18(this.f20258c);
                return;
            case 1:
                this.f20257b.lambda$acceptSecretChat$21(this.f20258c);
                return;
            default:
                this.f20257b.lambda$applyPeerLayer$9(this.f20258c);
                return;
        }
    }
}
