package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements RequestDelegate {
    public final int f20263a;
    public final SecretChatHelper f20264b;
    public final TLRPC.EncryptedChat f20265c;

    public zh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20263a = i10;
        this.f20264b = secretChatHelper;
        this.f20265c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20263a) {
            case 0:
                this.f20264b.lambda$acceptSecretChat$22(this.f20265c, tLObject, tL_error);
                return;
            default:
                this.f20264b.lambda$acceptSecretChat$23(this.f20265c, tLObject, tL_error);
                return;
        }
    }
}
