package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f18314a;
    public final NotificationsController f18315b;
    public final int f18316c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f18314a = i11;
        this.f18315b = notificationsController;
        this.f18316c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18314a) {
            case 0:
                this.f18315b.lambda$processDialogsUpdateRead$29(this.f18316c);
                return;
            case 1:
                this.f18315b.lambda$removeDeletedHisoryFromNotifications$12(this.f18316c);
                return;
            case 2:
                this.f18315b.lambda$processSeenStoryReactions$14(this.f18316c);
                return;
            case 3:
                this.f18315b.lambda$processNewMessages$24(this.f18316c);
                return;
            case 4:
                this.f18315b.lambda$processNewMessages$26(this.f18316c);
                return;
            case 5:
                this.f18315b.lambda$setLastOnlineFromOtherDevice$5(this.f18316c);
                return;
            case 6:
                this.f18315b.lambda$processLoadedUnreadMessages$32(this.f18316c);
                return;
            default:
                this.f18315b.lambda$removeDeletedMessagesFromNotifications$9(this.f18316c);
                return;
        }
    }
}
