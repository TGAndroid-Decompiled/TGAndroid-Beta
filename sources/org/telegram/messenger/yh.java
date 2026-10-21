package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yh implements RequestDelegate {
    public final int f20180a;
    public final SecretChatHelper f20181b;
    public final TLRPC.EncryptedChat f20182c;

    public yh(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f20180a = i10;
        this.f20181b = secretChatHelper;
        this.f20182c = encryptedChat;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20180a) {
            case 0:
                this.f20181b.lambda$acceptSecretChat$22(this.f20182c, tLObject, tL_error);
                return;
            default:
                this.f20181b.lambda$acceptSecretChat$23(this.f20182c, tLObject, tL_error);
                return;
        }
    }
}
