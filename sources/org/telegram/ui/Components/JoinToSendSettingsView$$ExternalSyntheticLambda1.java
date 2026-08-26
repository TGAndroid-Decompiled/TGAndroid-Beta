package org.telegram.ui.Components;

public final class JoinToSendSettingsView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final JoinToSendSettingsView f$0;
    public final boolean f$1;
    public final boolean f$2;

    public JoinToSendSettingsView$$ExternalSyntheticLambda1(JoinToSendSettingsView joinToSendSettingsView, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = joinToSendSettingsView;
        this.f$1 = z;
        this.f$2 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$new$1(this.f$1, this.f$2);
                break;
        }
    }
}
