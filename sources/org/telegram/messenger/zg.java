package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f22373a;
    public final NotificationsController f22374b;
    public final int f22375c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f22373a = i11;
        this.f22374b = notificationsController;
        this.f22375c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22373a) {
            case 0:
                this.f22374b.lambda$processDialogsUpdateRead$29(this.f22375c);
                return;
            case 1:
                this.f22374b.lambda$removeDeletedHisoryFromNotifications$12(this.f22375c);
                return;
            case 2:
                this.f22374b.lambda$processSeenStoryReactions$14(this.f22375c);
                return;
            case 3:
                this.f22374b.lambda$processNewMessages$24(this.f22375c);
                return;
            case 4:
                this.f22374b.lambda$processNewMessages$26(this.f22375c);
                return;
            case 5:
                this.f22374b.lambda$setLastOnlineFromOtherDevice$5(this.f22375c);
                return;
            case 6:
                this.f22374b.lambda$processLoadedUnreadMessages$32(this.f22375c);
                return;
            default:
                this.f22374b.lambda$removeDeletedMessagesFromNotifications$9(this.f22375c);
                return;
        }
    }
}
