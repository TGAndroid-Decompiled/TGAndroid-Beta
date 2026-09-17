package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f19850a;
    public final NotificationsController f19851b;
    public final int f19852c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f19850a = i11;
        this.f19851b = notificationsController;
        this.f19852c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19850a) {
            case 0:
                this.f19851b.lambda$processDialogsUpdateRead$29(this.f19852c);
                return;
            case 1:
                this.f19851b.lambda$removeDeletedHisoryFromNotifications$12(this.f19852c);
                return;
            case 2:
                this.f19851b.lambda$processSeenStoryReactions$14(this.f19852c);
                return;
            case 3:
                this.f19851b.lambda$processNewMessages$24(this.f19852c);
                return;
            case 4:
                this.f19851b.lambda$processNewMessages$26(this.f19852c);
                return;
            case 5:
                this.f19851b.lambda$setLastOnlineFromOtherDevice$5(this.f19852c);
                return;
            case 6:
                this.f19851b.lambda$processLoadedUnreadMessages$32(this.f19852c);
                return;
            default:
                this.f19851b.lambda$removeDeletedMessagesFromNotifications$9(this.f19852c);
                return;
        }
    }
}
