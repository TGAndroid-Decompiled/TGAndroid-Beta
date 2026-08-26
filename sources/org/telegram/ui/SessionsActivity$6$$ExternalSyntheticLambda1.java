package org.telegram.ui;

public final class SessionsActivity$6$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SessionsActivity.AnonymousClass6 f$0;

    public SessionsActivity$6$$ExternalSyntheticLambda1(SessionsActivity.AnonymousClass6 anonymousClass6, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass6;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processQr$3();
                break;
            default:
                this.f$0.lambda$didFindQr$0();
                break;
        }
    }
}
