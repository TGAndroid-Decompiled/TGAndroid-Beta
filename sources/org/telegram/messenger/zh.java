package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f20253a;
    public final SecretChatHelper f20254b;
    public final long f20255c;

    public zh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20253a = i10;
        this.f20254b = secretChatHelper;
        this.f20255c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20253a) {
            case 0:
                this.f20254b.lambda$processDecryptedObject$12(this.f20255c);
                return;
            case 1:
                this.f20254b.lambda$processDecryptedObject$10(this.f20255c);
                return;
            case 2:
                this.f20254b.lambda$processDecryptedObject$11(this.f20255c);
                return;
            default:
                this.f20254b.lambda$processUpdateEncryption$3(this.f20255c);
                return;
        }
    }
}
