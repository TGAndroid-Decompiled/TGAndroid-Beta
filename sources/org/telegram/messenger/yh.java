package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f20171a;
    public final SecretChatHelper f20172b;
    public final long f20173c;

    public yh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20171a = i10;
        this.f20172b = secretChatHelper;
        this.f20173c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20171a) {
            case 0:
                this.f20172b.lambda$processDecryptedObject$12(this.f20173c);
                return;
            case 1:
                this.f20172b.lambda$processDecryptedObject$10(this.f20173c);
                return;
            case 2:
                this.f20172b.lambda$processDecryptedObject$11(this.f20173c);
                return;
            default:
                this.f20172b.lambda$processUpdateEncryption$3(this.f20173c);
                return;
        }
    }
}
