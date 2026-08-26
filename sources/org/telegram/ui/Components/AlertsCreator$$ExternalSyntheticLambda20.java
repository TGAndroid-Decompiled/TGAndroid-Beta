package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class AlertsCreator$$ExternalSyntheticLambda20 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public AlertsCreator$$ExternalSyntheticLambda20(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            case 1:
                AlertsCreator.lambda$createBotLaunchAlert$54(this.f$0, dialogInterface);
                break;
            case 2:
                AlertsCreator.lambda$createDeleteMessagesAlert$236(this.f$0, dialogInterface);
                break;
            case 3:
                AlertsCreator.lambda$createDeleteMessagesAlert$224(this.f$0, dialogInterface);
                break;
            default:
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$34(this.f$0, dialogInterface);
                break;
        }
    }
}
