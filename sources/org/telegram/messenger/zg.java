package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20023a;
    public final NotificationsController f20024b;
    public final int f20025c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20023a = i11;
        this.f20024b = notificationsController;
        this.f20025c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20023a) {
            case 0:
                this.f20024b.lambda$processDialogsUpdateRead$29(this.f20025c);
                return;
            case 1:
                this.f20024b.lambda$removeDeletedHisoryFromNotifications$12(this.f20025c);
                return;
            case 2:
                this.f20024b.lambda$processSeenStoryReactions$14(this.f20025c);
                return;
            case 3:
                this.f20024b.lambda$processNewMessages$24(this.f20025c);
                return;
            case 4:
                this.f20024b.lambda$processNewMessages$26(this.f20025c);
                return;
            case 5:
                this.f20024b.lambda$setLastOnlineFromOtherDevice$5(this.f20025c);
                return;
            case 6:
                this.f20024b.lambda$processLoadedUnreadMessages$32(this.f20025c);
                return;
            default:
                this.f20024b.lambda$removeDeletedMessagesFromNotifications$9(this.f20025c);
                return;
        }
    }
}
