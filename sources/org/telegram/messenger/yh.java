package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yh implements RequestDelegate {
    public final int f20186a;
    public final SecretChatHelper f20187b;
    public final TLRPC.EncryptedChat f20188c;

    public yh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20186a = i10;
        this.f20187b = secretChatHelper;
        this.f20188c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20186a) {
            case 0:
                this.f20187b.lambda$acceptSecretChat$22(this.f20188c, tLObject, tL_error);
                return;
            default:
                this.f20187b.lambda$acceptSecretChat$23(this.f20188c, tLObject, tL_error);
                return;
        }
    }
}
