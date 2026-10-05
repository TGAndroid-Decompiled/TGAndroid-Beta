package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20028a;
    public final NotificationsController f20029b;
    public final int f20030c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20028a = i11;
        this.f20029b = notificationsController;
        this.f20030c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20028a) {
            case 0:
                this.f20029b.lambda$processDialogsUpdateRead$29(this.f20030c);
                return;
            case 1:
                this.f20029b.lambda$removeDeletedHisoryFromNotifications$12(this.f20030c);
                return;
            case 2:
                this.f20029b.lambda$processSeenStoryReactions$14(this.f20030c);
                return;
            case 3:
                this.f20029b.lambda$processNewMessages$24(this.f20030c);
                return;
            case 4:
                this.f20029b.lambda$processNewMessages$26(this.f20030c);
                return;
            case 5:
                this.f20029b.lambda$setLastOnlineFromOtherDevice$5(this.f20030c);
                return;
            case 6:
                this.f20029b.lambda$processLoadedUnreadMessages$32(this.f20030c);
                return;
            default:
                this.f20029b.lambda$removeDeletedMessagesFromNotifications$9(this.f20030c);
                return;
        }
    }
}
