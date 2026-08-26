package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class PhotoViewer$$ExternalSyntheticLambda122 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda122(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$12(i);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$saveRichDocument$7(i);
                break;
            case 2:
                ((TopicsFragment.AnonymousClass15) this.f$0).lambda$onClick$0(i);
                break;
            case 3:
                ((ChannelAdminLogActivity) this.f$0).lambda$createView$11(i);
                break;
            case 4:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$10(i);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$onBlockContactClicked$49(i);
                break;
        }
    }
}
