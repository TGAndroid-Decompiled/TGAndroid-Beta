package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zh implements Runnable {
    public final int f20250a;
    public final SecretChatHelper f20251b;
    public final TLRPC.EncryptedChat f20252c;

    public zh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20250a = i10;
        this.f20251b = secretChatHelper;
        this.f20252c = encryptedChat;
    }

    @Override
    public final void run() {
        switch (this.f20250a) {
            case 0:
                this.f20251b.lambda$processAcceptedSecretChat$18(this.f20252c);
                return;
            case 1:
                this.f20251b.lambda$acceptSecretChat$21(this.f20252c);
                return;
            default:
                this.f20251b.lambda$applyPeerLayer$9(this.f20252c);
                return;
        }
    }
}
