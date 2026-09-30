package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f18331a;
    public final NotificationsController f18332b;
    public final int f18333c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f18331a = i11;
        this.f18332b = notificationsController;
        this.f18333c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18331a) {
            case 0:
                this.f18332b.lambda$processDialogsUpdateRead$29(this.f18333c);
                return;
            case 1:
                this.f18332b.lambda$removeDeletedHisoryFromNotifications$12(this.f18333c);
                return;
            case 2:
                this.f18332b.lambda$processSeenStoryReactions$14(this.f18333c);
                return;
            case 3:
                this.f18332b.lambda$processNewMessages$24(this.f18333c);
                return;
            case 4:
                this.f18332b.lambda$processNewMessages$26(this.f18333c);
                return;
            case 5:
                this.f18332b.lambda$setLastOnlineFromOtherDevice$5(this.f18333c);
                return;
            case 6:
                this.f18332b.lambda$processLoadedUnreadMessages$32(this.f18333c);
                return;
            default:
                this.f18332b.lambda$removeDeletedMessagesFromNotifications$9(this.f18333c);
                return;
        }
    }
}
