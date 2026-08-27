package org.telegram.messenger;

public final class yh implements Runnable {

    public final int f22261a;

    public final SecretChatHelper f22262b;

    public final long f22263c;

    public yh(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f22261a = i10;
        this.f22262b = secretChatHelper;
        this.f22263c = j10;
    }

    @Override
    public final void run() {
        switch (this.f22261a) {
            case 0:
                this.f22262b.lambda$processDecryptedObject$12(this.f22263c);
                break;
            case 1:
                this.f22262b.lambda$processDecryptedObject$10(this.f22263c);
                break;
            case 2:
                this.f22262b.lambda$processDecryptedObject$11(this.f22263c);
                break;
            default:
                this.f22262b.lambda$processUpdateEncryption$3(this.f22263c);
                break;
        }
    }
}
