package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20246a;
    public final NotificationsController f20247b;
    public final int f20248c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20246a = i11;
        this.f20247b = notificationsController;
        this.f20248c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20246a) {
            case 0:
                this.f20247b.lambda$processSeenStoryReactions$15(this.f20248c);
                return;
            case 1:
                this.f20247b.lambda$setLastOnlineFromOtherDevice$6(this.f20248c);
                return;
            case 2:
                this.f20247b.lambda$processDialogsUpdateRead$30(this.f20248c);
                return;
            case 3:
                this.f20247b.lambda$processNewMessages$25(this.f20248c);
                return;
            case 4:
                this.f20247b.lambda$processNewMessages$27(this.f20248c);
                return;
            case 5:
                this.f20247b.lambda$removeDeletedMessagesFromNotifications$10(this.f20248c);
                return;
            case 6:
                this.f20247b.lambda$removeDeletedHisoryFromNotifications$13(this.f20248c);
                return;
            default:
                this.f20247b.lambda$processLoadedUnreadMessages$33(this.f20248c);
                return;
        }
    }
}
