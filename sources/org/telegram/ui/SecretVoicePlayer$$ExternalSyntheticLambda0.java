package org.telegram.ui;

public final class SecretVoicePlayer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SecretVoicePlayer f$0;

    public SecretVoicePlayer$$ExternalSyntheticLambda0(SecretVoicePlayer secretVoicePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretVoicePlayer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkTime();
                break;
            case 1:
                this.f$0.lambda$dismiss$7();
                break;
            case 2:
                this.f$0.lambda$dismiss$8();
                break;
            default:
                this.f$0.lambda$dismiss$6();
                break;
        }
    }
}
