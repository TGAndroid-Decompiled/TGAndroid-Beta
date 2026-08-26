package org.telegram.ui;

public final class SessionsActivity$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final SessionsActivity f$0;
    public final boolean f$1;

    public SessionsActivity$$ExternalSyntheticLambda17(SessionsActivity sessionsActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = sessionsActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.loadSessions(this.f$1);
                break;
            default:
                this.f$0.loadSessions(this.f$1);
                break;
        }
    }
}
