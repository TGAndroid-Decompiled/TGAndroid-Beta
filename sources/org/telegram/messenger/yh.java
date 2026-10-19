package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f20166a;
    public final SecretChatHelper f20167b;
    public final long f20168c;

    public yh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f20166a = i10;
        this.f20167b = secretChatHelper;
        this.f20168c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20166a) {
            case 0:
                this.f20167b.lambda$processDecryptedObject$12(this.f20168c);
                return;
            case 1:
                this.f20167b.lambda$processDecryptedObject$10(this.f20168c);
                return;
            case 2:
                this.f20167b.lambda$processDecryptedObject$11(this.f20168c);
                return;
            default:
                this.f20167b.lambda$processUpdateEncryption$3(this.f20168c);
                return;
        }
    }
}
