package org.telegram.ui.Components;

public final class JoinToSendSettingsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final JoinToSendSettingsView f$0;
    public final boolean f$1;

    public JoinToSendSettingsView$$ExternalSyntheticLambda0(JoinToSendSettingsView joinToSendSettingsView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = joinToSendSettingsView;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$4(this.f$1);
                break;
            default:
                this.f$0.lambda$new$3(this.f$1);
                break;
        }
    }
}
