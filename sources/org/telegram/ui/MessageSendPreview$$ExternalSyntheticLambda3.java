package org.telegram.ui;

public final class MessageSendPreview$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final MessageSendPreview f$0;

    public MessageSendPreview$$ExternalSyntheticLambda3(MessageSendPreview messageSendPreview, int i) {
        this.$r8$classId = i;
        this.f$0 = messageSendPreview;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismissInto$8();
                break;
            case 1:
                this.f$0.lambda$dismiss$10();
                break;
            case 2:
                this.f$0.lambda$dismiss$9();
                break;
            default:
                this.f$0.lambda$dismissInto$7();
                break;
        }
    }
}
