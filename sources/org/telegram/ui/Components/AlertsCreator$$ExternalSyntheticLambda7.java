package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.AlertDialog;

public final class AlertsCreator$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public AlertsCreator$$ExternalSyntheticLambda7(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            case 1:
                this.f$0.run();
                break;
            case 2:
                AlertsCreator.lambda$createBotLaunchAlert$53(this.f$0, alertDialog, i);
                break;
            case 3:
                this.f$0.run();
                break;
            case 4:
                AlertsCreator.lambda$createImportDialogAlert$51(this.f$0, alertDialog, i);
                break;
            case 5:
                AlertsCreator.lambda$showDiscardTopicDialog$96(this.f$0, alertDialog, i);
                break;
            case 6:
                this.f$0.run();
                break;
            case 7:
                this.f$0.run();
                break;
            case 8:
                AlertsCreator.lambda$showBanGroupCreatorFromCommunityConfirmAlert$32(this.f$0, alertDialog, i);
                break;
            case 9:
                AlertsCreator.lambda$createSimpleAlert$12(this.f$0, alertDialog, i);
                break;
            case 10:
                AlertsCreator.lambda$createSimpleConfirmAlert$30(this.f$0, alertDialog, i);
                break;
            default:
                AlertsCreator.lambda$showAddLinkToPoll$21(this.f$0, alertDialog, i);
                break;
        }
    }
}
