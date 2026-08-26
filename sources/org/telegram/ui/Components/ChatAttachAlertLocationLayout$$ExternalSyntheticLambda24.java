package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda24 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;
    public final TLRPC.TL_messageMediaVenue f$1;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda24(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
        this.f$1 = tL_messageMediaVenue;
    }

    @Override
    public final void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                chatAttachAlertLocationLayout.delegate.didSelectLocation(this.f$1, chatAttachAlertLocationLayout.locationType, z, i, 0L);
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                break;
            default:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout2 = this.f$0;
                chatAttachAlertLocationLayout2.delegate.didSelectLocation(this.f$1, chatAttachAlertLocationLayout2.locationType, z, i, 0L);
                chatAttachAlertLocationLayout2.parentAlert.dismiss(true);
                break;
        }
    }
}
