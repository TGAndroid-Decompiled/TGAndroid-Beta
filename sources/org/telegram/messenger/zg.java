package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20247a;
    public final NotificationsController f20248b;
    public final int f20249c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20247a = i11;
        this.f20248b = notificationsController;
        this.f20249c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20247a) {
            case 0:
                this.f20248b.lambda$processSeenStoryReactions$15(this.f20249c);
                return;
            case 1:
                this.f20248b.lambda$setLastOnlineFromOtherDevice$6(this.f20249c);
                return;
            case 2:
                this.f20248b.lambda$processDialogsUpdateRead$30(this.f20249c);
                return;
            case 3:
                this.f20248b.lambda$processNewMessages$25(this.f20249c);
                return;
            case 4:
                this.f20248b.lambda$processNewMessages$27(this.f20249c);
                return;
            case 5:
                this.f20248b.lambda$removeDeletedMessagesFromNotifications$10(this.f20249c);
                return;
            case 6:
                this.f20248b.lambda$removeDeletedHisoryFromNotifications$13(this.f20249c);
                return;
            default:
                this.f20248b.lambda$processLoadedUnreadMessages$33(this.f20249c);
                return;
        }
    }
}
