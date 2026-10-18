package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f20163a;
    public final SecretChatHelper f20164b;
    public final long f20165c;

    public yh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20163a = i10;
        this.f20164b = secretChatHelper;
        this.f20165c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20163a) {
            case 0:
                this.f20164b.lambda$processDecryptedObject$12(this.f20165c);
                return;
            case 1:
                this.f20164b.lambda$processDecryptedObject$10(this.f20165c);
                return;
            case 2:
                this.f20164b.lambda$processDecryptedObject$11(this.f20165c);
                return;
            default:
                this.f20164b.lambda$processUpdateEncryption$3(this.f20165c);
                return;
        }
    }
}
