package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20253a;
    public final NotificationsController f20254b;
    public final int f20255c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f20253a = i11;
        this.f20254b = notificationsController;
        this.f20255c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20253a) {
            case 0:
                this.f20254b.lambda$processSeenStoryReactions$15(this.f20255c);
                return;
            case 1:
                this.f20254b.lambda$setLastOnlineFromOtherDevice$6(this.f20255c);
                return;
            case 2:
                this.f20254b.lambda$processDialogsUpdateRead$30(this.f20255c);
                return;
            case 3:
                this.f20254b.lambda$processNewMessages$25(this.f20255c);
                return;
            case 4:
                this.f20254b.lambda$processNewMessages$27(this.f20255c);
                return;
            case 5:
                this.f20254b.lambda$removeDeletedMessagesFromNotifications$10(this.f20255c);
                return;
            case 6:
                this.f20254b.lambda$removeDeletedHisoryFromNotifications$13(this.f20255c);
                return;
            default:
                this.f20254b.lambda$processLoadedUnreadMessages$33(this.f20255c);
                return;
        }
    }
}
