package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GroupCallActivity$CallEncryptionCell$EncryptionCallDialog f$0;

    public GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2(GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity$CallEncryptionCell$EncryptionCallDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog = this.f$0;
                QrActivity.AnonymousClass2 anonymousClass2 = groupCallActivity$CallEncryptionCell$EncryptionCallDialog.cell;
                if (anonymousClass2 != null) {
                    anonymousClass2.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2(groupCallActivity$CallEncryptionCell$EncryptionCallDialog, 2), 16L);
                break;
            case 1:
                QrActivity.AnonymousClass2 anonymousClass3 = this.f$0.cell;
                if (anonymousClass3 != null) {
                    anonymousClass3.setVisibility(4);
                }
                break;
            default:
                this.f$0.lambda$dismiss$3();
                break;
        }
    }
}
