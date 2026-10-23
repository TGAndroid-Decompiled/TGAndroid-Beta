package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh implements RequestDelegate {
    public final int f20327a;
    public final SecretChatHelper f20328b;
    public final TLRPC.EncryptedChat f20329c;

    public zh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20327a = i10;
        this.f20328b = secretChatHelper;
        this.f20329c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20327a) {
            case 0:
                this.f20328b.lambda$acceptSecretChat$22(this.f20329c, tLObject, tL_error);
                return;
            default:
                this.f20328b.lambda$acceptSecretChat$23(this.f20329c, tLObject, tL_error);
                return;
        }
    }
}
