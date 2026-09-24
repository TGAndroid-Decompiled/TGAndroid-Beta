package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f18300a;
    public final NotificationsController f18301b;
    public final int f18302c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f18300a = i11;
        this.f18301b = notificationsController;
        this.f18302c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18300a) {
            case 0:
                this.f18301b.lambda$processDialogsUpdateRead$29(this.f18302c);
                return;
            case 1:
                this.f18301b.lambda$removeDeletedHisoryFromNotifications$12(this.f18302c);
                return;
            case 2:
                this.f18301b.lambda$processSeenStoryReactions$14(this.f18302c);
                return;
            case 3:
                this.f18301b.lambda$processNewMessages$24(this.f18302c);
                return;
            case 4:
                this.f18301b.lambda$processNewMessages$26(this.f18302c);
                return;
            case 5:
                this.f18301b.lambda$setLastOnlineFromOtherDevice$5(this.f18302c);
                return;
            case 6:
                this.f18301b.lambda$processLoadedUnreadMessages$32(this.f18302c);
                return;
            default:
                this.f18301b.lambda$removeDeletedMessagesFromNotifications$9(this.f18302c);
                return;
        }
    }
}
