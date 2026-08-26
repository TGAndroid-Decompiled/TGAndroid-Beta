package org.telegram.ui.Components;

public final class ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertContactsLayout.ShareSearchAdapter f$0;
    public final String f$1;
    public final int f$2;

    public ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda4(ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shareSearchAdapter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$search$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processSearch$2(this.f$1, this.f$2);
                break;
        }
    }
}
