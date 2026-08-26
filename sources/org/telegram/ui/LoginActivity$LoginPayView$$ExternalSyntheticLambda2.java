package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class LoginActivity$LoginPayView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final PollItemMenu$$ExternalSyntheticLambda14 f$0;

    public LoginActivity$LoginPayView$$ExternalSyntheticLambda2(PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14, int i) {
        this.$r8$classId = i;
        this.f$0 = pollItemMenu$$ExternalSyntheticLambda14;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda2(this.f$0, 0));
                break;
        }
    }
}
