package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f18308a;
    public final NotificationsController f18309b;
    public final int f18310c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f18308a = i11;
        this.f18309b = notificationsController;
        this.f18310c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18308a) {
            case 0:
                this.f18309b.lambda$processDialogsUpdateRead$29(this.f18310c);
                return;
            case 1:
                this.f18309b.lambda$removeDeletedHisoryFromNotifications$12(this.f18310c);
                return;
            case 2:
                this.f18309b.lambda$processSeenStoryReactions$14(this.f18310c);
                return;
            case 3:
                this.f18309b.lambda$processNewMessages$24(this.f18310c);
                return;
            case 4:
                this.f18309b.lambda$processNewMessages$26(this.f18310c);
                return;
            case 5:
                this.f18309b.lambda$setLastOnlineFromOtherDevice$5(this.f18310c);
                return;
            case 6:
                this.f18309b.lambda$processLoadedUnreadMessages$32(this.f18310c);
                return;
            default:
                this.f18309b.lambda$removeDeletedMessagesFromNotifications$9(this.f18310c);
                return;
        }
    }
}
