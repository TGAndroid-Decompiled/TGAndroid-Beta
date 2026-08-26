package org.telegram.ui;

public final class GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GroupCallActivity.CallEncryptionCell.EncryptionCallDialog f$0;

    public GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0(GroupCallActivity.CallEncryptionCell.EncryptionCallDialog encryptionCallDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = encryptionCallDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$3();
                break;
            case 1:
                this.f$0.lambda$dismiss$4();
                break;
            default:
                this.f$0.lambda$show$2();
                break;
        }
    }
}
