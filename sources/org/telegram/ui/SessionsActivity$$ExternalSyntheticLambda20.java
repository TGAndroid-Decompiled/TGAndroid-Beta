package org.telegram.ui;

public final class SessionsActivity$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final SessionsActivity f$0;
    public final boolean f$1;

    public SessionsActivity$$ExternalSyntheticLambda20(SessionsActivity sessionsActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadSessions$24(this.f$1);
                break;
            default:
                this.f$0.lambda$loadSessions$21(this.f$1);
                break;
        }
    }
}
